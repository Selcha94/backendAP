package com.backend.crud.repository;

import com.backend.crud.model.EstudiosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudiosRepository extends CrudRepository<EstudiosModel,Long> {
    public abstract ArrayList<EstudiosModel> findByTitulo(String titulo);

}
