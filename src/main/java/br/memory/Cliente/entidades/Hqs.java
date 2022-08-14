package br.memory.Cliente.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Table(name = "HQs")
@Entity
public class Hqs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHq;
    private String titulo;
    private Double preco;
    private String genero;

    @ManyToMany
    @JoinTable(name = "hqs_autores", joinColumns = @JoinColumn(name = "idHq"), inverseJoinColumns = @JoinColumn(name = "idAutor"))
    private List<Autor> autores;
    @ManyToMany
    @JoinTable(name = "hqs_ilustradores", joinColumns = @JoinColumn(name = "idHq"), inverseJoinColumns = @JoinColumn(name = "idIlustrador"))
    private List<Ilustrador> ilustradores;

    public Hqs() {
    }

    public Hqs(Integer idHq, String titulo, Double preco, String genero, List<Autor> autores,
            List<Ilustrador> ilustradores) {
        this.idHq = idHq;
        this.titulo = titulo;
        this.preco = preco;
        this.genero = genero;
        this.autores = autores;
        this.ilustradores = ilustradores;
    }

    public Integer getIdHq() {
        return idHq;
    }

    public void setIdHq(Integer idHq) {
        this.idHq = idHq;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Ilustrador> getIlustradores() {
        return ilustradores;
    }

    public void setIlustradores(List<Ilustrador> ilustradores) {
        this.ilustradores = ilustradores;
    }

}
