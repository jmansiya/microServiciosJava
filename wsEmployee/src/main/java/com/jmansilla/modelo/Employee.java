package com.jmansilla.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.querydsl.core.annotations.QueryProjection;

/**
 * 
 * @author josemansilla
 *
 * Clase que encapsula la información de un empleado.
 */

@Document(collection = "employee")
public class Employee {
	@Id
	private String id;
	private String name;
	private int edad;
	
	public Employee(String name, int edad){
		this.name = name;
		this.edad = edad;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString(){
		String mensaje = "";
		mensaje = "ID: " + getId() + "\n" + 
				"Nombre: " + getName() + "n" + 
				"Edad: " + getEdad();
		
		return mensaje;
	}
}
