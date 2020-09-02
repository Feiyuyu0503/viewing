package com.seu.film.service;

import com.seu.film.pojo.Collection;
import com.seu.film.pojo.ResultDTO;

public interface CollectionService {
    ResultDTO<Collection> addCollcetion(Collection collection);
}
