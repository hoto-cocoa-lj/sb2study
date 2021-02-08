package jp.slq.controller;

import auto.HelloService;
import jp.slq.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

@RestController
public class HelloController {
    @Autowired
    HelloService hs;

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String user(User u, @RequestParam(value = "file1",
            required = false)  MultipartFile f1, @RequestParam("file2") MultipartFile f2){
        System.out.println(u);                  //User(name=slq, age=11, dog=Dog(nickname=slqdog))
        System.out.println(f1);
        String fileName = f2.getOriginalFilename();
        try {
            String filePath = new File("src/main/resources/files").getCanonicalPath();
            File dest = new File(filePath , fileName);
            //dest.createNewFile();         //有时报错dest不存在，原因不明
            f2.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hello world";
    }

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

    @RequestMapping("/a")
    public Object a(){
        int a=1/0;
        return null;
    }

    @RequestMapping("/say")
    public String say(){
        return hs.say("张三");
    }
}
