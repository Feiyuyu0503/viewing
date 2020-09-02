package com.seu.film.service;

import com.seu.film.mapper.InfoMapper;
import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
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

    @Override
    public ResultDTO<Info> findAllInfo2() {
        ResultDTO<Info> resultDTO = new ResultDTO<>();
        List<Info> data = new ArrayList<>();
        data = infoMapper.findAllInfo();
        resultDTO.setData(data);
        resultDTO.setCode(6);
        resultDTO.setMsg("success");
        return resultDTO;
    }

    @Override
    public ResultDTO<Info> findInfoByKeyWord(String keyWord) {
        ResultDTO<Info> resultDTO = new ResultDTO<>();
        List<Info> data = new ArrayList<>();
        data = infoMapper.findInfoByKeyWord(keyWord);
        resultDTO.setData(data);
        resultDTO.setCode(0);
        resultDTO.setMsg("关键字查询");
        return resultDTO;
    }

    @Override
    public ResultDTO<Info> findInfoByInfo(Info info) {
        ResultDTO<Info> resultDTO = new ResultDTO<>();
        List<Info> data = new ArrayList<>();
        data = infoMapper.findInfoByInfo(info);
        resultDTO.setData(data);
        resultDTO.setCode(0);
        resultDTO.setMsg("多条件查询");
        return resultDTO;
    }

    @Override
    public ResultDTO<Info> addInfo(Info info) {
        ResultDTO<Info> resultDTO = new ResultDTO<>();
        try {
            int i = infoMapper.addInfo(info);
            if(i>0){
                resultDTO.setMsg("注册成功！");
            }else {
                resultDTO.setMsg("注册失败！");
            }
        }catch (Exception e){
            System.out.println(e);
            resultDTO.setCode(0);//插入异常
            resultDTO.setMsg("注册失败！");
        }
        //如果希望注册成功，则立即登录，可能需要查询一次，那么可以在该业务中查询用户
        return resultDTO;
    }
}
