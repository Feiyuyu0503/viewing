package com.seu.film.controller;

import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {

    @Autowired
    LogService logService;

    @RequestMapping("/login")
    @ResponseBody
    public ResultDTO log(@RequestBody Info info) throws Exception {
        System.out.println("here"+info.toString());
        return logService.log(info);
    }
}
