package com.example.tbaodataview.service.impl;

import com.example.tbaodataview.entity.Dress;
import com.example.tbaodataview.dao.DressDao;
import com.example.tbaodataview.service.DressService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (Dress)表服务实现类
 *
 * @author makejava
 * @since 2023-04-27 21:28:36
 */
@Service("dressService")
public class DressServiceImpl implements DressService {
    @Resource
    DressDao dressDao;

    @Override
    public HashMap<String, Object> getdata() {
        HashMap<String,Object> brand=dressDao.getbrand();
        HashMap<String,Object> price=dressDao.getprice();
        HashMap<String,Object> sale=dressDao.getsale();
        HashMap<String,Object> mp=new HashMap<>();
        mp.put("brand",brand);
        mp.put("sale",sale);
        mp.put("price",price);
        return mp;

    }
}
