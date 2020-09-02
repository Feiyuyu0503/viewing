package com.seu.film.controller;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("type")
public class TypeController {

    @Autowired
    TypeService typeService;

    //http://localhost:8090/film/type/key/{keyWord}
    @RequestMapping("/key/{keyWord}")
    @ResponseBody
    public ResultDTO searchType(@PathVariable("keyWord")String keyWord) throws Exception{
        System.out.println(keyWord);
        return typeService.searchType(keyWord);
    }
}
