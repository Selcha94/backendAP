package com.backend.crud.service;

import com.backend.crud.model.AboutModel;
import com.backend.crud.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AboutService {
    @Autowired
    AboutRepository aboutRepository;

    public ArrayList<AboutModel> getAll(){
        return (ArrayList<AboutModel>) aboutRepository.findAll();
    }
    public Optional<AboutModel> get(long id){
        return aboutRepository.findById(id);
    }
    public AboutModel save(AboutModel e){
        return aboutRepository.save(e);
    }
    public boolean delete(Long id){
        try{
            aboutRepository.deleteById(id);
            return true;
        }
        catch ( Exception e){
            return false;
        }

    }

}
