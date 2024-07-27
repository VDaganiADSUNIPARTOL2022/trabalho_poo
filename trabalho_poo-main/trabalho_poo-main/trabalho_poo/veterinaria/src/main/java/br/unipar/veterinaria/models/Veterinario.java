package br.unipar.veterinaria.models;

import br.unipar.veterinaria.models.enums.Especialidade;

public class Veterinario {
	
    private int id;
    private String nome;
    private Telefone telefone;
    private String email;
    private Especialidade especialidade;

    public Veterinario() {
    }

    public Veterinario(int id, String nome, Telefone telefone, String email, Especialidade especialidade) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.especialidade = especialidade;
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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
}
