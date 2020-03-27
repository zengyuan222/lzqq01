package com.wenkong.mapping;

import com.wenkong.pojo.EmployeeTwo;
import com.wenkong.pojo.TimeQuq;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EmployeeTwoMapping {
    void add(EmployeeTwo employeeTwo);
    List<EmployeeTwo> findAll();
    List<EmployeeTwo> findByDate(String creationtime);
    List<EmployeeTwo> findByName(String name);
    List<EmployeeTwo> getEmpts(TimeQuq timeQuq);
    int queryDateAndName ();  //按日期和姓名查询返回一个是否已经插入类型
}
