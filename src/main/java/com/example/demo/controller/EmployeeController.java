package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exception.ResorceNotFound;

import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImple;

@RestController
@RequestMapping("/code")
public class EmployeeController 
{
	@Autowired
	private EmployeeServiceImple empService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
	{
		Employee empSave=empService.addEmployee(employee);
		return new ResponseEntity<Employee>(empSave,HttpStatus.CREATED);
		
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployee()
	{
		List<Employee>e=empService.getAllEmployee();
		return new  ResponseEntity<List<Employee>>(e,HttpStatus.OK);
		
	}
	@GetMapping("/get/{employee}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long employee) throws ResorceNotFound
	{
		Employee e=empService.findEmployeeById(employee);
		return new ResponseEntity<Employee>(e,HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id)
	{
		empService.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmploye(@RequestBody Employee emp)
	{
		 Employee updateEmployee=   empService.updateEmployee(emp);
		return new ResponseEntity<Employee>(updateEmployee,HttpStatus.CREATED);
		
	}
//	public ResponseEntity<Employee> updateEmployeeByPatch(@RequestBody Long id , Map<Long, String>filed)
//	{
//		 Employee e= empService.findById(id).get();
//	}
	
	

}
