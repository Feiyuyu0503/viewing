package com.seu.film.service;

import com.seu.film.pojo.ResultDTO;
import com.seu.film.pojo.Storage;

public interface CheckStorageService {
    ResultDTO<Storage> checkStorage(int uid);
}
