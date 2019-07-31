package com.stackroute.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/")
public class UserController {

    @RequestMapping("/")
    public String indexView(){
        return "index";
    }


    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String success(@RequestParam("username")String username,@RequestParam("password")String passsword, ModelMap map){
        User user=new User();
        user.setName(username);
        user.setPassword(passsword);

        map.addAttribute("user",user.getName());
        return "view";
    }

}

