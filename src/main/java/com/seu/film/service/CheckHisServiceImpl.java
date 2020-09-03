package com.seu.film.service;

import com.seu.film.mapper.CheckHisMapper;
import com.seu.film.pojo.History;
import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("checkHisService")
public class CheckHisServiceImpl implements CheckHisService{
    @Resource
    CheckHisMapper checkHisMapper;

    @Override
    public ResultDTO<History> checkHis(int uid) {
        ResultDTO<History> resultDTO = new ResultDTO<>();
        List<History> data = new ArrayList<>();
        data = checkHisMapper.checkHis(uid);
        resultDTO.setData(data);
        resultDTO.setCode(0);
        resultDTO.setMsg("观影记录查询");
        return resultDTO;
    }
}
