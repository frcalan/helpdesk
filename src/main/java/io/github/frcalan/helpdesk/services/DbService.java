package io.github.frcalan.helpdesk.services;

import io.github.frcalan.helpdesk.domain.Chamado;
import io.github.frcalan.helpdesk.domain.Cliente;
import io.github.frcalan.helpdesk.domain.Tecnico;
import io.github.frcalan.helpdesk.domain.enums.Perfil;
import io.github.frcalan.helpdesk.domain.enums.Prioridade;
import io.github.frcalan.helpdesk.domain.enums.Status;
import io.github.frcalan.helpdesk.repositories.ChamadoRepository;
import io.github.frcalan.helpdesk.repositories.ClienteRepository;
import io.github.frcalan.helpdesk.repositories.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DbService {


    @Autowired
    private TecnicoRepository tecnicoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;

    public void instanciaDB() {
        Tecnico tec1 = new Tecnico(null, "Técnico-01 Teste", "08370374093", "tec1test@mail.com", "123");
        tec1.addPefis(Perfil.ADMIN);

        Cliente cli1 = new Cliente(null, "Cliente01", "32499943084", "cli1@mail.com", "123", null);
        Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);

        tecnicoRepository.saveAll(Arrays.asList(tec1));
        clienteRepository.saveAll(Arrays.asList(cli1));
        chamadoRepository.saveAll(Arrays.asList(c1));
    }
}
