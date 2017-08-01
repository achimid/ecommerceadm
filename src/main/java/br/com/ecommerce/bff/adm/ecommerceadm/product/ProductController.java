package br.com.ecommerce.bff.adm.ecommerceadm.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private static final String PRODUCT_INDEX = "pages/product/index";
    private static final String PRODUCT_NEW = "pages/product/new";

    @Autowired
    private ProductClient productClient;

    @GetMapping
    public ModelAndView index(){
        List<ProductDTO> products = productClient.findAll();
        return new ModelAndView(PRODUCT_INDEX).addObject("products", products);
    }

    @GetMapping("/{id}")
    public ModelAndView get(@PathVariable Long id){
        ProductDTO product = productClient.findOne(id);
        return new ModelAndView(PRODUCT_NEW).addObject("product", product);
    }

    @GetMapping("/new")
    public ModelAndView get(){
        ProductDTO product = new ProductDTO();
        return new ModelAndView(PRODUCT_NEW).addObject("product", product);
    }


}
