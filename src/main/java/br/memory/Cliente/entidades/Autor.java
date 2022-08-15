package br.memory.Cliente.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "Autores")
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;
    private String nome;
    private Integer idade;

    @ManyToMany(mappedBy = "autores")
    private List<Hqs> idHqs;

    public Autor() {
    }

    public Autor(Integer idAutor, String nome, Integer idade, List<Hqs> idHqs) {
        this.idAutor = idAutor;
        this.nome = nome;
        this.idade = idade;
        this.idHqs = idHqs;
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

}
