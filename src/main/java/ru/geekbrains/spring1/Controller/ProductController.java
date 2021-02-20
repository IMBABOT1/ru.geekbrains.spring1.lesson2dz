package ru.geekbrains.spring1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/get_products")
    public String getAllProducts(){
        return "product";
    }
}
