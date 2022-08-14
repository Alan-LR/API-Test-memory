package br.memory.Cliente.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.memory.Cliente.entidades.Ilustrador;

public interface IlustradoresRepositorio extends JpaRepository<Ilustrador, Integer> {

}
