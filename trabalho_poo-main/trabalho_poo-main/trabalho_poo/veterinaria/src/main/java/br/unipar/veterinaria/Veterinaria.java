package br.unipar.veterinaria;

import br.unipar.veterinaria.models.Animal;
import br.unipar.veterinaria.models.Endereco;
import br.unipar.veterinaria.models.Especie;
import br.unipar.veterinaria.models.Proprietario;
import br.unipar.veterinaria.models.RacaAnimal;
import br.unipar.veterinaria.models.Telefone;
import br.unipar.veterinaria.models.TosaBanho;
import java.util.Date;

/*
   Desenvolver a camada de modelagem de domínio(Classes de Modelo) de uma aplicação de clínica veterinária
   atendendo aos requisitos abaixo:

    RQF.001 - Manter animais 
    Poder ter acesso às informações sobre todos os animais que são tratados na clínica.

    RQF.002 - Manter proprietários 
    Poder ter acesso às informações sobre todos o proprietários que visitam a clínica

    RQF.003 - Manter Médicos Veterinarios 
    Manter os dados dos profissionais médicos veterinários que atendem na clínica e realizam as consultas.

    RQF.004 - Controlar Consultas 
    Saber quais animais estão sendo consultados e quais são as medicações que cada um recebe e valor total a ser cobrado do proprietário considerando os medicamentos, exames e o valor da consulta.

    RQF.005 - Controlar vacinações 
    Controlar se os animais estão corretamente vacinados e controlar a data da segunda dose.

    RQF.006 -  Controlar tosa/banho Controlar os banhos e tosas que cada animal teve e se há algum banho/tosa marcado.

    RQF.007 - Manter Vacinas 
    Poder ter acesso às informações e dados das vacinas fornecidas pela clínica.

    RQF.008 - Manter medicamentos 
    Poder ter acesso às informações e dados dos medicamentos utilizados durante as consultas.

    RQF.009 - Manter exames 
    Poder ter acesso às informações e dados dos exames prestados pela clínica durante as consultas.
 */
public class Veterinaria {

    public static void main(String[] args) {
        
        
        Telefone telefone = new Telefone();
        telefone.setId(1);
        telefone.setDdd("ddd");
        telefone.setNumero("numero");
        
        Endereco endereco = new Endereco();
        endereco.setId(1);
        endereco.setCep("cep");
        endereco.setCidade("cidade");
        endereco.setEstado("estado");
        endereco.setNumero("numero");
        endereco.setPais("pais");
        endereco.setRua("rua");
        
        Especie gato = new Especie();
        gato.setId(1);
        gato.setNome("gato");
        
        RacaAnimal siames = new RacaAnimal();
        siames.setId(1);
        siames.setNome("siames");
        

        
        
        Proprietario proprietario = new Proprietario();
        proprietario.setId(1);
        proprietario.setNome("Elias");
        proprietario.setTelefone(telefone);
        proprietario.setEndereco(endereco);
        proprietario.setEmail("email");
        

        
       Animal animal = new Animal();
       animal.setId(1);
       animal.setIdade(2);
       animal.setNome("Felix");
       animal.setEspecie(gato);
       animal.setProprietario(proprietario);
       animal.setRaca(siames);

       
        TosaBanho tosaBanho = new TosaBanho();
        tosaBanho.setId(0);
        tosaBanho.setAnimal(animal);
        tosaBanho.setTipo("banho");
        tosaBanho.setData(new Date());
        tosaBanho.setMarcado(true); 
       
       
    }
}
