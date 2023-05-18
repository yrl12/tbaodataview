package com.example.tbaodataview.dao;

import com.example.tbaodataview.entity.Makeup;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

/**
 * (Makeup)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-26 21:29:02
 */
public interface MakeupDao {

    ArrayList<String> getBrand();

    ArrayList<Makeup> getdata();
    @Select("select price from makeup")
    ArrayList<String> getprice();

    ArrayList<Integer> gettotalsale();

    ArrayList<Integer> getsummoney();
}

