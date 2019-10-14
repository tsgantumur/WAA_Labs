package mum.edu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import mum.edu.domain.Employee;
 
@RestController
public class EmployeeController {

 @RequestMapping(value = "/", method = RequestMethod.GET)
 public String showForm() {

     return "employee";
 }

 @PostMapping("/")
 public Employee saveEmployee(@Valid @RequestBody Employee employee) {

     System.out.println(employee);

     return employee;
 }
	
}
