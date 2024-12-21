package com.example.Employee_Management_System.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Employee_Management_System.entity.Employee;
import com.example.Employee_Management_System.exception.EmployeeNotFoundById;
import com.example.Employee_Management_System.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	public List<Employee> displayEmployee() {
		return employeeRepository.findAll();
		
	}

	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

	public Employee findEmployee(int employeeId) {
		return employeeRepository.findById(employeeId).orElseThrow(()->new EmployeeNotFoundById("Employee is not found","display-employee"));
	}

	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	

}
