package com.example.demo.Interface;

import com.example.demo.dto.ProductoDto;

public interface ILogicaNegocio {
    Object pruebaHola(String nombre);

    Object productos(ProductoDto producto);
}
