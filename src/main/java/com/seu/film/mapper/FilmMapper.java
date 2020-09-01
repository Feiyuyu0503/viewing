package com.seu.film.mapper;

import com.seu.film.pojo.Film;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FilmMapper {
    @Select("SELECT * FROM film")
    List<Film> findAllFilm();
}
