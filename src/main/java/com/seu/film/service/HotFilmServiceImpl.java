package com.seu.film.service;

import com.seu.film.mapper.HotFilmMapper;
import com.seu.film.pojo.Film;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("hotFilmService")
public class HotFilmServiceImpl implements HotFilmService{
    @Resource
    HotFilmMapper hotFilmMapper;

    @Override
    public List<Film> getHotFilm() {
        return hotFilmMapper.getHotFilm();
    }
}
