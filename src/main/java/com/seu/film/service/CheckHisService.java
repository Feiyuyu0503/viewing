package com.seu.film.service;

import com.seu.film.pojo.History;
import com.seu.film.pojo.ResultDTO;

public interface CheckHisService {
    ResultDTO<History> checkHis(int uid);
}
