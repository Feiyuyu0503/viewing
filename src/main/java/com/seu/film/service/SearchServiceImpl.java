package com.seu.film.service;

import com.seu.film.mapper.SearchMapper;
import com.seu.film.pojo.Film;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("searchService")
public class SearchServiceImpl implements SearchService {
    @Resource
    SearchMapper searchMapper;

    @Override
    public ResultDTO<Film> searchFilm(String keyWord) {
        ResultDTO<Film> resultDTO = new ResultDTO<>();
        List<Film> data = new ArrayList<>();
        data = searchMapper.searchFilm(keyWord);
        resultDTO.setMsg("关键字搜索电影");
        resultDTO.setData(data);
        if(data.isEmpty())
        resultDTO.setCode(1); //找不到返回1
        else
            resultDTO.setCode(0);
        return resultDTO;
    }
}
