package com.seu.film.service;

import com.seu.film.mapper.HistoryMapper;
import com.seu.film.pojo.History;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("historyService")
public class HistoryServiceImpl implements HistoryService {
    @Resource
    HistoryMapper historyMapper;

    @Override
    public ResultDTO<History> addHistory(History history) {
        ResultDTO<History> resultDTO = new ResultDTO<>();
        try {
            int i = historyMapper.addHistory(history);
            if(i>0){
                resultDTO.setMsg("添加成功！");
            }else {
                resultDTO.setMsg("添加失败！");
            }
        }catch (Exception e){
            System.out.println(e);
            //resultDTO.setCode(0);//插入异常
            resultDTO.setMsg("添加失败！");
        }
        //如果希望注册成功，则立即登录，可能需要查询一次，那么可以在该业务中查询用户
        return resultDTO;
    }
}
