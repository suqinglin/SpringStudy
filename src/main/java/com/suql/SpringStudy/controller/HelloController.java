package com.suql.SpringStudy.controller;

import com.alibaba.fastjson.JSONObject;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

//@RestController // 该注解是 @Controller 和 @ResponseBody 注解的合体版
@Controller // 只写Controller，则可以返回jsp或者html页面，不能返回json、xml等数据内容
//@ResponseBody // 加了ResponseBody，只能返回json、xml等数据内容，不能返回jsp或者html页面
@RequestMapping("/api/v1/user")
public class HelloController {

//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private String age;
//
//    @Value("${content}")
//    private String content;

//    @Autowired // 注入
//    private StudentProperties studentProperties;

    @GetMapping("/hello")
    public String hello(Model model) {
//        return studentProperties.getName() + ":" + studentProperties.getAge();
        model.addAttribute("now", "2019/3/25");
        return "index";
    }
    @PostMapping("/login")
    public String login(@RequestBody JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        int age = jsonObject.getInteger("age");
        Map<String, Object> respMap = new HashMap<>();
        respMap.put("nameResp", name);
        respMap.put("ageResp", age);
        return JSONObject.toJSONString(respMap);
    }
}
