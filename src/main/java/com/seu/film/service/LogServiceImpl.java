package com.seu.film.service;

import com.seu.film.mapper.LogMapper;
import com.seu.film.pojo.Info;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service("logService")
public class LogServiceImpl implements LogService{
    @Resource
    LogMapper logMapper;


    @Override
    public ResultDTO<Info> log(Info info) {
        ResultDTO<Info> resultDTO = new ResultDTO<>();
        List<Info> data = new ArrayList<>();
        String pwd = info.getPwd();
        System.out.println(pwd+"hhh");
        try {
            data = logMapper.log(info);
            //System.out.println(data.get(0).getPwd());
            //if(data.toString().equals(temp)){ resultDTO.setCode(-1);resultDTO.setMsg("用户名不存在");}
            if(data.isEmpty()){ resultDTO.setCode(-1);resultDTO.setMsg("用户名不存在");return resultDTO;}
            String temp = data.get(0).getPwd();   //引起异常
            if(pwd.equals(temp)){
                resultDTO.setCode(data.get(0).getId());        //状态码!=0,登陆成功
                resultDTO.setMsg("登录真的成功了");
            }else {
                resultDTO.setCode(0);
                resultDTO.setMsg("密码错啦！");
            }
        }catch (Exception e){
            System.out.println(e);
            resultDTO.setMsg("登录失败啊！");
        }
        return resultDTO;
    }
}
