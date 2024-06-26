package com.example.demo.Interface;

import com.example.demo.dto.ProductoDto;

import java.util.List;

public interface IProductBL {
    Object getProducto(int idProducto);
    List<ProductoDto> getProductos();
}
