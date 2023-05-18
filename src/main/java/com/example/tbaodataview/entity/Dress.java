package com.example.tbaodataview.entity;

import java.io.Serializable;

/**
 * (Dress)实体类
 *
 * @author makejava
 * @since 2023-04-27 21:28:36
 */
public class Dress implements Serializable {


    private Integer id;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 地区
     */
    private String addres;
    /**
     * 单价
     */
    private Integer price;
    /**
     * 销量
     */
    private String sale;
    /**
     * 总金额
     */
    private String totalsale;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getTotalsale() {
        return totalsale;
    }

    public void setTotalsale(String totalsale) {
        this.totalsale = totalsale;
    }

}

