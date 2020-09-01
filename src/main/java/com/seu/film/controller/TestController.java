package com.seu.film.controller;

import com.seu.film.pojo.Film;
import com.seu.film.pojo.Info;
import com.seu.film.service.FilmService;
import com.seu.film.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    InfoService infoService;

    //http://localhost:8090/film/test/toIndex
    @RequestMapping("/toIndex")
    public String toIndex() throws Exception{
        System.out.println("执行了toIndex");
        return "index";
    }

    //http://localhost:8090/film/test/testMav
    @RequestMapping("/testMav")
    public ModelAndView testMav(ModelAndView mav) throws Exception{
        //Request域中的值
        mav.addObject("name","邵");
        mav.setViewName("index");
        return mav;
    }

    //http://localhost:8090/film/test/findAll
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Info> findAll() throws Exception{
        return infoService.findAllInfo();
    }

}
