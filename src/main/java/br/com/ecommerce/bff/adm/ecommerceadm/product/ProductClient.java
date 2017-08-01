package br.com.ecommerce.bff.adm.ecommerceadm.product;

import br.com.ecommerce.bff.adm.ecommerceadm.product.ProductDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class ProductClient {

    @Value("${ecommerce-api.base-url}")
    private String ecommerceApiUrl;

    public List<ProductDTO> findAll(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List> response = restTemplate.getForEntity(ecommerceApiUrl.concat("/products"), List.class);
        return response.getBody();
    }

    public ProductDTO findOne(Long id){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ProductDTO> response = restTemplate.getForEntity(
                ecommerceApiUrl.concat("/products/").concat(id.toString()), ProductDTO.class);
        return response.getBody();
    }

}
