package com.sdlc.pro.sdlcproerrorhaddlingapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class Address {
    @Positive
    private int roadNo;
    @NotBlank
    private  String houseNo;

    public Address(int roadNo, String houseNo) {
        this.roadNo = roadNo;
        this.houseNo = houseNo;
    }

    public Address() {
    }

    public int getRoadNo() {
        return roadNo;
    }

    public void setRoadNo(int roadNo) {
        this.roadNo = roadNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }
}
