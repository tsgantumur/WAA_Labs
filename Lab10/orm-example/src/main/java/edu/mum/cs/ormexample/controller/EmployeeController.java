package edu.mum.cs.ormexample.controller;

import edu.mum.cs.ormexample.model.Employee;
import edu.mum.cs.ormexample.repository.EmployeeRepository;
import edu.mum.cs.ormexample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String add(@ModelAttribute Employee emp){
        return "employeeForm";
    }

    @PostMapping("/")
    public String save(Employee e){
        employeeService.save(e);
        return "redirect:/success";
    }

    @GetMapping("/success")
    public String success(Model model){
        model.addAttribute("emps",  employeeService.findAll());
        return "employeeList";
    }

    @GetMapping("/display")
    public String display(@RequestParam(required = false, defaultValue = "") String number,Model model){
        if(!"".equals(number)){
            model.addAttribute("emps", employeeService.getEmployeesByNumber(number));
        }else{
            model.addAttribute("emps",  employeeService.findAll());
        }
        return "employeeList";
    }

    @GetMapping("/display2/number/{num}")
    public String display2(@PathVariable(required = false) String num, Model model){
        if(!"".equals(num)){
            model.addAttribute("emps", employeeService.locateOneEmployeeByHisNumber(num));
        } else{
            model.addAttribute("emps",  employeeService.findAll());
        }
        return "employeeList";
    }
}
