package br.memory.Cliente.controladores;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.memory.Cliente.entidades.Autor;
import br.memory.Cliente.repositorios.AutoresRepositorio;
import br.memory.Cliente.servicos.Servicos;

@RestController
@RequestMapping("/gerenciamento")
public class Controlador implements CommandLineRunner {

    @Autowired
    private Servicos servicos;

    @Autowired
    private AutoresRepositorio autoresRepositorio;

    @Override
    public void run(String... args) throws Exception {

        Autor at1 = new Autor(null, "José", 35, null);
        autoresRepositorio.saveAll(Arrays.asList(at1));

    }

}
