package br.memory.Cliente.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.memory.Cliente.entidades.Autor;
import br.memory.Cliente.entidades.Hqs;
import br.memory.Cliente.entidades.Ilustrador;
import br.memory.Cliente.repositorios.AutoresRepositorio;
import br.memory.Cliente.repositorios.IlustradoresRepositorio;
import br.memory.Cliente.servicos.Servicos;

@RestController
@RequestMapping("/gerenciamento")
public class Controlador {

    @Autowired
    private Servicos servicos;

    @Autowired
    private AutoresRepositorio autoresRepositorio;

    @Autowired
    private IlustradoresRepositorio ilustradoresRepositorio;

    // @Override
    // public void run(String... args) throws Exception {

    // Autor at1 = new Autor(1, "José", 35, null);
    // autoresRepositorio.saveAll(Arrays.asList(at1));

    // Ilustrador il1 = new Ilustrador(1, "João", 28, null);
    // ilustradoresRepositorio.saveAll(Arrays.asList(il1));

    // }

    @PostMapping(value = "/adicionar/autor")
    public ResponseEntity<Autor> inserirAutor(@RequestBody Autor novoAutor) {
        novoAutor = servicos.inserirAutor(novoAutor);
        return ResponseEntity.ok().body(novoAutor);
    }

    @PostMapping(value = "adicionar/ilustrador")
    public ResponseEntity<Ilustrador> inserirIlustrador(@RequestBody Ilustrador novoIlustrador) {
        novoIlustrador = servicos.inserirIlustrador(novoIlustrador);
        return ResponseEntity.ok().body(novoIlustrador);
    }

    @PostMapping(value = "/adicionar/hqs")
    public ResponseEntity<Hqs> inserirHq(@RequestBody Hqs novaHq) {
        novaHq = servicos.inserirHq(novaHq);
        return ResponseEntity.ok().body(novaHq);
    }

}
