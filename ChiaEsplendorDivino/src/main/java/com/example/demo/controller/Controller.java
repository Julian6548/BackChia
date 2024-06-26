package com.example.demo.controller;

import com.example.demo.business.LogicaNegocio;
import com.example.demo.dto.ProductoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST}, allowedHeaders = {"Authorization","transfer-encoding", "Content-Type"})//, exposedHeaders = {"Authorization","transfer-encoding", "Content-Type"})
@RequestMapping("prueba")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class Controller {
private final LogicaNegocio logicaNegocio;
//private  final ProductoBL productos;
    @GetMapping("hola")
    public Object pruebaHola(@RequestParam(value = "nombre") String nombre) {
        return logicaNegocio.pruebaHola(nombre);
    }

    @PostMapping("prueba2")
    public Object pruebaPost(@RequestBody ProductoDto producto){
        return logicaNegocio.productos(producto);
    }


}
