package com.example.tbaodataview.entity;

import java.io.Serializable;

/**
 * (Makeup)实体类
 *
 * @author makejava
 * @since 2023-04-26 22:03:07
 */
public class Makeup implements Serializable {


    private Integer id;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 功能
     */
    private String funltion;
    /**
     * 单价
     */
    private Integer price;
    /**
     * 规格
     */
    private String specification;

    private Integer totalsale;

    private Integer summoney;


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

    public String getFunltion() {
        return funltion;
    }

    public void setFunltion(String funltion) {
        this.funltion = funltion;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Integer getTotalsale() {
        return totalsale;
    }

    public void setTotalsale(Integer totalsale) {
        this.totalsale = totalsale;
    }

    public Integer getSummoney() {
        return summoney;
    }

    public void setSummoney(Integer summoney) {
        this.summoney = summoney;
    }

}

