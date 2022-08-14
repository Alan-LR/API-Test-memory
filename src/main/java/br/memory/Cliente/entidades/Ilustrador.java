package br.memory.Cliente.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ilustrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIlustrador;
    private String nome;
    private Integer idade;
    @OneToMany(mappedBy = "ilustrador")
    private List<Hqs> obras;

    public Ilustrador() {
    }

    public Ilustrador(Integer idIlustrador, String nome, Integer idade, List<Hqs> obras) {
        this.idIlustrador = idIlustrador;
        this.nome = nome;
        this.idade = idade;
        this.obras = obras;
    }

    public Integer getIdIlustrador() {
        return idIlustrador;
    }

    public void setIdIlustrador(Integer idIlustrador) {
        this.idIlustrador = idIlustrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Hqs> getObras() {
        return obras;
    }

    public void setObras(List<Hqs> obras) {
        this.obras = obras;
    }

}
