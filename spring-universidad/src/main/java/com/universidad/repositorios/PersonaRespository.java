package com.universidad.repositorios;

import com.universidad.modelo.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonaRespository extends CrudRepository<Persona,Integer> {

}
