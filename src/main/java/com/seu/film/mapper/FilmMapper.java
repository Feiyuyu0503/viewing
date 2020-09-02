package com.seu.film.mapper;

import com.seu.film.pojo.Film;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FilmMapper {
    @Select("SELECT id,times FROM film WHERE id = 1 ORDER BY times DESC")
    List<Film> findAllFilm();
}
