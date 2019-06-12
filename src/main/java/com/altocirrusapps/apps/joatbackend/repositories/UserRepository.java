package com.altocirrusapps.apps.joatbackend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.altocirrusapps.apps.joatbackend.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
