package com.wenkong.controller;

import com.wenkong.entity.MessageConstant;
import com.wenkong.entity.Result;
import com.wenkong.pojo.EmployeeTwo;
import com.wenkong.pojo.TimeQuq;
import com.wenkong.service.EmployeeTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/employeetwo")
public class EmployeeTwoController {
    @Autowired
    private EmployeeTwoService employeeTwoService;

    @InitBinder
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor =new CustomDateEditor(df,true);
        binder.registerCustomEditor(Date.class,editor);
    }

    /**
     * 新增
     * @param employeeTwo
     * @return
     */
    @RequestMapping("/add")
    public Result add(@RequestBody EmployeeTwo employeeTwo){
        try {

            employeeTwoService.add(employeeTwo);
            return new Result(true, MessageConstant.ADD_Employee_SUCCESS);
        }catch (Exception e){
            return new Result(false, MessageConstant.ADD_Employee_FAIL);
        }
    }
    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    @CrossOrigin(origins = {"http://120.76.76.73:8086"}, allowCredentials = "true")
    public Result findAll(){
        try{
            List<EmployeeTwo> employeeList = employeeTwoService.findAll();
            return new Result(true,MessageConstant.QUERY_Employee_SUCCESS,employeeList);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,MessageConstant.QUERY_Employee_FAIL);
        }
    }
    //姓名查询
    @RequestMapping("/findByName")
    @CrossOrigin(origins = {"http://120.76.76.73:8086"}, allowCredentials = "true")
    public Result findByName (@RequestParam(value = "name",required = false) String name){
        try {
            List<EmployeeTwo> byDate = employeeTwoService.findByName(name);
            return new Result(true,MessageConstant.QUERY_Employee_SUCCESS,byDate);
        }catch (Exception e){
            return new Result(false, MessageConstant.QUERY_Employee_FAIL);
        }
    }
    /**
     * 日期查询
     * @param creationtime
     * @return
     */
    @RequestMapping("/queryProcess")
    public Result queryProcessByltbh (@RequestParam(value = "creationtime",required = false) String creationtime ){
        try {
            List<EmployeeTwo> byDate = employeeTwoService.findByDate(creationtime);
            return new Result(true,MessageConstant.QUERY_Employee_SUCCESS,byDate);
        }catch (Exception e){
            return new Result(false, MessageConstant.QUERY_Employee_FAIL);
        }
    }
//    /**
//     * 时间段查询
//     */
    @RequestMapping("/getEmpts")
    public Result getEmpts(TimeQuq timeQuq){
        try{
            List<EmployeeTwo> tiemEs = employeeTwoService.getEmpts(timeQuq);
            return new Result(true,MessageConstant.QUERY_Employee_SUCCESS,tiemEs);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,MessageConstant.QUERY_Employee_FAIL);
        }
    }
    /**
     * 查询按日期和姓名是否已经存在
     */

}
