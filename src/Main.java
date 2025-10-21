import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JavaScript");
        mentoria.setDescricao("Curso de JavaScript");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

         */
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Dev Java");
        bootcamp.setDescricao("Descricao curso Dev Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.escreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Douglas:" + devDouglas.getConteudosIncricao());
        devDouglas.progredir();
        System.out.println("Conteudos concluidos Douglas:" + devDouglas.getConteudosConcluidos());
        System.out.println("Calcular XP:" + devDouglas.calcularTotal());

        Dev devSve = new Dev();
        devSve.setNome("Svetlana");
        devSve.escreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Svetlana:" +devSve.getConteudosIncricao());
        devSve.progredir();
        devSve.progredir();
        System.out.println("Conteudos concluidos Svetlana:" +devSve.getConteudosConcluidos());
        System.out.println("Calcular XP:" + devSve.calcularTotal());






    }
}
