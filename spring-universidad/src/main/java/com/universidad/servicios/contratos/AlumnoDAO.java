package com.universidad.servicios.contratos;

import com.universidad.modelo.entidades.Carrera;
import com.universidad.modelo.entidades.Persona;

import java.util.Optional;

public interface AlumnoDAO extends PersonaDAO{

    Iterable<Persona> buscarAlumnosPorNombreCarrera(String nombre);


}
