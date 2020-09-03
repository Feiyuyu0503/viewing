package com.seu.film.mapper;

import com.seu.film.pojo.History;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CheckHisMapper {
    @Select("SELECT * FROM history WHERE userid = '${value}' ORDER BY id DESC")
    List<History> checkHis(int uid);
}
