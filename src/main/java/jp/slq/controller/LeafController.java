package jp.slq.controller;

import jp.slq.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Slf4j
@Controller
public class LeafController {
    @RequestMapping("/leaf1")
    public String leaf1(Model m, HttpSession s){
        s.setAttribute("cat","green");
        m.addAttribute("a","hello");
        m.addAttribute("link","hello");
        log.info("test Slf4j");
        return "leaf1";
    }
    @RequestMapping("/favicon.ico")
    public String favicon(){
        return "forward:/st/favicon.ico";
    }
}
