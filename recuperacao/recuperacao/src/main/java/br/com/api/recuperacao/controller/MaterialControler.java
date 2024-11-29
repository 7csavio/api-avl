package br.com.api.recuperacao.controller;

import br.com.api.recuperacao.models.Material;
import br.com.api.recuperacao.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiais")
public class MaterialControler {

    @Autowired
    private MaterialService service;

    @PostMapping
    public ResponseEntity<Material> salvar(@RequestBody Material material) {
        return ResponseEntity.ok(service.salvar(material));
    }

    @GetMapping
    public ResponseEntity<List<Material>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Material> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
