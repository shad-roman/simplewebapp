package com.mastery.java.task.service;

import com.mastery.java.task.dao.EmployeeDao;
import com.mastery.java.task.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;
    public Employee findById (Integer id){
        return employeeDao.findById(id);
    }

    public List<Employee> findAll (){ return employeeDao.findAll();}

    public Employee findByLastname(String lastname) { return employeeDao.findByLastname (lastname);}

    public List<Employee> findByDepartmentId(Integer departmentId) { return employeeDao.findByDepartmentId(departmentId);}

    public void deleteEmployee(String lastname) { employeeDao.deleteEmployee(lastname);}

    public void newEmployee(Employee newEmployee) { employeeDao.newEmployee(newEmployee); }

    public void updateEmployee(Employee employee, String lastname) { employeeDao.updateEmployee(employee, lastname);
    }
}

