package br.memory.Cliente.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;
    private String nome;
    private Integer idade;
    @OneToMany(mappedBy = "autor")
    private List<Hqs> obras;

    public Autor() {
    }

    public Autor(Integer idAutor, String nome, Integer idade, List<Hqs> obras) {
        this.idAutor = idAutor;
        this.nome = nome;
        this.idade = idade;
        this.obras = obras;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
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
