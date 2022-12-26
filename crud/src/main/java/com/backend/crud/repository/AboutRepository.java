package com.backend.crud.repository;

import com.backend.crud.model.AboutModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends CrudRepository<AboutModel,Long> {
}
