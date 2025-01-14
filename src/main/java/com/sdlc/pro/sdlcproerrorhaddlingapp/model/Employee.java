package com.sdlc.pro.sdlcproerrorhaddlingapp.model;

import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.AbdullahRange;
import com.sdlc.pro.sdlcproerrorhaddlingapp.annotations.BDPhoneNumber;
import com.sdlc.pro.sdlcproerrorhaddlingapp.interfaces.Error;
import com.sdlc.pro.sdlcproerrorhaddlingapp.interfaces.SaveEmployee;
import com.sdlc.pro.sdlcproerrorhaddlingapp.interfaces.UpdateEmplyee;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import org.hibernate.validator.constraints.Range;

public class Employee {


    @Positive(groups = SaveEmployee.class)
    private int id;
    @AbdullahNotBlank(groups = SaveEmployee.class)
    private String name;
    @AbdullahRange(min = 18,mx = 50,groups = SaveEmployee.class)
    private int age;
    @Email(groups = SaveEmployee.class)
    private  String email;
//@Pattern(regexp = "(\\+88)?01[3-9]\\d{8}",message = "invalid bangladeshi Phone number")
    @BDPhoneNumber(groups = SaveEmployee.class,payload = Error.class)
    private  String phone;
  @Valid
  private  Address address;

    public Employee(int id, String name, int age, String email, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
