package com.universidad.servicios.contratos;

import com.universidad.modelo.entidades.Carrera;
import java.util.Optional;

public interface CarreraDAO {

    Optional<Carrera> findById(Integer id);
    Carrera save(Carrera carrera);
    Iterable<Carrera> findAll();
    void delete(Integer id);

}
