package com.seu.film.mapper;

import com.seu.film.pojo.Info;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface InfoMapper {
    @Select("SELECT * FROM info")
    List<Info> findAllInfo();

    @Select("SELECT * FROM info WHERE name LIKE '%${value}%' or " +
            "id LIKE '%${value}%'")
    List<Info> findInfoByKeyWord(String keyWord);
    //根据Info查询信息
    List<Info> findInfoByInfo(Info info);
    //DML INSERT UPDATE DELETE
    int addInfo(Info info);

}
