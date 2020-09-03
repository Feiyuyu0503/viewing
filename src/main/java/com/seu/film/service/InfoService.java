package com.seu.film.service;

import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;

import java.util.List;

public interface InfoService {
    List<Info> findAllInfo();
    //使用DTO
    ResultDTO<Info> findAllInfo2();
    //根据关键字查询
    ResultDTO<Info> findInfoByKeyWord(String keyWord);
    //根据info查询
    ResultDTO<Info> findInfoByInfo(Info info);

    ResultDTO<Info> addInfo(Info info);

}
