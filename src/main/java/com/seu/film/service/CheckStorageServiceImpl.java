package com.seu.film.service;

import com.seu.film.mapper.CheckStorageMapper;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.pojo.Storage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("checkStorageService")
public class CheckStorageServiceImpl implements CheckStorageService{

    @Resource
    CheckStorageMapper checkStorageMapper;

    @Override
    public ResultDTO<Storage> checkStorage(int uid) {
        ResultDTO<Storage> resultDTO = new ResultDTO<>();
        List<Storage> data = new ArrayList<>();
        data = checkStorageMapper.checkStorage(uid);
        resultDTO.setData(data);
        resultDTO.setCode(0);
        resultDTO.setMsg("收藏记录查询");
        return resultDTO;
    }
}
