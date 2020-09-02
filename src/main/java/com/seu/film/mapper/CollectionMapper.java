package com.seu.film.mapper;

import com.seu.film.pojo.Collection;
import org.apache.ibatis.annotations.Insert;

public interface CollectionMapper {
    @Insert("INSERT INTO collection (userid,filmid) VALUES (#{userid},#{filmid})")
    int addCollcection(Collection collection);
}
