package br.com.ecommerce.bff.adm.ecommerceadm.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Collection;

/**
 * Created by Lourran on 22/07/2017.
 */
@Data
public class CategoryDTO {
    private Long id;
    private String name;
    private String description;


    @JsonIgnore
    private Collection errors;
}
