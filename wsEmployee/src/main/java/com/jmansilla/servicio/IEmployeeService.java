package com.jmansilla.servicio;

import com.jmansilla.modelo.Employee;

public interface IEmployeeService {
	public Employee insertarEmpleado(Employee newEmployee);
	
	public long getTotalEmpleados();
	
	public void eliminarEmpleado(Employee empleado);
	
	public void eliminarTodosEmpleados();
	
	public Employee getEmpleado(String name, int edad);
}
