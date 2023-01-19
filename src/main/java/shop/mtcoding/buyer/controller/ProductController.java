package shop.mtcoding.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping({ "/", "/product" })
    public String findAll(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);
        return "/product/list";
    }

    @GetMapping("/product/{id}")
    public String findOne(@PathVariable int id, Model model) {
        Product product = productRepository.findById(id);
        model.addAttribute("product", product);
        return "/product/detail";
    }

    @GetMapping("/product/purchaseForm")
    public String purchaseForm() {
        return "/purchase/purchaseForm";
    }

    @PostMapping("/product/update")
    public String update(@PathVariable int id, int qty) {
        int result = productRepository.findByQty(qty);
        if (result == 1) {
            return "redirect:/product" + id;
        } else {
            return "redirect:/product";
        }

    }

}
