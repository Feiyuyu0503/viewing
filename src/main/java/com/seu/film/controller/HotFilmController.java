package com.seu.film.controller;

import com.seu.film.pojo.Film;
import com.seu.film.service.HotFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("hot")
public class HotFilmController {

    @Autowired
    HotFilmService hotFilmService;

    //http://localhost:8090/film/hot
    @RequestMapping("/hot")
    @ResponseBody
    public List<Film> getHot() throws Exception{
        return hotFilmService.getHotFilm();
    }
}
