package br.memory.Cliente.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Hqs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHQ;
    private String titulo;
    private Double preco;
    private String genero;
    @ManyToMany
    @JoinColumn(name = "idAutor")
    private List<Autor> autor;
    @ManyToMany
    @JoinColumn(name = "idIlustrador")
    private List<Ilustrador> ilustrador;

    public Hqs() {
    }

    public Hqs(Integer idHQ, String titulo, Double preco, String genero, List<Autor> autor,
            List<Ilustrador> ilustrador) {
        this.idHQ = idHQ;
        this.titulo = titulo;
        this.preco = preco;
        this.genero = genero;
        this.autor = autor;
        this.ilustrador = ilustrador;
    }

    public Integer getIdHQ() {
        return idHQ;
    }

    public void setIdHQ(Integer idHQ) {
        this.idHQ = idHQ;
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

    public List<Autor> getAutor() {
        return autor;
    }

    public void setAutor(List<Autor> autor) {
        this.autor = autor;
    }

    public List<Ilustrador> getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(List<Ilustrador> ilustrador) {
        this.ilustrador = ilustrador;
    }

}
