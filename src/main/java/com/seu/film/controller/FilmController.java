package com.seu.film.controller;

import com.seu.film.pojo.Film;
import com.seu.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("film")
public class FilmController {
    @Autowired
    FilmService filmService;

    //http://localhost:8090/film/film/findAllFilm
    @RequestMapping("/findAllFilm")
    @ResponseBody
    public List<Film> findAllFilm() throws Exception{
        return  filmService.findAllFilm();
    }
}
