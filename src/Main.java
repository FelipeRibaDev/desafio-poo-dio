import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso para desenvolvedor Java Júnior - FelipeRibaDev");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Curso para desenvolvedor JavaScript - FelipeRibaDev");
        curso2.setCargaHoraria(80);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria para desenvolvedor Java Júnior - FelipeRibaDev");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootCampJava = new Bootcamp();
        bootCampJava.setNome("Bootcamp JAVA 2023");
        bootCampJava.setDescricao("Bootcamp para formação de desenvolvedor JAVA");
        bootCampJava.getConteudos().add(curso1);
        bootCampJava.getConteudos().add(curso2);
        bootCampJava.getConteudos().add(mentoria1);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe Riba");
        devFelipe.inscreverBootcamp(bootCampJava);
        System.out.println("Conteúdos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("XP ---- " + devFelipe.calcularTotalXp());
        System.out.println("-");
        devFelipe.progredir();
        System.out.println("Conteúdos Concluídos Felipe: " + devFelipe.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Felipe: " + devFelipe.getConteudosInscritos());
        System.out.println("XP ---- " + devFelipe.calcularTotalXp());

        System.out.println("------------------");

        Dev devBenicio = new Dev();
        devBenicio.setNome("Benicio Riba");
        devBenicio.inscreverBootcamp(bootCampJava);
        System.out.println("Conteúdos Inscritos Benício: " + devBenicio.getConteudosInscritos());
        System.out.println("XP ---- " + devBenicio.calcularTotalXp());
        System.out.println("-");
        devBenicio.progredir();
        devBenicio.progredir();
        devBenicio.progredir();
        System.out.println("Conteúdos Inscritos Benício: " + devBenicio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Benício: " + devBenicio.getConteudosConcluidos());
        System.out.println("XP ---- " + devBenicio.calcularTotalXp());



    }
}