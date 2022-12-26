package com.backend.crud.controller;

import com.backend.crud.model.AboutModel;
import com.backend.crud.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/about")
public class AboutController {
    @Autowired
    AboutService aboutService;
    @GetMapping()
    public ArrayList<AboutModel> listAbout(){
        return  aboutService.getAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<AboutModel> conAbout(@PathVariable("id") long id){
        return aboutService.get(id);
    }
    @PostMapping()
    public AboutModel registrarAbout(@RequestBody AboutModel e){
        return aboutService.save(e);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> borrarAbout(@PathVariable("id") long id){
        boolean res =  aboutService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Datos eliminados con exito!");
        if(!res){
            datos.put("mensaje","No existe el registro con id: "+id);
        }
        datos.put("respuesta",res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
