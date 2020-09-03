package com.seu.film.service;

import com.seu.film.mapper.StorageMapper;
import com.seu.film.pojo.ResultDTO;
import com.seu.film.pojo.Storage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("storageService")
public class StorageServiceImpl implements StorageService {
    @Resource
    StorageMapper storageMapper;

    @Override
    public ResultDTO<Storage> addStorage(Storage storage) {
        ResultDTO<Storage> resultDTO = new ResultDTO<>();
        try {
            int i = storageMapper.addStorage(storage);
            if(i>0){
                resultDTO.setMsg("收藏成功！");
            }else {
                resultDTO.setMsg("收藏失败！");
            }
        }catch (Exception e){
            System.out.println(e);
            //resultDTO.setCode(0);//插入异常
            resultDTO.setMsg("收藏失败！");
        }
        //如果希望注册成功，则立即登录，可能需要查询一次，那么可以在该业务中查询用户
        return resultDTO;
    }
}
