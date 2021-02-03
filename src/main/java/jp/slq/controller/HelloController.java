package jp.slq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
    @RequestMapping("/helloo")
    public Object helloo(){
        HashMap<Object, Object> m = new HashMap<>();
        m.put("hello","world");
        return m;
    }
}
