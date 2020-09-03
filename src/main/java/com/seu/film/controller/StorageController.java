package com.seu.film.controller;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.pojo.Storage;
import com.seu.film.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StorageController {

    @Autowired
    StorageService storageService;

    @RequestMapping("/storage")
    @ResponseBody
    public ResultDTO addStorage(@RequestBody Storage storage) throws Exception {
        System.out.println(storage.toString());
        return storageService.addStorage(storage);
    }
}
