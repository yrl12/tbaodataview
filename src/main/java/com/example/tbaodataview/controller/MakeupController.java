package com.example.tbaodataview.controller;

import com.example.tbaodataview.service.MakeupService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * (Makeup)表控制层
 *
 * @author makejava
 * @since 2023-04-26 21:29:02
 */
@Controller
@RequestMapping("/makeup")
@CrossOrigin("*")
public class MakeupController {
    @Resource
    MakeupService makeupService;

    @RequestMapping("/getbrandinfo")
    @ResponseBody
    public ArrayList<Map<String,String>> getbrandinfo(){
        ArrayList<Map<String,String>> mk=makeupService.getbrandinfo();
        return mk;
    }
    //轮播数据获取
    @RequestMapping ("/getdata")
    public String getdata(Model model){
        model.addAttribute("datas", makeupService.getdata());
        return "test1";
    }


    @GetMapping("/totest1")
    public String totest1(){

        return "test1";
    }
    @RequestMapping("/getpc")
    @ResponseBody
    public HashMap<String,Object> getpc(){
        HashMap<String,Object> btm=makeupService.getpicc();
        return btm;
    }


}

