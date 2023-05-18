package com.example.tbaodataview.service.impl;

import com.example.tbaodataview.entity.Makeup;
import com.example.tbaodataview.dao.MakeupDao;
import com.example.tbaodataview.service.MakeupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * (Makeup)表服务实现类
 *
 * @author makejava
 * @since 2023-04-26 21:29:02
 */
@Service("makeupService")
public class MakeupServiceImpl implements MakeupService {
    @Resource
    MakeupDao makeupDao;

    @Override
    public HashMap<String, Object> getpicc() {
        ArrayList<String> brand1 = makeupDao.getBrand();
        ArrayList<Integer> gettotalsale = makeupDao.gettotalsale();
        ArrayList<Integer> money=makeupDao.getsummoney();
        HashMap<String,Object> mp1=new HashMap<>();
        mp1.put("brand",brand1);
        mp1.put("totalsale",gettotalsale);
        mp1.put("summoney",money);
        return mp1;
    }

    @Override
    public ArrayList<Map<String,String>> getbrandinfo() {
        ArrayList<String> brand = makeupDao.getBrand();
        ArrayList<String> getprice = makeupDao.getprice();
        ArrayList<Map<String,String>> big = new ArrayList<>();
        for (int i=0 ;i<brand.size();i++){
            Map<String,String> map= new HashMap<>();
            map.put("value",getprice.get(i));
            map.put("name",brand.get(i));
            big.add(map);
        }
        return big;
    }
    @Override
    public ArrayList<Makeup> getdata() {
        return makeupDao.getdata();
    }
}
