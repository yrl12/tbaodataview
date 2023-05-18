package com.example.tbaodataview.service;

import com.example.tbaodataview.entity.Dress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.HashMap;

/**
 * (Dress)表服务接口
 *
 * @author makejava
 * @since 2023-04-27 21:28:36
 */
public interface DressService {


    HashMap<String, Object> getdata();
}
