package edu.mum.cs.ormexample.service;

import edu.mum.cs.ormexample.model.Employee;
import edu.mum.cs.ormexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> locateOneEmployeeByHisNumber(String number) {

        return employeeRepository.locateOneEmployeeByHisNumber(number);
    }

    @Override
    public Iterable<Employee> findAll() {

        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public List<Employee> getEmployeesByNumber(String number) {
        return employeeRepository.getEmployeeByNumber(number);
    }
}
