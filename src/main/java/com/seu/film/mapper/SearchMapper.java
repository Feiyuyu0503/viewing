package com.seu.film.mapper;

import com.seu.film.pojo.Film;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface SearchMapper {
    @Select("SELECT * FROM film WHERE name LIKE '%${value}%'")
    List<Film> searchFilm(String keyWord);
}
