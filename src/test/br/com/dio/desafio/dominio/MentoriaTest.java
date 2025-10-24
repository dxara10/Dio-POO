package test.br.com.dio.desafio.dominio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import br.com.dio.desafio.dominio.Mentoria;

public class MentoriaTest {
    @Test
    public void calcularXPTest(){
        Mentoria mentoria = new Mentoria();
        Assertions.assertEquals(30d, mentoria.calcularXP());
    }
}
