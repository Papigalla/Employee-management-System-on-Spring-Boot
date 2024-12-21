package com.example.Employee_Management_System.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Employee_Management_System.entity.Employee;
import com.example.Employee_Management_System.service.EmployeeService;

@Controller
public class EmployeeController {
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping("/save-employee")
	public String add(Employee employee)
	{
		employeeService.addEmployee(employee);
		return"index.jsp";
		
	}
	@GetMapping("/display-employee")
	public String display(Model model)
	{
	    List<Employee> employee=employeeService.displayEmployee();
	    model.addAttribute("display", employee);
	    return "display.jsp";
	}
	@GetMapping("/delete-employee")
	public String delete(@RequestParam("employee_id") int employeeId)
	{
		employeeService.deleteEmployee(employeeId);
		return "redirect:/display-employee";
	}
	@GetMapping("/update-employee")
	public String findId(@RequestParam("employee_id") int employeeId,Model model)
	{
		Employee employee=employeeService.findEmployee(employeeId);
		model.addAttribute("update", employee);
		return "update.jsp";
	}
	@PostMapping("/update")
	public String update(@ModelAttribute Employee employee)
	{
		employeeService.updateEmployee(employee);
		return"redirect:/display-employee";
	}

}
