package com.seu.film.controller;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.CheckHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckHisController {

    @Autowired
    CheckHisService checkHisService;

    @RequestMapping("/allHistory/{uid}")
    @ResponseBody
    public ResultDTO checkHis(@PathVariable("uid")int uid) throws Exception{
        return checkHisService.checkHis(uid);
    }
}
