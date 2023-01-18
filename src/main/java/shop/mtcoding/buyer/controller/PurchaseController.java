package shop.mtcoding.buyer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import shop.mtcoding.buyer.model.Product;
import shop.mtcoding.buyer.model.PurchaseRepository;

@Controller
public class PurchaseController {

    @Autowired
    PurchaseRepository purchaseRepository;

    @GetMapping("/purchase")
    public String findAll(Model model) {
        List<Product> purchaseList = purchaseRepository.findAll();
        model.addAttribute("purchaseList", purchaseList);
        return "/purchaseForm";
    }

    @GetMapping("/purchase/purchaseForm")
    public String purchaseForm() {
        return "/purchase/purchaseForm";
    }
    // @GetMapping("/product/purchaseForm")
    // public String purchaseForm(int qty) {
    // int result = purchaseRepository.insert(qty);
    // if (result == 1) {
    // return "/purchase/{id}";
    // } else {
    // return "/purchase/purchaseForm";
    // }
    // }

    // @PostMapping("/product/purchase")
    // public String insert(int userId, int productId, int qty) {
    // purchaseRepository.findById();
    // return "";
    // }
}
