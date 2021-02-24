package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @Deacription TODO
 * @Author Lenovo
 * @Date 2021/1/7 11:03
 * @Version 1.0
 **/
@Controller
public class TestController {
    @RequestMapping("test")
    @ResponseBody
    public Map<String,Object> test(){
        Map<String,Object> map = new HashMap<>();
        int[] ints = {1,8,12};
        String[] str = {"杜","孙","王"};
        map.put("name",str);
        map.put("value",ints);
        return map;
    }

    @RequestMapping("test2")
    @ResponseBody
    public Map<String,Object> test2(){
        Map<String,Object> map = new HashMap<>(); //大

//        List list = new ArrayList();
//        Map<String,Object> map1 = new HashMap<>();
//        list.add(22);
//        list.add(88);
//        list.add(55);
//        map1.put("一点点",list);


        //年份
        List list = Arrays.asList("2015","2016","2017");


        //品种
        List list2 = Arrays.asList("牛奶","咖啡","凉水");

        //三年得销量

        List list3 = Arrays.asList(22,33,44);
        List list4 = Arrays.asList(55,66,77);
        List list5 = Arrays.asList(88,99,11);
        List list6 = Arrays.asList(list3,list4,list5);



        map.put("nameyear",list);
        map.put("type",list2);
        map.put("data",list6);
        return map;
    }
}
