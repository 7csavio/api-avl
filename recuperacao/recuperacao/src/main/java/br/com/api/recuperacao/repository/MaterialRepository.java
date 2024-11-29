package br.com.api.recuperacao.repository;

import br.com.api.recuperacao.models.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material, Long> {}
