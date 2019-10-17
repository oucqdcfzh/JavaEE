package edu.cn.controller;

import edu.cn.User;
import edu.cn.pojo.MoviePerformer;
import edu.cn.service.MoviePerformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @program HelloMVC
 * @description:
 * @author:
 * @create:2019-10-07 10:56:48
 **/

@Controller
public class HelloController {

    @Autowired
    private MoviePerformerService moviePerformerServiceImpl;

    @RequestMapping(value = "/performer/{name}",method = RequestMethod.GET)
    @ResponseBody
    public List<MoviePerformer> getMoviePerformers(@PathVariable String name){
        return moviePerformerServiceImpl.queryByName(name);
    }

    @RequestMapping(value = "/hel",method = RequestMethod.GET)
    @ResponseBody
    public User hello(){
        return new User("fzh","abcd");
    }



    @RequestMapping(value = "/book",method=RequestMethod.GET)
    public String withPara(@RequestParam("isbn") String isb){
        System.out.println(isb);
        return "world";
    }
/*
    @RequestMapping(value = "/book",method=RequestMethod.GET)
    public ModelAndView withPara( String isbn){
        System.out.println(isbn);

        return new ModelAndView("world","isbn",isbn);
    }
*/

    @RequestMapping(value = "/para",method = RequestMethod.GET)
    public String getPara(Model model, String param){
        System.out.println(param);
        model.addAttribute("isbn",param);
        return "world";
    }


    @RequestMapping(value = "/paraa",method = RequestMethod.GET)
    public ModelAndView getPara(String param){


        System.out.println(param);
        return new ModelAndView("world","isbn",param);

    }
/*
    @RequestMapping(value = "/para",method = RequestMethod.GET)
    public String getPara String param){
        System.out.println(param);
        return "world";
    }
*/


        @RequestMapping(value = "/hell",method = RequestMethod.GET)
        @ResponseBody
        public String hell(){
            return "world";
        }


}
