package mum.edu.controller;

import javax.validation.Valid;

import mum.edu.exception.EmployeeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import mum.edu.domain.Employee;

@Controller
@RequestMapping({"/", "/employee"})
public class EmployeeController {

 @RequestMapping(value = "/", method = RequestMethod.GET)
 public String showForm() {

     return "employee";
 }

 @PostMapping("/add")
 public @ResponseBody Employee saveEmployee(@Valid @RequestBody Employee employee) throws EmployeeException {

     if(employee.getFirstName().equals("Ex")) {
         throw new EmployeeException(employee.getEmail(), "Unable to save employee with email: ");
     }
     System.out.println(employee);

     return employee;
 }

}
