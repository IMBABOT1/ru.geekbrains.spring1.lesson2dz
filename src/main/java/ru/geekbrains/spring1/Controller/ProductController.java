package ru.geekbrains.spring1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.spring1.Model.Product;
import ru.geekbrains.spring1.Service.ProductService;
import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/get_products")
    public String getAllProducts(Model model){
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "product";
    }

    @GetMapping("/add_product")
    public String addProduct(@RequestParam long id, @RequestParam String title, @RequestParam long cost){
        Product product = new Product(id, title, cost);
        productService.addProduct(product);
        return "redirect:/get_products";
    }

    @GetMapping("/remove_product/{id}")
    public String removeProduct(@PathVariable Long id){
        productService.deleteByID(id);
        return "redirect:/get_products";
    }

}
