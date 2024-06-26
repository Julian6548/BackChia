package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder

public class ProductoDto {
    private int codigo;
    private String descripcion;
    private Double precio;
    private String rutaImage;
}
