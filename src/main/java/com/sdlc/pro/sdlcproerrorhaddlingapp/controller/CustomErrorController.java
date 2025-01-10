package com.sdlc.pro.sdlcproerrorhaddlingapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

import static org.springframework.boot.web.error.ErrorAttributeOptions.Include.*;

@Controller
@RequestMapping("/error")
public class CustomErrorController implements ErrorController {
    @Autowired
    private ErrorAttributes errorAttributes;

    @GetMapping(produces = MediaType.TEXT_HTML_VALUE)
    public String htmlErrorPage(HttpServletRequest servletRequest, Model model)
    {
        WebRequest webRequest = new ServletWebRequest(servletRequest);
          Map<String,Object> map = errorAttributes.getErrorAttributes(webRequest,
                  ErrorAttributeOptions.of( MESSAGE,STACK_TRACE,STATUS,ERROR,PATH));
          map.put("extra-info","this is extra info");
          model.addAllAttributes(map);
        return "error";
    }
@ResponseBody
@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> restErrorHandler(HttpServletRequest httpServletRequest)
    {
        WebRequest webRequest = new ServletWebRequest(httpServletRequest);
        Map<String,Object> map = errorAttributes.getErrorAttributes(webRequest,
                ErrorAttributeOptions.of(MESSAGE,STACK_TRACE,STATUS,ERROR,PATH));
        map.put("extra-info","this is extra-info");
        return ResponseEntity.status((int)map.get("status")).body(map);
    }
}
