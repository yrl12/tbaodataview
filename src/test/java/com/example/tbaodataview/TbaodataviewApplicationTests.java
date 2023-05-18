package com.example.tbaodataview;

import com.example.tbaodataview.dao.MakeupDao;
import com.example.tbaodataview.service.MakeupService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class TbaodataviewApplicationTests {
    @Resource
    MakeupService makeupService;
@Resource
    MakeupDao makeupDao;
//[
//        { value: 40, name: 'rose 1' },
//        { value: 38, name: 'rose 2' },
//        { value: 32, name: 'rose 3' },
//        { value: 30, name: 'rose 4' },
//        { value: 28, name: 'rose 5' },
//        { value: 26, name: 'rose 6' },
//        { value: 22, name: 'rose 7' },
//        { value: 18, name: 'rose 8' }
//      ]

    @Test
    void contextLoads() {
        ArrayList<String> brand = makeupDao.getBrand();
        ArrayList<String> getprice = makeupDao.getprice();
       ArrayList<Map<String,String>> big = new ArrayList<>();
        for (int i=0 ;i<brand.size();i++){
            Map<String,String> map= new HashMap<>();
            map.put("value",getprice.get(i));
            map.put("name",brand.get(i));
            big.add(map);
        }
        System.out.println(big);
    }

}
