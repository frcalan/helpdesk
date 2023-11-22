package io.github.frcalan.helpdesk.Resources;

import io.github.frcalan.helpdesk.domain.Chamado;
import io.github.frcalan.helpdesk.domain.dtos.ChamadoDTO;
import io.github.frcalan.helpdesk.services.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/chamados")
public class ChamadoResource {

    @Autowired
    private ChamadoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ChamadoDTO> findById(@PathVariable Integer id) {
        Chamado obj = service.FindById(id);
        return  ResponseEntity.ok().body(new ChamadoDTO(obj));
    }
}
