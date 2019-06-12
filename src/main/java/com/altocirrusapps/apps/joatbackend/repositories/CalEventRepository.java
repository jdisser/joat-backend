package com.altocirrusapps.apps.joatbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altocirrusapps.apps.joatbackend.entities.CalEvent;

@Repository
public interface CalEventRepository extends CrudRepository<CalEvent, Long> {

}
