package com.altocirrusapps.apps.joatbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altocirrusapps.apps.joatbackend.entities.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {

}
