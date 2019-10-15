package edu.mum.cs.ormexample.service;

import edu.mum.cs.ormexample.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Iterable<Employee> findAll();
    public List<Employee> locateOneEmployeeByHisNumber(String number);
    public void save(Employee e);

    public List<Employee> getEmployeesByNumber(String number);
}
