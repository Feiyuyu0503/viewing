package com.seu.film.service;

import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;

public interface LogService {
    ResultDTO<Info> log(Info info);
}
