package com.backend.crud.service;

import com.backend.crud.model.UsuarioModel;
import com.backend.crud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> getAll(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    public Optional<UsuarioModel> get(Long id){
        return usuarioRepository.findById(id);
    }
    public UsuarioModel save(UsuarioModel e){
        return usuarioRepository.save(e);
    }
    public boolean delete(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
