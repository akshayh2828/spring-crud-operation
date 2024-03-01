package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.ResorceNotFound;

import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceImple
{
    @Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp=empRepo.save(employee);
		return emp;
		
	}

	@Override
	public List<Employee> getAllEmployee() 
	{
		return empRepo.findAll();
		
	}

	@Override
	public Employee findEmployeeById(Long employee) throws ResorceNotFound 
	{
		if(empRepo.findById(employee).isEmpty())
		{
			System.out.println("jaja");
			throw new ResorceNotFound("employee does not exit");
		}
	Employee emp=	empRepo.findById(employee).get();
	return emp;
		
	}

	@Override
	public void deleteById(Long id) 
	{
		
		 empRepo.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee emp) {
	Employee e=	empRepo.save(emp);
		return e;
	}
	

}
