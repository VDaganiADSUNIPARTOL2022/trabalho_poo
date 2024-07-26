package br.unipar.veterinaria.models;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
	
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    private List<Animal> animais = new ArrayList<>();

    public Proprietario() {
    }

    public Proprietario(int id, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void adicionarAnimal(Animal animal) {
        if (animal != null && !animais.contains(animal)) {
            animais.add(animal);
            animal.setProprietario(this);
        }
    }

    public void removerAnimal(Animal animal) {
        if (animal != null && animais.contains(animal)) {
            animais.remove(animal);
            animal.setProprietario(null);
        }
    }
}