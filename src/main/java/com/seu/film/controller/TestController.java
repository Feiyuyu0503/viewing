package com.seu.film.controller;

import com.seu.film.pojo.Film;
import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.FilmService;
import com.seu.film.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    //http://localhost:8090/film/test/findAll2
    @RequestMapping("/findAll2")
    @ResponseBody
    public ResultDTO<Info> findAll2() throws Exception{
        ResultDTO<Info> resultDTO = infoService.findAllInfo2();
        return infoService.findAllInfo2();
    }

    @PostMapping("/login")
    public String login(Info info,String name,String pwd) throws Exception{
        System.out.println(info.toString());
        System.out.println(name+"~~"+pwd);
        return "index";
    }

    //删除用户
    //http://localhost:8090/film/test/admin/del/1
    @RequestMapping("/admin/del/{id}")
    public String del(@PathVariable("id")int id) throws Exception{
        System.out.println("id:"+id);
        return "index";
    }

    @RequestMapping("/rqJson1")
    @ResponseBody
    public String rqJson1(@RequestBody Info info) throws Exception{
        System.out.println(info.toString());
        return "ok";
    }

    @RequestMapping("/findFilm/{keyWord}")
    @ResponseBody
    public ResultDTO findFilm(@PathVariable("keyWord")String keyWord) throws Exception{
        System.out.println(keyWord);
        return infoService.findInfoByKeyWord(keyWord);
    }

    @RequestMapping("/findFilmByInfo")
    @ResponseBody
    public ResultDTO findFilmByInfo(@RequestBody Info info) throws Exception {
        System.out.println(info.toString());
        return infoService.findInfoByInfo(info);
    }

    @RequestMapping("/addInfo")
    @ResponseBody
    public ResultDTO addInfo(@RequestBody Info info) throws Exception {
        System.out.println(info.toString());
        return infoService.addInfo(info);
    }
}
