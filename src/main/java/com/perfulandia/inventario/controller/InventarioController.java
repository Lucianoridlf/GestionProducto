package com.perfulandia.inventario.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class InventarioController {

    @GetMapping("/productos")
    public String listarProd(){
        return "Aqui van los productos, bro";

    }


}
