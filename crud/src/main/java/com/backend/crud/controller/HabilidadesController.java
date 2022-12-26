package com.backend.crud.controller;

import com.backend.crud.model.HabilidadesModel;
import com.backend.crud.service.HabilidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/habilidades")
public class HabilidadesController {
    @Autowired
    HabilidadesService habilidadesService;

    @GetMapping()
    public ArrayList<HabilidadesModel> listSkill(){
        return  habilidadesService.getAll();
    }
    @GetMapping(path = "/{id}")
    public Optional<HabilidadesModel> conSkill(@PathVariable("id") long id){
        return habilidadesService.get(id);
    }
    @PostMapping()
    public HabilidadesModel registrarSkill(@RequestBody HabilidadesModel e){
        return  habilidadesService.save(e);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> borrarSkill(@PathVariable("id") long id){
        boolean res =  habilidadesService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Datos eliminados con exito!");
        if(!res){
            datos.put("mensaje","No existe el registro con id: "+id);
        }
        datos.put("respuesta",res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }
}
