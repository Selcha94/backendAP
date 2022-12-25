package com.backend.crud.controller;

import com.backend.crud.model.EstudiosModel;
import com.backend.crud.service.EstudiosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/estudios")
public class EstudiosController {
    @Autowired
    EstudiosService estudiosService;
    @GetMapping ()
    public ArrayList<EstudiosModel> listaEstudios(){
        return estudiosService.getAll();
    }
    @GetMapping (path = "/{id}")
    public Optional<EstudiosModel> consultarPorId(@PathVariable("id") long id){
        return estudiosService.get(id);
    }
    @GetMapping (path = "/consultar")
    public ArrayList<EstudiosModel> consultarPorTitulo(@RequestParam("titulo") String titulo){
        return estudiosService.getByTitulo(titulo);
    }
    @PostMapping
    public EstudiosModel guardar(@RequestBody EstudiosModel e){
        return estudiosService.save(e);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable("id") long id){
        boolean res = estudiosService.delete(id);
        Map datos = new HashMap ();
        datos.put("mensaje","Datos eliminados con exito!");
        if(!res){
            datos.put("mensaje","No existe el registro con id: "+id);
        }
        datos.put("respuesta",res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);
    }

}
