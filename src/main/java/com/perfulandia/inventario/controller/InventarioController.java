package com.perfulandia.inventario.controller;

import model.Perfume;
import model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


//public List<Usuario> obtenerUsuario(){
//    return usuarioSErvice.obtenterUsuario()
//}

@RestController
//@RequestMapping("/producto")
public class InventarioController {

    @GetMapping("/produ")
    public HashMap listaProd(){

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Hugo Bozzzzzz");


        return hashMap;
    }




    @PostMapping("/user")
    public HashMap<Integer, String> crearUsuario(@RequestBody Usuario usuario){
        HashMap<Integer, String> listaUser = new HashMap<>();





    }



}
