package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BuyNowController {

    @Autowired
    private ProductService productService;

    @GetMapping("/buyProduct")
    public String getBuyProductPage() {
        return "mainscreen"; // Assuming you want to return to the main screen after buying.
    }

    @PostMapping("/buyProduct")
    public String buyProduct(@RequestParam long productID, Model model) {
        boolean purchaseSuccess = productService.decrementInventory(productID);

        if (purchaseSuccess) {
            return "redirect:/buySuccess";
        } else {
            return "redirect:/buyFailure";
        }
    }
}
