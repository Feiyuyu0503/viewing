package com.seu.film.mapper;

import com.seu.film.pojo.Film;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IncreaseMapper {
    @Update("UPDATE film SET times = times+1 WHERE id = '${value}'")
    int incTimes(int id);
}
