package io.github.frcalan.helpdesk.services;

import io.github.frcalan.helpdesk.domain.Chamado;
import io.github.frcalan.helpdesk.repositories.ChamadoRepository;
import io.github.frcalan.helpdesk.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ChamadoService {
    @Autowired
    private ChamadoRepository repository;

    public Chamado FindById(Integer id) {
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ID: " + id));
    }

    public List<Chamado> findAll() {
        return repository.findAll();
    }
}
