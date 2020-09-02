package com.seu.film.service;

import com.seu.film.pojo.Film;
import com.seu.film.pojo.ResultDTO;

public interface TypeService {
    ResultDTO<Film> searchType(String keyWord);
}
