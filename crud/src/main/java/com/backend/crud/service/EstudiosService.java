package com.backend.crud.service;

import com.backend.crud.model.EstudiosModel;
import com.backend.crud.repository.EstudiosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstudiosService {
    @Autowired
    EstudiosRepository estudiosRepository;

    public ArrayList<EstudiosModel> getAll(){
        return (ArrayList<EstudiosModel>) estudiosRepository.findAll();
    }
    public ArrayList<EstudiosModel> getByTitulo(String titulo){
        return estudiosRepository.findByTitulo(titulo);
    }
    public Optional<EstudiosModel> get(long id){
        return estudiosRepository.findById(id);
    }
    public EstudiosModel save(EstudiosModel e){
        return estudiosRepository.save(e);
    }
    public boolean delete(Long id){
        try{
            estudiosRepository.deleteById(id);
            return true;
        }
        catch ( Exception e){
            return false;
        }

    }

}
