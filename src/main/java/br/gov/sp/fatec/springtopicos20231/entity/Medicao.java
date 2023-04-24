package br.gov.sp.fatec.springtopicos20231.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mdc_medicao")
public class Medicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mdc_id")//ok
    private Long id;

    @Column(name = "mdc_data_hora")//ok
    private LocalDateTime dataHora;

    @Column(name = "mdc_temperatura")//ok
    private Float temperatura;

    @Column(name = "mdc_umidade")//ok
    private Float umidade;

    @Column(name = "mdc_particulas")//ok
    private Float particulas;

    @Column(name = "mdc_status")//ok
    private String status;

    @Column(name = "mdc_data_processamento")
    private LocalDateTime dataProcessamento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Float getUmidade() {
        return umidade;
    }

    public void setUmidade(Float umidade) {
        this.umidade = umidade;
    }

    public Float getParticulas() {
        return particulas;
    }

    public void setParticulas(Float particulas) {
        this.particulas = particulas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(LocalDateTime dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }

}