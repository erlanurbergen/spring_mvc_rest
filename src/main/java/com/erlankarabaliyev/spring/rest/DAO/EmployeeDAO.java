package com.erlankarabaliyev.spring.rest.DAO;

import com.erlankarabaliyev.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployyees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
