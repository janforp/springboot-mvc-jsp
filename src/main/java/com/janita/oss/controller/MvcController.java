package com.janita.oss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by Janita on 2017/3/13 0013.
 * oss
 */
@Controller
@RequestMapping("/mvc")
public class MvcController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
