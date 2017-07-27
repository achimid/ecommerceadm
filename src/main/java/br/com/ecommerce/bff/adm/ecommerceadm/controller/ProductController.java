package br.com.ecommerce.bff.adm.ecommerceadm.controller;

import br.com.ecommerce.bff.adm.ecommerceadm.client.ProductClient;
import br.com.ecommerce.bff.adm.ecommerceadm.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private static final String INDEX_PAGE = "index";

    @Autowired
    private ProductClient productClient;

    @GetMapping
    public ModelAndView index(){
        List<ProductDTO> products = productClient.findAll();
        return new ModelAndView(INDEX_PAGE).addObject("products", products);
    }


}
