package com.backend.crud.service;

import com.backend.crud.model.HabilidadesModel;
import com.backend.crud.repository.HabilidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class HabilidadesService {
    @Autowired
    HabilidadesRepository habilidadesRepository;

    public ArrayList<HabilidadesModel> getAll(){
        return (ArrayList<HabilidadesModel>) habilidadesRepository.findAll();
    }
    public Optional<HabilidadesModel> get(Long id){
        return habilidadesRepository.findById(id);
    }
    public HabilidadesModel save(HabilidadesModel e){
        return habilidadesRepository.save(e);
    }
    public boolean delete(Long id){
        try{
            habilidadesRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
