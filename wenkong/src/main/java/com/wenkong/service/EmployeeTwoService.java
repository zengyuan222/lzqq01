package com.wenkong.service;

import com.wenkong.pojo.EmployeeTwo;
import com.wenkong.pojo.TimeQuq;

import java.util.List;


/**
 * 员工
 */
public interface EmployeeTwoService {
    void add(EmployeeTwo employeeTwo);
    List<EmployeeTwo> findAll();
    List<EmployeeTwo> findByDate(String creationtime);
    List<EmployeeTwo> findByName(String name);
    List<EmployeeTwo> getEmpts(TimeQuq timeQuq);

}
