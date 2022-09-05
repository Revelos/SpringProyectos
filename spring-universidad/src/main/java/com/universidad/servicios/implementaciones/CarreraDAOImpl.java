package com.universidad.servicios.implementaciones;

import com.universidad.modelo.entidades.Carrera;
import com.universidad.repositorios.CarreraRepository;
import com.universidad.servicios.contratos.CarreraDAO;
import com.universidad.servicios.contratos.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CarreraDAOImpl extends GenericDAOImpl<Carrera,CarreraRepository> implements CarreraDAO {

    @Autowired
    public CarreraDAOImpl(CarreraRepository repository) {
        super(repository);
    }

}
