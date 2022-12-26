package com.backend.crud.controller;

import com.backend.crud.model.ProyectosModel;
import com.backend.crud.service.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired
    ProyectosService proyectosService;
    @GetMapping()
    public ArrayList<ProyectosModel> listProject(){
        return  proyectosService.getAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<ProyectosModel> conProject(@PathVariable("id") long id){
        return proyectosService.get(id);
    }
    @PostMapping()
    public ProyectosModel registrarProject(@RequestBody ProyectosModel e){
        return  proyectosService.save(e);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> borrarProject(@PathVariable("id") long id){
        boolean res =  proyectosService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Datos eliminados con exito!");
        if(!res){
            datos.put("mensaje","No existe el registro con id: "+id);
        }
        datos.put("respuesta",res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }

}
