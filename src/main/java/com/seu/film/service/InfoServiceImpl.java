package com.seu.film.service;

import com.seu.film.mapper.InfoMapper;
import com.seu.film.pojo.Info;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service("infoService")
public class InfoServiceImpl implements InfoService{
    @Resource
    InfoMapper infoMapper;
    //ctrl i

    @Override
    public List<Info> findAllInfo() {
        //查之前如果有其他业务，可以自行编写
        return infoMapper.findAllInfo();
    }
}
