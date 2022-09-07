package com.universidad.repositorios;

import com.universidad.modelo.entidades.Aula;
import com.universidad.modelo.entidades.enumeradores.Pizarron;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface AulaRepository extends CrudRepository<Aula, Integer> {

    Iterable<Aula> findAulaByPizarron(Pizarron pizarron);
}
