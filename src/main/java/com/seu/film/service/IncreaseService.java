package com.seu.film.service;

import com.seu.film.pojo.Film;
import com.seu.film.pojo.ResultDTO;

public interface IncreaseService {
    ResultDTO<Film> incTimes(int id);
}
