package com.seu.film.controller;

import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {

    @Autowired
    RegisterService registerService;

    //http://localhost:8090/film/register
    @RequestMapping("/register")
    @ResponseBody
    public ResultDTO register(@RequestBody Info info) throws Exception {
        return registerService.register(info);
    }

}
