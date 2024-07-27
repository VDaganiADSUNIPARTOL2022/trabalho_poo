package br.unipar.veterinaria.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Animal {
	
    private int id;
    private String nome;
    private Especie especie;
    private RacaAnimal raca;
    private int idade;
    private Proprietario proprietario;
    private List<TosaBanho> tosaBanhoEventos = new ArrayList<>();

    public Animal() {
    }

    public Animal(int id, String nome, Especie especie, RacaAnimal raca, int idade, Proprietario proprietario) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.proprietario = proprietario;
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

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public RacaAnimal getRaca() {
        return raca;
    }

    public void setRaca(RacaAnimal raca) {
        this.raca = raca;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public List<TosaBanho> getTosaBanhoEventos() {
        return tosaBanhoEventos;
    }

    public void setTosaBanhoEventos(List<TosaBanho> tosaBanhoEventos) {
        this.tosaBanhoEventos = tosaBanhoEventos;
    }

    public void adicionarTosaBanho(TosaBanho tosaBanho) {
        if (tosaBanho != null && !tosaBanhoEventos.contains(tosaBanho)) {
            tosaBanhoEventos.add(tosaBanho);
        }
    }

    public List<TosaBanho> obterEventosPassados() {
        List<TosaBanho> eventosPassados = new ArrayList<>();
        Date hoje = new Date();
        for (TosaBanho evento : tosaBanhoEventos) {
            if (evento.getData().before(hoje)) {
                eventosPassados.add(evento);
            }
        }
        return eventosPassados;
    }

    public List<TosaBanho> obterEventosFuturos() {
        List<TosaBanho> eventosFuturos = new ArrayList<>();
        Date hoje = new Date();
        for (TosaBanho evento : tosaBanhoEventos) {
            if (evento.getData().after(hoje) && evento.isMarcado()) {
                eventosFuturos.add(evento);
            }
        }
        return eventosFuturos;
    }
}
