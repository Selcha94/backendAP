package com.backend.crud.service;


import com.backend.crud.model.ProyectosModel;
import com.backend.crud.repository.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProyectosService {
    @Autowired
    ProyectosRepository proyectosRepository;
    public ArrayList<ProyectosModel> getAll(){
        return (ArrayList<ProyectosModel>) proyectosRepository.findAll();
    }
    public Optional<ProyectosModel> get(long id){
        return proyectosRepository.findById(id);
    }
    public ProyectosModel save(ProyectosModel e){
        return proyectosRepository.save(e);
    }
    public boolean delete(Long id){
        try{
            proyectosRepository.deleteById(id);
            return true;
        }
        catch ( Exception e){
            return false;
        }

    }
}
