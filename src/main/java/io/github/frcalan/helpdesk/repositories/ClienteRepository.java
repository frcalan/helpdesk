package io.github.frcalan.helpdesk.repositories;

import io.github.frcalan.helpdesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
