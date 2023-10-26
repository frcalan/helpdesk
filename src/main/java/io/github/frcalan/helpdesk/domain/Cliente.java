package io.github.frcalan.helpdesk.domain;

import io.github.frcalan.helpdesk.domain.enums.Perfil;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa {
    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy = "cliente")
    private List<Chamado> chamados = new ArrayList<>();

    public Cliente() {
        addPefis(Perfil.CLIENTE);
    }

    public Cliente(Integer id, String nome, String cpf, String email, String senha, List<Chamado> chamados) {
        super(id, nome, cpf, email, senha);
        addPefis(Perfil.CLIENTE);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
