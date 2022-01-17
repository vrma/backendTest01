package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long>{

}
