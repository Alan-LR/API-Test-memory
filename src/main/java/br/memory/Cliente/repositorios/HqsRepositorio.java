package br.memory.Cliente.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.memory.Cliente.entidades.Hqs;

@Repository
public interface HqsRepositorio extends JpaRepository<Hqs, Integer> {

}
