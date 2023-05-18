package com.example.tbaodataview.controller;

import com.example.tbaodataview.entity.Dress;
import com.example.tbaodataview.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * (Dress)表控制层
 *
 * @author makejava
 * @since 2023-04-27 21:28:35
 */
@Controller
@RequestMapping("dress")
@CrossOrigin("*")
public class DressController {

    @Resource
    DressService dressService;
    @RequestMapping("/getdata")
    @ResponseBody
    public HashMap<String,Object> getdata(){
        HashMap<String,Object> d=dressService.getdata();
        return d;
    }
    @GetMapping("/getdress")
    public String getdress(){

        return "uniform";
    }
}

