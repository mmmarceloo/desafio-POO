import br.com.desafio.dominio.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("curso de js");
        curso2.setCargaHoraria(4);



         Mentoria mentoria = new Mentoria();
         mentoria.setTitulo("mentoria de java");
         mentoria.setDescricao("descricao mentoria de java");
         mentoria.setData(LocalDate.now());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("curso de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);

        Dev devJojo = new Dev();
        devJojo.setNome("Jojo");

        System.out.println("Conteudos Inscritos Marcelo" + devMarcelo.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Jojo" + devJojo.getConteudosInscritos());


        //  System.out.println(bootcamp.getDataFinal());
        //System.out.println(bootcamp);
    }
}
