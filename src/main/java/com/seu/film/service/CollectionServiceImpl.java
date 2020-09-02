package com.seu.film.service;

import com.seu.film.mapper.CollectionMapper;
import com.seu.film.pojo.Collection;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("collectionService")
public class CollectionServiceImpl implements CollectionService{
    @Resource
    CollectionMapper collectionMapper;

    @Override
    public ResultDTO<Collection> addCollcetion(Collection collection) {
        ResultDTO<Collection> resultDTO = new ResultDTO<>();
        try{
            int i = collectionMapper.addCollcection(collection);
            if(i>0){
                resultDTO.setMsg("收藏成功");
            }else{
                resultDTO.setMsg("收藏失败~");
            }
        }catch (Exception e){
            System.out.println(e);
            resultDTO.setMsg("收藏失败,请登录!");
        }
        return resultDTO;
    }
}
