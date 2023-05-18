package com.example.tbaodataview.service;

import com.example.tbaodataview.entity.Makeup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * (Makeup)表服务接口
 *
 * @author makejava
 * @since 2023-04-26 21:29:02
 */
public interface MakeupService {

    HashMap<String,Object> getpicc();

    ArrayList<Map<String,String>> getbrandinfo();

    ArrayList<Makeup> getdata();
}
