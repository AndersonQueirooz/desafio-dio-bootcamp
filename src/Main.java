import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Desenvolvedor", 8);
        Curso curso2 = new Curso("Curso C#", "Desenvolvedor", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Java Developer", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudosInscritos().add(curso1);
        bootcamp.getConteudosInscritos().add(curso2);
        bootcamp.getConteudosInscritos().add(mentoria1);

        Dev devAnderson = new Dev();
        devAnderson.setNome("Anderson Queiroz");
        devAnderson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anderson" + devAnderson.getConteudosInscritos());
        devAnderson.progredir();
        System.out.println("Conteúdos Inscritos Anderson" + devAnderson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devAnderson.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularXp());

        System.out.println("-----------------------------------------------------");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paula" + devPaula.getConteudosInscritos());
        devPaula.progredir();
        System.out.println("Conteúdos Inscritos Paula" + devPaula.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devPaula.getConteudosConcluidos());
        System.out.println("XP: " + devAnderson.calcularXp());


    }
}