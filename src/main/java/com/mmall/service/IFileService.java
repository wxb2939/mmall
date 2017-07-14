package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by xuebing on 2017/7/14.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
