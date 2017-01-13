package net.microservice.greeting.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.microservice.greeting.model.User;
import net.microservice.greeting.model.exception.UserNotFoundException;
import net.microservice.greeting.service.UserService;

@RestController
@RequestMapping("users")
@Api(value="Micro Servicio USER",  description="Esta API es una operación CRUD para usuarios.")
public class UsersController {
	
	private static final Logger log = LoggerFactory.getLogger(UsersController.class);
	
	private final UserService servicioUsuario;
	private User user;
	
	@Autowired
	public UsersController(UserService servicioUsuario) {
		super();
		this.servicioUsuario = servicioUsuario;
	}

	@RequestMapping(value="/{userId}", method= RequestMethod.GET)
	@ApiOperation(value="Búsqueda de un usuario", notes="Retorna un usuario por ID")
	public ResponseEntity<User> userById(@PathVariable String userId) throws UserNotFoundException{
		log.info("Get User By ID : " + userId);
		try{
			user = servicioUsuario.findByUserId(userId);
		} catch (UserNotFoundException e) {
			user = null;
		} 
		
		return ResponseEntity.ok(user);
	} 
	
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value="Búsqueda de todos los usuarios", notes="Devuelve el listado completo de todos los usuarios del sistema.")
	public ResponseEntity<List<User>> getUsers(){
		log.info("Get todos los usuarios.");
		return ResponseEntity.ok(servicioUsuario.findAll());
	}
	
	@RequestMapping(value="/{userId}", method=RequestMethod.DELETE)
	@ApiOperation(value="Elimina un usuario.", notes="Elimina un usuario determinado por su ID")
	public ResponseEntity<Void> deleteUsuario(@PathVariable String userId){
		log.info("Delete usuario : " + userId);
		
		User user = servicioUsuario.findByUserId(userId);
		
		servicioUsuario.deleteUser(user);
		
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ApiOperation(value="Crea un usuario", notes="Creamos un usuario")
	public ResponseEntity<User> insertar(@RequestBody @Valid User user){
		log.info("Insertar usuario : " + user.getName());
		
		return ResponseEntity.ok(servicioUsuario.saveUser(user));
	}
	
	
}


