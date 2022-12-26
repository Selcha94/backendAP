package com.backend.crud.repository;

import com.backend.crud.model.ProyectosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends CrudRepository<ProyectosModel,Long> {
}
