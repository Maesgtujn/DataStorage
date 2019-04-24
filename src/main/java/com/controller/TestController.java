package com.controller;

import com.model.User;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/demo")
public class TestController {
    @Autowired
    TestService testService;

    @ResponseBody
    @RequestMapping(value = "/add/{idcard}/{name}/{phone}",method = RequestMethod.GET)
    public int add(HttpServletRequest request, HttpServletResponse response, @PathVariable int idcard,
                   @PathVariable String name, @PathVariable int phone){
        User user = new User();
        user.setIdCard(String.valueOf(idcard));
        user.setName(name);
        user.setPhone(String.valueOf(phone));
        return testService.add(user);
    }
    @ResponseBody
    @RequestMapping(value = "/query/{idcard}", method = RequestMethod.GET)
    public String query(HttpServletRequest request, HttpServletResponse response, @PathVariable int idcard){
        return testService.query(idcard);
    }
}
