package com.seu.film.service;

import com.seu.film.mapper.TypeMapper;
import com.seu.film.pojo.Film;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("typeService")
public class TypeServiceImpl implements TypeService{
    @Resource
    TypeMapper typeMapper;

    @Override
    public ResultDTO<Film> searchType(String keyWord) {
        ResultDTO<Film> resultDTO = new ResultDTO<>();
        List<Film> data = new ArrayList<>();
        data = typeMapper.searchType(keyWord);
        resultDTO.setMsg("按类型搜索电影");
        resultDTO.setData(data);
        if(data.isEmpty())
            resultDTO.setCode(1); //找不到返回1
        else
            resultDTO.setCode(0);
        return resultDTO;
    }
}
