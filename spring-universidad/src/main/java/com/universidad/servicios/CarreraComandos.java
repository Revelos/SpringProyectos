package com.universidad.servicios;

import com.universidad.modelo.entidades.Carrera;
import com.universidad.servicios.contratos.CarreraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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


    }
}
