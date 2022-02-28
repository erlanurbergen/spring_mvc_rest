package com.erlankarabaliyev.spring.rest.service;


import com.erlankarabaliyev.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployyees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);


}
