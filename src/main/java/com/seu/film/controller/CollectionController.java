package com.seu.film.controller;

import com.seu.film.pojo.Collection;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping()
public class CollectionController {
    @Autowired
    CollectionService collectionService;

    @RequestMapping("/collection")
    @ResponseBody
    public ResultDTO addCollection(@RequestBody Collection collection) throws Exception {
        System.out.println(collection.toString());
        return collectionService.addCollcetion(collection);
    }
}
