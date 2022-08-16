package br.memory.Cliente.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.memory.Cliente.entidades.Ilustrador;


@Repository
public interface IlustradoresRepositorio extends JpaRepository<Ilustrador, Integer> {

}
