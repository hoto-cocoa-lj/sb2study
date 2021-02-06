package jp.slq.controller;

import jp.slq.pojo.User;
import jp.slq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/select1")
    public User select1(int id){
        return userService.select1(id);
    }

    @RequestMapping("/select")
    public List<User> select(){
        return userService.select();
    }

    @RequestMapping("/insert1")
    public void insert1(){
        User user=new User();
        user.setName(System.currentTimeMillis()+"");
        user.setAge(11);
        userService.insert1(user);
    }

    @RequestMapping("/del")
    public void del(int id){
        userService.del(id);
    }

    @RequestMapping("/tx")
    public void tx(){
        userService.testTX();
    }
}
