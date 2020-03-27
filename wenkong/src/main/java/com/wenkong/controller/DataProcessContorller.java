package com.wenkong.controller;

import com.wenkong.pojo.DataProcess;
import com.wenkong.service.DataProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataProcessContorller {
    @Autowired
    private DataProcessService dataProcessService;
    @RequestMapping("/queryProcess/{lthb}")
    public List<DataProcess> queryProcessByltbh(@PathVariable("lthb") String ltbh){
        return dataProcessService.query(ltbh);
    }
}
