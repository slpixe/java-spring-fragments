package com.example.springfragmets.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute("username")
    public String addUsernameToModel() {
        return "Bobby BOB"; // Mock username
    }
}
