package com.example.demo.dto;

import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
public class ServiciosDto {
    private int idServicio;
    private String descripcion;
    private double precio;
}
