package br.memory.Cliente.servicos;

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

}
