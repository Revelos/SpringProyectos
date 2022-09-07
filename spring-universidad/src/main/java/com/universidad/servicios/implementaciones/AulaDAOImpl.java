package com.universidad.servicios.implementaciones;

import com.universidad.modelo.entidades.Aula;
import com.universidad.modelo.entidades.enumeradores.Pizarron;
import com.universidad.repositorios.AulaRepository;
import com.universidad.servicios.contratos.AulaDAO;
import org.springframework.stereotype.Service;

@Service
public class AulaDAOImpl extends GenericDAOImpl<Aula, AulaRepository> implements AulaDAO {
    public AulaDAOImpl(AulaRepository repository) {
        super(repository);
    }

    @Override
    public Iterable<Aula> findAulaByPizarron(Pizarron pizarron) {
        return repository.findAulaByPizarron(pizarron);
    }
}
