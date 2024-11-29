package br.com.api.recuperacao.repository;

import br.com.api.recuperacao.models.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObraRepository extends JpaRepository<Obra, Long> {}
