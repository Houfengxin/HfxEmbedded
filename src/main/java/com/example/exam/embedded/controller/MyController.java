package com.example.exam.embedded.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.exam.embedded.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    /**
     * 登录
     *
     * @param jsonParam
     * @param session
     * @return
     */
    @PostMapping("/userLogin")
    public Map<String, Object> userLogin(@RequestBody JSONObject jsonParam, HttpSession session) {
        Map<String, Object> dataMap = new HashMap<>();
        try {
            return myService.userLogin(jsonParam, session);
        } catch (Exception e) {
            dataMap.put("code", 500);
            return dataMap;
        }
    }



}
