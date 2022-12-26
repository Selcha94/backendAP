package com.backend.crud.controller;

import com.backend.crud.model.UsuarioModel;
import com.backend.crud.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    @GetMapping()
    public ArrayList<UsuarioModel> listUser(){
        return  usuarioService.getAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> conUser(@PathVariable("id") long id){
        return usuarioService.get(id);
    }
    @PostMapping()
    public UsuarioModel registrarUser(@RequestBody UsuarioModel e){
        return  usuarioService.save(e);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> borrarUser(@PathVariable("id") long id){
        boolean res =  usuarioService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Datos eliminados con exito!");
        if(!res){
            datos.put("mensaje","No existe el registro con id: "+id);
        }
        datos.put("respuesta",res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
