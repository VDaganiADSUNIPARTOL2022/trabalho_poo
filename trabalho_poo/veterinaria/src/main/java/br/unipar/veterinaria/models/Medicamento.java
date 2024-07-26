package br.unipar.veterinaria.models;

import java.util.Date;

public class Medicamento {
	
    private int id;
    private String nome;
    private String fabricante;
    private Date dataValidade;
    private double preco;

    public Medicamento() {
    }

    public Medicamento(int id, String nome, String fabricante, Date dataValidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.dataValidade = dataValidade;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isVencido() {
        return new Date().after(dataValidade);
    }
}
