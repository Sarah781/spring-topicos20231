package br.gov.sp.fatec.springtopicos20231.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "texto_usuario")
public class textos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "texto_id")
    private Long id;

    @Column(name = "texto_nome")
    private String nome;

    @Column(name = "texto_senha")
    private String senha;

    public textos(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public textos() {
        // Do Nothing
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}