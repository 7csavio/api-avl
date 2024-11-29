package br.com.api.recuperacao.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class MaterialObra implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Material material;

    @ManyToOne
    private Obra obra;

    private Integer quantidade;
    private Double preco;


    public MaterialObra() {}


    public MaterialObra(Long id, Material material, Obra obra, Integer quantidade, Double preco) {
        this.id = id;
        this.material = material;
        this.obra = obra;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "MaterialObra{" +
                "id=" + id +
                ", material=" + material +
                ", obra=" + obra +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaterialObra that = (MaterialObra) o;
        return id != null && id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
