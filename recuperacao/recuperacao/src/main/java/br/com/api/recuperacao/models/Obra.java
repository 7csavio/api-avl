package br.com.api.recuperacao.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Double totalGasto;


    public Obra() {}


    public Obra(Long id, LocalDate dataInicio, LocalDate dataFim, Double totalGasto) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.totalGasto = totalGasto;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(Double totalGasto) {
        this.totalGasto = totalGasto;
    }


    @Override
    public String toString() {
        return "Obra{" +
                "id=" + id +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", totalGasto=" + totalGasto +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obra obra = (Obra) o;
        return id != null && id.equals(obra.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
