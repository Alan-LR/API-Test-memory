package br.memory.Cliente.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.memory.Cliente.entidades.Autor;

public interface AutoresRepositorio extends JpaRepository<Autor, Integer> {

}
