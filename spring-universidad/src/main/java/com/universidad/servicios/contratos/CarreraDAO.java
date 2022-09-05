package com.universidad.servicios.contratos;

import com.universidad.modelo.entidades.Carrera;
import java.util.Optional;

public interface CarreraDAO extends GenericDAO<Carrera>{
    @Override
    Optional<Carrera> findById(Integer id);

    @Override
    Carrera save(Carrera carrera);

    @Override
    Iterable<Carrera> findAll();

    @Override
    void deleteById(Integer id);
}
