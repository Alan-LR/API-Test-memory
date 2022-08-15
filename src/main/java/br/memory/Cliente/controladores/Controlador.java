package br.memory.Cliente.controladores;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.memory.Cliente.entidades.Autor;
import br.memory.Cliente.entidades.Hqs;
import br.memory.Cliente.entidades.Ilustrador;
import br.memory.Cliente.servicos.Servicos;

@RestController
@RequestMapping("/gerenciamento")
public class Controlador {

    @Autowired
    private Servicos servicos;

    // Adicionar um autor
    @PostMapping(value = "/adicionar/autor")
    public ResponseEntity<Autor> inserirAutor(@RequestBody Autor novoAutor) {
        novoAutor = servicos.inserirAutor(novoAutor);
        return ResponseEntity.ok().body(novoAutor);
    }

    // Adicionar um ilustrador
    @PostMapping(value = "adicionar/ilustrador")
    public ResponseEntity<Ilustrador> inserirIlustrador(@RequestBody Ilustrador novoIlustrador) {
        novoIlustrador = servicos.inserirIlustrador(novoIlustrador);
        return ResponseEntity.ok().body(novoIlustrador);
    }

    // Adicionar uma HQ
    @PostMapping(value = "/adicionar/hqs")
    public ResponseEntity<Hqs> inserirHq(@RequestBody Hqs novaHq) {
        novaHq = servicos.inserirHq(novaHq);
        return ResponseEntity.ok().body(novaHq);
    }

    // Rota para alterar caracteristicas de um autor (nome/idade)
    @PutMapping(value = "alterar/autor/{idAutor}")
    public ResponseEntity<Autor> alterarAutor(@PathVariable Integer idAutor, @RequestBody Autor autor) {
        autor = servicos.alterarAutor(idAutor, autor);
        return ResponseEntity.ok().body(autor);
    }

    // Rota para alterar caracteristicas de um Ilustrador (nome/idade)
    @PutMapping(value = "alterar/ilustrador/{idIlustrador}")
    public ResponseEntity<Ilustrador> alterarIlustrador(@PathVariable Integer idIlustrador,
            @RequestBody Ilustrador ilustrador) {
        ilustrador = servicos.alterarIlustrador(idIlustrador, ilustrador);
        return ResponseEntity.ok().body(ilustrador);
    }

    // Rota para alterar caracteristicas de uma HQ
    // (titulo/preço/genero/autor/ilustrador)
    @PutMapping(value = "alterar/hq/{idHq}")
    public ResponseEntity<Hqs> alterarHq(@PathVariable Integer idHq, @RequestBody Hqs hq) {
        hq = servicos.alterarHq(idHq, hq);
        return ResponseEntity.ok().body(hq);
    }

    // Rota para buscar todos os autores do banco de dados
    @GetMapping(value = "buscar/autores")
    public ResponseEntity<List<Autor>> buscarTodosAutores() {
        List<Autor> autores = servicos.buscarTodosAutores();
        return ResponseEntity.ok().body(autores);
    }

    // Rota para buscar um autor especifico pelo ID
    @GetMapping(value = "buscar/autores/{idAutor}")
    public ResponseEntity<Optional<Autor>> buscarAutor(@PathVariable Integer idAutor) {
        Optional<Autor> autor = servicos.buscarAutor(idAutor);
        return ResponseEntity.ok().body(autor);
    }

    // Rota para buscar todos os ilustradores do banco de dados
    @GetMapping(value = "buscar/ilustradores")
    public ResponseEntity<List<Ilustrador>> buscarTodosIlustradores() {
        List<Ilustrador> ilustradores = servicos.buscarTodosIlustradores();
        return ResponseEntity.ok().body(ilustradores);
    }

    // Rota para buscar um ilustrador especifico pelo ID
    @GetMapping(value = "buscar/ilustradores/{idIlustrador}")
    public ResponseEntity<Optional<Ilustrador>> buscarIlustrador(@PathVariable Integer idIlustrador) {
        Optional<Ilustrador> ilustrador = servicos.buscarIlustrador(idIlustrador);
        return ResponseEntity.ok().body(ilustrador);
    }

    // Rota para buscar todas as HQS do banco de dados
    @GetMapping(value = "buscar/hqs")
    public ResponseEntity<List<Hqs>> buscarTodasHqs() {
        List<Hqs> hqs = servicos.buscarTodasHqs();
        return ResponseEntity.ok().body(hqs);
    }

    // Rota para buscar uma HQ especifica pelo ID
    @GetMapping(value = "buscar/hqs/{idHq}")
    public ResponseEntity<Optional<Hqs>> buscarHq(@PathVariable Integer idHq) {
        Optional<Hqs> hq = servicos.buscarHq(idHq);
        return ResponseEntity.ok().body(hq);
    }

    // Rota para deletar Autor
    @DeleteMapping(value = "deletar/autor/{idAutor}")
    public ResponseEntity<Void> deletarAutor(@PathVariable Integer idAutor) {
        servicos.deletarAutor(idAutor);
        return ResponseEntity.noContent().build();
    }

    // Rota para deletar Ilustrador
    @DeleteMapping(value = "deletar/ilustrador/{idIlustrador}")
    public ResponseEntity<Void> deletarIlustrador(@PathVariable Integer idIlustrador) {
        servicos.deletarIlustrador(idIlustrador);
        return ResponseEntity.noContent().build();
    }

    // Rota para deletar HQs
    @DeleteMapping(value = "deletar/hq/{idHq}")
    public ResponseEntity<Void> deletarHq(@PathVariable Integer idHq) {
        servicos.deletarHq(idHq);
        return ResponseEntity.noContent().build();
    }

}
