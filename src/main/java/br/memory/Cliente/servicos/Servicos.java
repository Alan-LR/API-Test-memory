package br.memory.Cliente.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.memory.Cliente.entidades.Autor;
import br.memory.Cliente.entidades.Hqs;
import br.memory.Cliente.entidades.Ilustrador;
import br.memory.Cliente.repositorios.AutoresRepositorio;
import br.memory.Cliente.repositorios.HqsRepositorio;
import br.memory.Cliente.repositorios.IlustradoresRepositorio;

@Service
public class Servicos {

    @Autowired
    private HqsRepositorio hqsRepositorio;

    @Autowired
    private AutoresRepositorio autorRepositorio;

    @Autowired
    private IlustradoresRepositorio ilustradorRepositorio;

    public Autor inserirAutor(Autor novoAutor) {
        return autorRepositorio.save(novoAutor);
    }

    public Hqs inserirHq(Hqs novaHq) {
        return hqsRepositorio.save(novaHq);
    }

    public Ilustrador inserirIlustrador(Ilustrador novoIlustrador) {
        return ilustradorRepositorio.save(novoIlustrador);
    }

    public Autor alterarAutor(Integer idAutor, Autor autor) {
        Autor objeto = autorRepositorio.getReferenceById(idAutor);
        alterarandoAutor(objeto, autor);
        return autorRepositorio.save(objeto);
    }

    private void alterarandoAutor(Autor objeto, Autor autor) {
        objeto.setNome(autor.getNome());
        objeto.setIdade(autor.getIdade());
    }

    public Ilustrador alterarIlustrador(Integer idIlustrador, Ilustrador ilustrador) {
        Ilustrador objeto = ilustradorRepositorio.getReferenceById(idIlustrador);
        alterarandoIlustrador(objeto, ilustrador);
        return ilustradorRepositorio.save(objeto);
    }

    private void alterarandoIlustrador(Ilustrador objeto, Ilustrador ilustrador) {
        objeto.setNome(ilustrador.getNome());
        objeto.setIdade(ilustrador.getIdade());
    }

    public Hqs alterarHq(Integer idHq, Hqs hq) {
        Hqs objeto = hqsRepositorio.getReferenceById(idHq);
        alterandoHq(objeto, hq);
        return hqsRepositorio.save(objeto);
    }

    private void alterandoHq(Hqs objeto, Hqs hq) {
        objeto.setTitulo(hq.getTitulo());
        objeto.setPreco(hq.getPreco());
        objeto.setGenero(hq.getGenero());
        objeto.setAutores(hq.getAutores());
        objeto.setIlustradores(hq.getIlustradores());
    }

    public List<Autor> buscarTodosAutores() {
        return autorRepositorio.findAll();
    }

    public Optional<Autor> buscarAutor(Integer idAutor) {
        Optional<Autor> autor = autorRepositorio.findById(idAutor);
        return autor;
    }

    public List<Ilustrador> buscarTodosIlustradores() {
        return ilustradorRepositorio.findAll();
    }

    public Optional<Ilustrador> buscarIlustrador(Integer idIlustrador) {
        Optional<Ilustrador> ilustrador = ilustradorRepositorio.findById(idIlustrador);
        return ilustrador;
    }

    public List<Hqs> buscarTodasHqs() {
        return hqsRepositorio.findAll();
    }

    public Optional<Hqs> buscarHq(Integer idHq) {
        Optional<Hqs> hq = hqsRepositorio.findById(idHq);
        return hq;
    }

    public void deletarAutor(Integer idAutor) {
        autorRepositorio.deleteById(idAutor);
    }

    public void deletarIlustrador(Integer idIlustrador) {
        ilustradorRepositorio.deleteById(idIlustrador);
    }

    public void deletarHq(Integer idHq) {
        hqsRepositorio.deleteById(idHq);
    }

}
