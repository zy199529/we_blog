package com.wmlbog.weblog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller{
//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
    @Autowired
    private StudentProperties studentProperties;
    @RequestMapping("/hello")
    public String hello(){
        return studentProperties.getName()+studentProperties.getAge();
    }
//    @RequestMapping("/hello")
//    public String hello(){
//        return content;
//    }
}
