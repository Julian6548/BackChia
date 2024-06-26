package com.example.demo.controller;

import com.example.demo.business.ProductoBL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST}, allowedHeaders = {"Authorization","transfer-encoding", "Content-Type"})//, exposedHeaders = {"Authorization","transfer-encoding", "Content-Type"})
@RequestMapping("prueba")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductController {
    private final ProductoBL productoBL;

    @GetMapping("producto")
    public Object getProducto(@RequestParam(value = "producto") int idProducto) {
        return productoBL.getProducto(idProducto);
    }

    @GetMapping("productos")
    public Object getProductos() {
        return productoBL.getProductos();
    }
}
