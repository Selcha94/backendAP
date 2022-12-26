package com.backend.crud.repository;

import com.backend.crud.model.HabilidadesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepository extends CrudRepository<HabilidadesModel,Long> {
}
