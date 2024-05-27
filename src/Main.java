import java.time.LocalDate;

import entities.*;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição curso ");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descrição curso ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+devRodrigo.getNome()+"" + devRodrigo.getConteudoInscrito());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devRodrigo.getNome()+"" + devRodrigo.getConteudoInscrito());
        System.out.println("Conteúdos Concluídos "+devRodrigo.getNome()+"" + devRodrigo.getConteudosConcluidos());
        System.out.println("XP:" + devRodrigo.calcularTotalXP());

        System.out.println("-------");

        Dev devMel = new Dev();
        devMel.setNome("Melissa");
        devMel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos "+devMel.getNome()+"" + devMel.getConteudoInscrito());
        devMel.progredir();
        devMel.progredir();
        devMel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos "+devMel.getNome()+"" + devMel.getConteudoInscrito());
        System.out.println("Conteúdos Concluidos "+devMel.getNome()+"" + devMel.getConteudosConcluidos());
        System.out.println("XP:" + devMel.calcularTotalXP());

    }

}