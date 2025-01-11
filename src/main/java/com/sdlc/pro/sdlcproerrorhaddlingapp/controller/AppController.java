package com.sdlc.pro.sdlcproerrorhaddlingapp.controller;

import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.AccessDenied;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.PageNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/home")
    public String home()
    {
        if(1==1)
        {
            throw  new PageNotFoundException("can not find home page ");
        }
        return "home";
    }
    @GetMapping("/about")
    public String about()
    {
        if(1==1 )
        {
            throw new AccessDenied(" there is no access permission ");
        }
        return "about";
    }


}
