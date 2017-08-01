package br.com.ecommerce.bff.adm.ecommerceadm.product;

import br.com.ecommerce.bff.adm.ecommerceadm.dto.CategoryDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Locale;

/**
 * Created by Lourran on 22/07/2017.
 */
@Data
public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal priceSale;
    private BigDecimal priceCost;
    private String url;
    private String description;
    private CategoryDTO category;

}