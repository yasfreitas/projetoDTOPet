package com.projetoPetDto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoPetDto.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
