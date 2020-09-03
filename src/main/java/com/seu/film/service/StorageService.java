package com.seu.film.service;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.pojo.Storage;

public interface StorageService {
    ResultDTO<Storage> addStorage(Storage storage);
}
