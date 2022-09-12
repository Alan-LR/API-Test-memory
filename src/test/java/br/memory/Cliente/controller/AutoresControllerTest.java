package br.memory.Cliente.controller;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.jayway.jsonpath.Option;

import br.memory.Cliente.controladores.Controlador;
import br.memory.Cliente.entidades.Autor;
import br.memory.Cliente.servicos.Servicos;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@WebMvcTest
public class AutoresControllerTest {

    @Autowired
    private Controlador controlador;

    @MockBean
    private Servicos servicos;

    // ocorre antes de cada teste
    @BeforeEach
    public void setup() {
        // StandAloneSetup escolhe o controller ou serviço que vamos utilizar (oq ele
        // vai carregar)
        RestAssuredMockMvc.standaloneSetup(this.controlador);
    }

    @Test
    public void deveRetornarSucesso_QuandoBuscarAutor() {
        // Quando
        Autor testAutor = new Autor(1, "Carlos", 48);
        when(this.servicos.buscarAutor(1)).thenReturn(java.util.Optional.of(testAutor));

        // Given: Quando aconter x coisa, me retorne y resultado
        RestAssuredMockMvc.given()
                .accept(ContentType.JSON).when().get("buscar/autores/{idAutor}", 1).then()
                .statusCode(org.springframework.http.HttpStatus.OK.value());
    }

    @Test
    public void deveRetornarNaoEncontrado_QuandoBuscarAutor() {
        when(this.servicos.buscarAutor(10))
                .thenReturn(null);
        RestAssuredMockMvc.given()
                .accept(ContentType.JSON).when().get("buscar/autores/{idAutor}", 10).then()
                .statusCode(org.springframework.http.HttpStatus.NOT_FOUND.value());
    }

}
