package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmpService;

@RestController
@RequestMapping("/")
public class EmpController {
	
@Autowired(required=true)
private EmpService empService;

@PostMapping(path = "/")
public Employee saveEmployee (@RequestBody Employee employee)
{
	return empService.saveEmployee(employee);
}

@GetMapping(path="/{id}")
public Employee findByEmployeeId(@PathVariable("id") Long employeeId)
{
	return empService.findByEmployeeId(employeeId);
}
}
