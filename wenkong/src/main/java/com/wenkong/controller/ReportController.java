package com.wenkong.controller;

import com.wenkong.entity.MessageConstant;
import com.wenkong.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/report")
public class ReportController {

    //测试面
    @RequestMapping("/queryItem")
    public ModelAndView queryItem(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("item/edit");
        return mav;
    }
    //文件上传
    @RequestMapping("/updateReport")
    public Result updateReport(MultipartFile pictureFile){
        String path = "";
        try{
            //1.判断文件不为空，才上传
            if(pictureFile != null &&
                    pictureFile.getOriginalFilename() !=null &&
                    !"".equals(pictureFile.getOriginalFilename())){
                //2.获取文件的名称
                String oriName = pictureFile.getOriginalFilename();
                String extName = oriName.substring(oriName.lastIndexOf("."));
                //3.重新命名文件
                String newName = System.currentTimeMillis()+"";
                newName = newName + extName;
                //4.调用上传
                //创建文件对象
                File file = new File("F:\\reportpic\\"+newName);

                try{
                    pictureFile.transferTo(file);
                }catch (IOException e){
                    e.printStackTrace();
                }
                path= "F:\\reportpic\\"+newName;
            }
            return new Result(true, MessageConstant.UPDATE_ReportIMG_SUCCESS,path);
        }catch (Exception e){
            return new Result(false,MessageConstant.UPDATE_ReportIMG_FAIL);
        }

    }

}
