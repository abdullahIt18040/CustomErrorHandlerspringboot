package com.sdlc.pro.sdlcproerrorhaddlingapp.exceptionHandler;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.RestControllerIdentifier;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.AccessDenied;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.MathException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.PageNotFoundException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.exeptions.ResourceNotFoundException;
import com.sdlc.pro.sdlcproerrorhaddlingapp.model.ResponseError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Map;


@RestControllerAdvice(annotations = RestControllerIdentifier.class)
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ResponseError> resourceNotFound(ResourceNotFoundException exception) {

        // Create a ResponseError object with error details
        ResponseError error = new ResponseError(
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                exception.getMessage()
        );

        // Return the ResponseError object wrapped in a ResponseEntity
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }


    @ExceptionHandler({MathException.class})
    public ResponseEntity<?> mathExceptionErrorHandler(MathException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(

                Map.of("timestamp", Instant.now(),
                        "status", HttpStatus.INTERNAL_SERVER_ERROR,
                        "error", MathException.class.getName(),
                        "message", exception.getMessage()


                )

        );
    }


}