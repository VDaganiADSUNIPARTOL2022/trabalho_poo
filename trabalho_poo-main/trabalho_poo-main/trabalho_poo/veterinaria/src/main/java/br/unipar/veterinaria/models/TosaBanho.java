package br.unipar.veterinaria.models;

import java.util.Date;

public class TosaBanho {
	
    private int id;
    private Animal animal;
    private Date data;
    private String tipo;
    private boolean marcado;

    public TosaBanho() {
    }

    public TosaBanho(int id, Animal animal, Date data, String tipo, boolean marcado) {
        this.id = id;
        this.animal = animal;
        this.data = data;
        this.tipo = tipo;
        this.marcado = marcado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }
}
