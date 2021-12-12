package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

import java.util.stream.Collectors;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();


    static 
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }

    public Employee getEmployeeById(int id)
    {
        Employee employee = list.getEmployeeList().stream().filter(a -> a.getId() == id).collect(Collectors.toList()).get(0);
        return employee;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
