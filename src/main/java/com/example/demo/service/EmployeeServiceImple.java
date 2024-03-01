package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.exception.ResorceNotFound;


public interface EmployeeServiceImple 
{

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee findEmployeeById(Long employee) throws ResorceNotFound;

	public void deleteById(Long id);

	public Employee updateEmployee(Employee emp);

	

}
