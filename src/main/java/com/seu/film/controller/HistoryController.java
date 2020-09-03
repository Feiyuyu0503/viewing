package com.seu.film.controller;

import com.seu.film.pojo.History;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.service.HistoryService;
import com.seu.film.service.IncreaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("history")
public class HistoryController {

    @Autowired
    HistoryService historyService;
    @Autowired
    IncreaseService increaseService;

    @RequestMapping("/history")
    @ResponseBody
    public ResultDTO addHistory(@RequestBody History history) throws Exception {
        System.out.println(history.toString());
        increaseService.incTimes(history.getFilmid());
        return historyService.addHistory(history);
    }
}
