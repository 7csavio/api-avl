package br.com.api.recuperacao.repository;

import br.com.api.recuperacao.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
