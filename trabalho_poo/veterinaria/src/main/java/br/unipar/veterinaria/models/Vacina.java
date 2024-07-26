package br.unipar.veterinaria.models;

import java.util.Date;

public class Vacina {
    private int id;
    private String nome;
    private String fabricante;
    private Date dataValidade;

    public Vacina() {
    }

    public Vacina(int id, String nome, String fabricante, Date dataValidade) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataValidade = dataValidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean isVencida() {
        return new Date().after(dataValidade);
    }
}
