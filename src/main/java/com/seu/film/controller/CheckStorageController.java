package com.seu.film.controller;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.CheckStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckStorageController {

    @Autowired
    CheckStorageService checkStorageService;

    @RequestMapping("/allStorage/{uid}")
    @ResponseBody
    public ResultDTO checkStorage(@PathVariable("uid")int uid) throws Exception{
        return checkStorageService.checkStorage(uid);
    }
}
