package com.example.tbaodataview.dao;

import java.util.HashMap;

/**
 * (Dress)表数据库访问层
 *
 * @author makejava
 * @since 2023-04-27 21:28:36
 */
public interface DressDao {


    HashMap<String, Object> getbrand();

    HashMap<String, Object> getprice();

    HashMap<String, Object> getsale();
}

