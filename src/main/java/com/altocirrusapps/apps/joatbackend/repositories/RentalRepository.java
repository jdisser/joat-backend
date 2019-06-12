package com.altocirrusapps.apps.joatbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altocirrusapps.apps.joatbackend.entities.Rental;

@Repository
public interface RentalRepository extends CrudRepository<Rental, Long> {

}
