/*
 * @(#)GetApiController.java $version 2021/11/08
 *
 */
package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    // http://localhost:90090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("Path Variable: " + name);
        return "name";
    }

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println();
            sb.append(entry.getKey() + " = " + entry.getValue()+ "\n");
        });
        return sb.toString();
    }

    //이걸 query parameter마다 매핑해주는건 어렵다
    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String name,
                               @RequestParam String email,
                               @RequestParam int age){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        return "";
    }
    //그래서 미리 dto로 정의함
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
