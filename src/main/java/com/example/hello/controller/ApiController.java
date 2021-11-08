/*
 * @(#)ApiController.java $version 2021/11/07
 *
 */
package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasonyang
 */

@RestController //해당 클래스는 REST API 처리하는 Controller
@RequestMapping("/api") //URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://localhost:9090/api/hello
    public String hello(){
        return "hello spring boot";
    }


}
