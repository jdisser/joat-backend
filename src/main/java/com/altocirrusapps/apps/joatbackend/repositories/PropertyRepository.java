package com.altocirrusapps.apps.joatbackend.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altocirrusapps.apps.joatbackend.entities.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {

	public Optional<Property> findByName(String name);
}
