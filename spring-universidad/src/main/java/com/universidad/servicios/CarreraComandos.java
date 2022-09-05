package com.universidad.servicios;

import com.universidad.modelo.entidades.Carrera;
import com.universidad.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CarreraComandos implements CommandLineRunner {

    @Autowired
    private CarreraDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        /*Carrera ingSistemas = new Carrera(null,"Ingeneria en Sistemas ",44,5);
        Carrera save = servicio.save(ingSistemas);
        System.out.println(save.toString());

        save.setNombre("Licenciatura en Idiomas");
        servicio.save(save);*/


        /* Carrera ingSistemas = new Carrera(null,"Ingeneria en Sistemas ",44,5);
            Carrera car = serv.save(ingSistemas);
            //System.out.println(save.toString());*/


        //Carrera carrera = new Carrera(1,"Ingenieria",25,25);
            /*Direccion direccion = new Direccion("calle pte","23","123-8","San Salvador","6","3");
            Persona alumno = new Alumno(null,"Cristian","Revelo","1234567", direccion);
            //Alumno a = (Alumno) alumno;
            //a.setCarrera(car);
            Alumno save = (Alumno) servicio.save(alumno);
            System.out.println(save.toString());*/
        Carrera carrera = null;


        Optional<Carrera> carreras = servicio.findById(1);

        if(carreras.isPresent()){
            carrera = carreras.get();
            System.out.println(carrera.toString());
        }else{
            System.out.println("No existe la carrera con ese Id");
        }
        carrera.setCantidadMaterias(55);
        carrera.setCantidadAnios(6);

        servicio.save(carrera);
        System.out.println(servicio.findById(1).orElse(new Carrera()));
        servicio.deleteById(1);
        System.out.println(servicio.findById(1).orElse(new Carrera()));


    }
}
