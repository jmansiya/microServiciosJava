package net.microservice.greeting.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import net.microservice.greeting.model.User;
import net.microservice.greeting.model.exception.UserNotFoundException;
import net.microservice.greeting.repositories.UserRepository;
import net.microservice.greeting.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repositorioUsuario;
	
	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> listUsuarios = repositorioUsuario.findAll();
		return listUsuarios;
	}

	@Override
	public User findByUserId(String userID) {
		// TODO Auto-generated method stub
		User user = repositorioUsuario.findByUserId(userID);
		if (user != null){
			log.debug("Existe el usuario para el user ID : " + userID + " - " + user.getName());
			
			return user;
		} else {
			throw new UserNotFoundException(userID);
		}

	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		Assert.notNull(user);
		return repositorioUsuario.save(user);
	}


	@Override
	public void deleteUser(User user) {
		repositorioUsuario.delete(user);
	}
	

}
