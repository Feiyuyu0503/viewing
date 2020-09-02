package com.seu.film.mapper;

import com.seu.film.pojo.Film;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HotFilmMapper {
    @Select("SELECT * FROM film ORDER BY times DESC LIMIT 0,5")
    List<Film> getHotFilm();
}
