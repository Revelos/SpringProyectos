package com.universidad.controlador;

import com.universidad.exception.BadRequestException;
import com.universidad.modelo.entidades.Carrera;
import com.universidad.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
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
    @RequestMapping(method = RequestMethod.POST)
    public Carrera ingresarCarrera(@RequestBody Carrera carrera){

        if(carrera.getCantidadAnios()<0){
            throw new BadRequestException("El campo no puede ser menor a 0");
        }
        if(carrera.getCantidadMaterias()<0){
            throw new BadRequestException("El campo no puede ser menor a cero");
        }

        return  carreraDAO.save(carrera);

        /*try{
            Carrera c =carreraDAO.save(carrera);
            return ResponseEntity.status(HttpStatus.OK).body(c);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new String());*/
    }

    @PutMapping("/{id}")
    public Carrera actualizarCarrera(@PathVariable(value = "id") Integer id,@RequestBody Carrera carrera){
        Carrera carreraUpdate=null;
        Optional<Carrera> oCarrera = carreraDAO.findById(id);
        if(!oCarrera.isPresent()){
            throw new BadRequestException(String.format("La carrera con id %d no existe",id));
        }
        //carrera.setId(id);
        carreraUpdate = oCarrera.get();
        carreraUpdate.setCantidadAnios(carrera.getCantidadAnios());
        carreraUpdate.setCantidadMaterias(carrera.getCantidadMaterias());
        return carreraDAO.save(carreraUpdate);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminarCarrera(@PathVariable Integer id){
        carreraDAO.deleteById(id);
    }
}
