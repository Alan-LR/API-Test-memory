package br.memory.Cliente.repositorios;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.memory.Cliente.entidades.Hqs;

@Repository
public interface HqsRepositorio extends JpaRepository<Hqs, Integer> {

    @Query(nativeQuery = true, value = "select id_hq from hqs_autores where id_autor = :idAutor")
    public List<Object> hqsAutor(String idAutor);

    @Query(nativeQuery = true, value = "select id_hq from hqs_ilustradores where id_ilustrador = :idIlustrador")
    public List<Object> hqsIlustrador(String idIlustrador);

}
