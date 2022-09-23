package com.universidad.repositorios;

import com.universidad.modelo.entidades.Persona;
import com.universidad.modelo.entidades.Profesor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository("repositorioProfesor")
public interface ProfesorRepository extends PersonaRespository{

    @Override
    @Query("select p from Profesor p inner join Persona a on p.id=a.id")
    Iterable<Persona> findAll();

    @Query("select p from Profesor p  join fetch p.carreras c where c.nombre=?1")
    Iterable<Persona>  findProfesoresByCarrera(String carrera);

    @Query("select p from Profesor p where p.sueldo>?1")
   Iterable<Profesor> findProfesoresBySalarioGreaterThan(BigDecimal salario);
}
