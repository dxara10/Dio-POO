package test.br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Conteudo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import br.com.dio.desafio.dominio.Dev;

import java.util.function.BooleanSupplier;

public class DevTest {
    @Test
    public void escreverBootCampTest() {
        Dev douglas = new Dev();
        douglas.getConteudosIncricao("Java", "Curso descricaoJava");

        Assertions.assertTrue(
                douglas.getConteudosIncritos().stream()
                        .anyMatch(c -> c.getTitulo().equals("Java"))
        );
    }



}
