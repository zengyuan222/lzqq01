package com.wenkong.service.impl;

import com.wenkong.mapping.EmployeeTwoMapping;
import com.wenkong.pojo.EmployeeTwo;
import com.wenkong.pojo.TimeQuq;
import com.wenkong.service.EmployeeTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("employeeTwoServices")
public class EmployeeTwoServiceImpl implements EmployeeTwoService {
    @Autowired
    private EmployeeTwoMapping employeeTwoMapping;
    @Override
    public void add(EmployeeTwo employeeTwo) {
        employeeTwoMapping.add(employeeTwo);
    }

    @Override
    public List<EmployeeTwo> findAll() {
        return employeeTwoMapping.findAll();
    }
    //日期查询
    @Override
    public List<EmployeeTwo> findByDate(String creationtime){
        return employeeTwoMapping.findByDate(creationtime);
    }

    //姓名查询
    @Override
    public List<EmployeeTwo> findByName(String name) {
        return employeeTwoMapping.findByName(name);
    }
    public List<EmployeeTwo> getEmpts(TimeQuq timeQuq){
        return employeeTwoMapping.getEmpts(timeQuq);
    }

}
