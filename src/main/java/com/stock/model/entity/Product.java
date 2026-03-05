package com.stock.model.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tbl_product")
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Max(value = 10)
    private String SKU;

    @NotBlank
    private String name;


    private BigDecimal price;

    @NotNull
    @Min(value = 0)
    private Integer quantityStock;

    @NotNull
    @Min(value = 0)
    private Integer qtdArea;

    @NotNull
    @Min(value = 0)
    private Integer totalProduct;

    @NotBlank
    private String description;

    @OneToOne
    private Category category;

}
