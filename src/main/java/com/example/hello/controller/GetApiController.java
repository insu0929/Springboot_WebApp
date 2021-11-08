/*
 * @(#)GetApiController.java $version 2021/11/08
 *
 */
package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jasonyang
 */
@RestController
@RequestMapping("/api/get")
public class GetApiController {

    //method1
    @GetMapping(path = "/hello")
    public String hello(){
        return "get Hello";
    }
    //method 2
    @RequestMapping(path = "/hi", method = RequestMethod.GET) //get/post/put/delete 다 됨
    public String hi(){
        return "hi";
    }



}
