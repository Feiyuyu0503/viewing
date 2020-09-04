package com.seu.film.service;

import com.seu.film.mapper.DelHisMapper;
import com.seu.film.mapper.HistoryMapper;
import com.seu.film.pojo.History;
import com.seu.film.pojo.ResultDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("delHisService")
public class DelHisServiceImpl implements DelHisService{
    @Resource
    DelHisMapper delHisMapper;

    @Resource
    HistoryMapper historyMapper;

    @Override
    public ResultDTO<History> delHis(History history) {
        ResultDTO<History> resultDTO = new ResultDTO<>();
        try {
            int i = delHisMapper.delHis(history);
            if(i>0){
                resultDTO.setMsg("记录覆盖成功！");
            }else {
                resultDTO.setMsg("无记录，直接更新！");
            }
            historyMapper.addHistory(history);
        }catch (Exception e){
            System.out.println(e);
            resultDTO.setMsg("有异常！");
        }
        //如果希望注册成功，则立即登录，可能需要查询一次，那么可以在该业务中查询用户
        return resultDTO;
    }
}
