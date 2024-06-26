package com.example.demo.business;

import com.example.demo.Interface.ILogicaNegocio;
import com.example.demo.dto.BadResponseDto;
import com.example.demo.dto.ProductoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class LogicaNegocio implements ILogicaNegocio {
    @Override
    public Object pruebaHola(String nombre) {
        return "hola "+nombre;
    }

    @Override
    public Object productos(ProductoDto producto) {
      /*  BadResponseDto badResponse = BadResponseDto.builder().message("No se encontro producto").code(HttpStatus.BAD_REQUEST.value() + "").build();
        return new ResponseEntity<>(badResponse, HttpStatus.BAD_REQUEST);*/
        return producto;
    }
}
