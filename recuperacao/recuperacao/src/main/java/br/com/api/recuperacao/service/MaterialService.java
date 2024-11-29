package br.com.api.recuperacao.service;

import br.com.api.recuperacao.exception.ResourceNotFoundException;
import br.com.api.recuperacao.models.Material;
import br.com.api.recuperacao.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepository repository;

    public Material salvar(Material material) {
        return repository.save(material);
    }

    public List<Material> listar() {
        return repository.findAll();
    }

    public Material buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Material não encontrado com ID " + id));
    }

    public void excluir(Long id) {
        buscarPorId(id); 
        repository.deleteById(id);
    }
}
