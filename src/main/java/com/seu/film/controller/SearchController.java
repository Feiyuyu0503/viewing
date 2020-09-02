package com.seu.film.controller;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("search")
public class SearchController {

    @Autowired
    SearchService searchService;

    //http://localhost:8090/film/search/key/{keyWord}
    @RequestMapping("/key/{keyWord}")
    @ResponseBody
    public ResultDTO searchFilm(@PathVariable("keyWord")String keyWord) throws Exception{
        System.out.println(keyWord);
        return searchService.searchFilm(keyWord);
    }

}
