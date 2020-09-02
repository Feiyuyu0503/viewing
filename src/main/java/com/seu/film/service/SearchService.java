package com.seu.film.service;

import com.seu.film.pojo.Film;
import com.seu.film.pojo.ResultDTO;

public interface SearchService {
    ResultDTO<Film> searchFilm(String keyWord);
}
