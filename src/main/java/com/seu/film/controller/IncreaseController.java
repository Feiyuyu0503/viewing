package com.seu.film.controller;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.IncreaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IncreaseController {

    @Autowired
    IncreaseService increaseService;

    @RequestMapping("/incTimes/{id}")
    @ResponseBody
    public ResultDTO incTimes(@PathVariable("id")int id) throws Exception{
        System.out.println(id);
        return increaseService.incTimes(id);
    }
}
