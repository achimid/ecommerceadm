package br.com.ecommerce.bff.adm.ecommerceadm.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Created by Lourran on 16/07/2017.
 */
@Data
public class OrderDetailDTO{

    private Long id;
    private OrderDTO order;
    private ProductDTO product;
    private BigDecimal price;
    private BigDecimal quantity;

}
