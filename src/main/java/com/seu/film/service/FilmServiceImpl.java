package com.seu.film.service;

import com.seu.film.mapper.FilmMapper;
import com.seu.film.pojo.Film;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Transactional
@Service("filmService")
public class FilmServiceImpl implements FilmService{
    @Resource
    FilmMapper filmMapper;
    //ctrl i

    @Override
    public List<Film> findAllFilm() {
        //查之前如果有其他业务
        return filmMapper.findAllFilm();
    }
}
