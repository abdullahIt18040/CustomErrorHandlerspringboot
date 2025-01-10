package com.sdlc.pro.sdlcproerrorhaddlingapp.controller;

import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.MathException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyHomeController {
    @ResponseBody
@GetMapping("/calculator")
    public int calculator(@RequestParam("a") int a, @RequestParam("b") int b)
    {
        if(b==0)
        {
            throw new MathException("the value of b is cant not Zero");
        }
        return a/b;

    }


}
