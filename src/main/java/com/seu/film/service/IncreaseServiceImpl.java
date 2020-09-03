package com.seu.film.service;

import com.seu.film.mapper.IncreaseMapper;
import com.seu.film.pojo.Film;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("increaseService")
public class IncreaseServiceImpl implements IncreaseService {
    @Resource
    IncreaseMapper increaseMapper;

    @Override
    public ResultDTO<Film> incTimes(int id) {
        ResultDTO<Film> resultDTO = new ResultDTO<>();
        int data;
        data = increaseMapper.incTimes(id);
        //resultDTO.setData(data);
        resultDTO.setCode(data);
        resultDTO.setMsg("播放次数+1");
        return resultDTO;
    }
}
