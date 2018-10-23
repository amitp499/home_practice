package com.ClassRoom_23_Oct_2018.HrmsApplication;

import java.util.List;

public interface empInterface {

    void add(Employee employee);
    Employee findById(int bookId);
    List<Employee> findByfirstName(String firstName);
}