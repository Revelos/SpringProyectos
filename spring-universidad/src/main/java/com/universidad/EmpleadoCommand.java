package com.universidad;

import com.universidad.modelo.entidades.Direccion;
import com.universidad.modelo.entidades.Empleado;
import com.universidad.modelo.entidades.Persona;
import com.universidad.modelo.entidades.enumeradores.TipoEmplado;
import com.universidad.servicios.contratos.EmpleadoDAO;
import com.universidad.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class EmpleadoCommand implements CommandLineRunner {

    @Autowired
    @Qualifier("empleadoDAOImpl")
    private PersonaDAO servicio;

    @Override
    public void run(String... args) throws Exception {

        /*Direccion direccion = new Direccion("calle pte","23","123-8","San Salvador","6","3");

        Persona persona = new Empleado(null,"Veronica","Mendez","23456-9", direccion,new BigDecimal(1000.56), TipoEmplado.ADMINITRATIVO);


        Persona p = servicio.save(persona);
        //System.out.println(p);

        //EJERCICIO 2
        System.out.println(((EmpleadoDAO)servicio).findEmpleadoByTipoEmpleado(TipoEmplado.ADMINITRATIVO));*/

    }
}
