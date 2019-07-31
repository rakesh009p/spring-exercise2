package controller;


import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        return "index";
    }
    @RequestMapping(value = "/login")
    public String success(@RequestParam("username")String username,@RequestParam("password")String passsword, ModelMap map){
        User user=new User();
        user.setName(username);
        map.addAttribute("user",user.getName());
        return "view";
    }

}

