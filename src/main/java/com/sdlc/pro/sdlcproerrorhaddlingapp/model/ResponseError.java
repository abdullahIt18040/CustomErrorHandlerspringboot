package com.sdlc.pro.sdlcproerrorhaddlingapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
public class ResponseError {
    @JsonProperty("time_stamp") // JSON property name
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC") // Formatting the timestamp
    private Date timeStamp;

    @JsonProperty("status_code") // JSON property name
    private int statusCode;

    @JsonProperty("status") // JSON property name
    private String status;

    @JsonProperty("message") // JSON property name
    private String message;
    // Constructor with default timestamp
    public ResponseError(int statusCode, String status, String message) {
        this.timeStamp = new Date();
        this.statusCode = statusCode;
        this.status = status;
        this.message = message;
    }
}
