package edu.mum.cs.ormexample.repository;

import edu.mum.cs.ormexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    @Query("select e from Employee e where e.number = :number")
    public List<Employee> locateOneEmployeeByHisNumber(String number);

    public List<Employee> getEmployeeByNumber(String number);

}
