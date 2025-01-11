package com.sdlc.pro.sdlcproerrorhaddlingapp.exceptionHandler;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.MvcControllerIdentifier;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.ResourceNotFoundException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.model.ResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@ControllerAdvice(annotations = MvcControllerIdentifier.class)
public class GlobalMVCExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ModelAndView handleResourceNotFoundException(ResourceNotFoundException exception) {
        // Log the exception or handle any necessary cleanup
        return new ModelAndView("resource_error", Map.of(
                "error", ResourceNotFoundException.class.getSimpleName(),
                "message", exception.getMessage()
        ));
    }
}
