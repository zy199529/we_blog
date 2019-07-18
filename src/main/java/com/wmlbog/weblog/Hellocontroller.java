package com.wmlbog.weblog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

@Controller
@RequestMapping(value = "/view")
public class Hellocontroller{
//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
//    @Autowired
//    private StudentProperties studentProperties;
    @RequestMapping("/hello")
//    public String hello(Model m){
//        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
//        return "hello";
//    }
    public String hello(){
//        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
}



//    @RequestMapping("/hello")
//    public String hello(){
//        return content;
//    }
}
