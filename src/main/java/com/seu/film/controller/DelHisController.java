package com.seu.film.controller;

import com.seu.film.pojo.History;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.DelHisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DelHisController {

    @Autowired
    DelHisService delHisService;

    @RequestMapping("/updateHistory")
    @ResponseBody
    public ResultDTO delHis(@RequestBody History history) throws Exception {
        System.out.println(history.toString());
        return delHisService.delHis(history);
    }
}
