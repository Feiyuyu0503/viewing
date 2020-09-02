package com.seu.film.mapper;

import com.seu.film.pojo.Film;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TypeMapper {
    @Select("SELECT * FROM film WHERE type = '${value}'")
    List<Film> searchType(String keyWord);
}
