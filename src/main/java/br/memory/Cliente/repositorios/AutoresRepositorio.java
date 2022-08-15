package br.memory.Cliente.repositorios;

import org.hibernate.type.TrueFalseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.memory.Cliente.entidades.Autor;

public interface AutoresRepositorio extends JpaRepository<Autor, Integer> {

    @Query(nativeQuery = true, value = "select * from autores where nome = :nome")
    public Autor buscarNome(String nome);

}
