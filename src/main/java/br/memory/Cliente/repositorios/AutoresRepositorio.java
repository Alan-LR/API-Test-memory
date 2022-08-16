package br.memory.Cliente.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.memory.Cliente.entidades.Autor;

@Repository
public interface AutoresRepositorio extends JpaRepository<Autor, Integer> {

}
