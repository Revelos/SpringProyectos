package com.universidad.repositorios;

import com.universidad.modelo.entidades.Alumno;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repositorioAlumnos")
public interface AlumnoRepository extends PersonaRespository{

    List<Alumno> findByNombre(String nombre);

}
