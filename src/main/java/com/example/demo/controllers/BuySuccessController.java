package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuySuccessController {

    @GetMapping("/buySuccess")
    public String getBuySuccessPage() {
        return "buySuccess";
    }
}