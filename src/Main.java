import br.com.dio.desafio.dominio.*;

import javax.swing.text.html.StyleSheet;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());



        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.insceverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devHeitor.getConteudosInscritos());
        devHeitor.progredir();
        System.out.println("*_______________________*");
        System.out.println("Conteudos Inscritos" + devHeitor.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devHeitor.getConteudosConcluidos());
        System.out.println("XP: " + devHeitor.calcularTotalXp());
        System.out.println("*_______________________*");
        Dev devPenelope = new Dev();
        devPenelope.setNome("Penélope");
        devPenelope.insceverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devPenelope.getConteudosInscritos());
        devPenelope.progredir();
        System.out.println("*_______________________*");
        System.out.println("Conteudos Inscritos" + devPenelope.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devPenelope.getConteudosConcluidos());
        System.out.println("XP: " + devPenelope.calcularTotalXp());



        }
    }
