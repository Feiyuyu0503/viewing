package com.seu.film.mapper;

import com.seu.film.pojo.Storage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CheckStorageMapper {
    @Select("SELECT * FROM collection WHERE uid = '${value}'")
    List<Storage> checkStorage(int uid);
}
