package com.seu.film.service;

import com.seu.film.mapper.RegisterMapper;
import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("registerService")
public class RegisterServiceImpl implements RegisterService{
    @Resource
    RegisterMapper registerMapper;

    @Override
    public ResultDTO register(Info info) {
        ResultDTO<Info> resultDTO = new ResultDTO<>();
        try {
            int i = registerMapper.register(info);
            if(i>0){
                resultDTO.setCode(1);
                resultDTO.setMsg("注册成功！");
            }else {
                resultDTO.setMsg("注册失败！");
            }
        }catch (Exception e){
            System.out.println(e);
            resultDTO.setCode(0);//插入异常
            resultDTO.setMsg("注册失败,用户名已存在");
        }
        //如果希望注册成功，则立即登录，可能需要查询一次，那么可以在该业务中查询用户
        return resultDTO;
    }
}
