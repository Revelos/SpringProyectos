package com.universidad.servicios.implementaciones;

import com.universidad.modelo.entidades.Persona;
import com.universidad.repositorios.PersonaRespository;
import com.universidad.servicios.contratos.PersonaDAO;

import java.util.Optional;

public class PersonaDAOImpl extends GenericDAOImpl<Persona, PersonaRespository> implements PersonaDAO {

    public PersonaDAOImpl(PersonaRespository repository) {
        super(repository);
    }

    @Override
    public Optional<Persona> buscarPorNombreYApellido(String nombre, String apellido) {
        return Optional.empty();
    }

    @Override
    public Optional<Persona> buscarPorDni(String dni) {
        return Optional.empty();
    }

    @Override
    public Optional<Persona> buscarPersonaPorApellido(String apellido) {
        return Optional.empty();
    }
}
