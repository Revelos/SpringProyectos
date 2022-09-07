package com.universidad.controlador;

import com.universidad.exception.BadRequestException;
import com.universidad.modelo.entidades.Carrera;
import com.universidad.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carreras")
public class CarreraController {
    private final CarreraDAO carreraDAO;

    @Autowired
    public CarreraController(CarreraDAO carreraDAO) {
        this.carreraDAO = carreraDAO;
    }

    @GetMapping
    public List<Carrera> obtenerTodos(){
        List<Carrera> carreras = (List<Carrera>) carreraDAO.findAll();
        if(carreras.isEmpty()){
            throw new BadRequestException("No existen carreras");
        }
        return carreras;
    }

    @RequestMapping(value = "/{codigo}")
    public Carrera obtenerPorId(@PathVariable(value = "codigo",required = false)Integer id){
        Optional<Carrera> oCarrera = carreraDAO.findById(id);
        if(!oCarrera.isPresent()){
            throw new BadRequestException(String.format("La carrera con id %d no existe",id));
        }
        return oCarrera.get();
    }
}
