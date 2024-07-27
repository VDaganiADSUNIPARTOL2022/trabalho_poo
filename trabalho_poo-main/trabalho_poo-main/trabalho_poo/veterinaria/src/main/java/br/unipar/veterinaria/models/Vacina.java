package br.unipar.veterinaria.models;

import java.util.Date;

public class Vacina {
    private int id;
    private String nome;
    private String fabricante;
    private Date dataValidade;
    private String dose;

    public Vacina() {
    }

    public Vacina(int id, String nome, String fabricante, Date dataValidade, String dose) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataValidade = dataValidade;
        this.dose = dose;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
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
