package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepository;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepository;
	
	public Employee saveEmployee(@RequestBody Employee employee)
	{
		return empRepository.save(employee);
	}
	
	public Employee findByEmployeeId(long employeeId)
	{
		return empRepository.getById(employeeId);
	}

}
