package com.jmansilla.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.jmansilla.modelo.Employee;
import com.jmansilla.modelo.QEmployee;
import com.jmansilla.repositorio.EmployeeRepository;
import com.jmansilla.servicio.IEmployeeService;
import com.querydsl.core.types.Predicate;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	public EmployeeRepository repositorioEmployee;
	
	public Employee insertarEmpleado(Employee newEmployee){
		newEmployee = repositorioEmployee.insert(newEmployee);
		
		return newEmployee;
	}
	
	public long getTotalEmpleados(){
		long total = repositorioEmployee.count();
		
		return total;
	}
	
	public void eliminarEmpleado(Employee empleado){
		repositorioEmployee.delete(empleado);
	}
	
	public void eliminarTodosEmpleados(){
		repositorioEmployee.deleteAll();
	}
	
	public Employee getEmpleado(String name, int edad){
		QEmployee empleado = QEmployee.employee;
		
		Predicate predicado = empleado.name.eq(name)
				.and(empleado.edad.eq(edad));
		
		return repositorioEmployee.findOne(predicado);
	}
	
}
