package br.memory.Cliente.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Ilustradores")
@Entity
public class Ilustrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idIlustrador;
    private String nome;
    private Integer idade;

    @ManyToMany(mappedBy = "ilustradores")
    private List<Hqs> idHqs;

    public Ilustrador() {
    }

    public Ilustrador(Integer idIlustrador, String nome, Integer idade, List<Hqs> idHqs) {
        this.idIlustrador = idIlustrador;
        this.nome = nome;
        this.idade = idade;
        this.idHqs = idHqs;
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

    public List<Hqs> getIdHqs() {
        return idHqs;
    }

    public void setIdHqs(List<Hqs> idHqs) {
        this.idHqs = idHqs;
    }

}
