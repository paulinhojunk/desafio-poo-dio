import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso Java Orientado a Objetos");
        curso1.setCargaHoraria(5);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Data Base");
        curso2.setDescricao("Curso Oracle DB");
        curso2.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Oracle Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Paulo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("---------------------------------");
        System.out.println("Os conteudos incritos por Paulo: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("---------------------------------");
        System.out.println("Os conteudos inscritos por Paulo: " + dev1.getConteudosInscritos());
        System.out.println("Os conteudos concluidos por Paulo: "+ dev1.getConteudoConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("---------------------------------");
        System.out.println("Os conteudos incritos por Maria: " +dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("---------------------------------");
        System.out.println("Os conteudos inscritos por Maria: " + dev2.getConteudosInscritos());
        System.out.println("Os conteudos concluidos por Maria: "+ dev2.getConteudoConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());



/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

    }
}