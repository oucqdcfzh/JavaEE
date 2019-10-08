package edu.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program HelloMVC
 * @description:
 * @author:
 * @create:2019-10-07 10:56:48
 **/

@Controller
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "world";
    }
    @RequestMapping(value = "/book",method=RequestMethod.GET)
    public String withPara(@RequestParam("isbn") String isb){
        System.out.println(isb);
        return "world";
    }
}
