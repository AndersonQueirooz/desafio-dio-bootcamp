import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Desenvolvedor", 8);
        Curso curso2 = new Curso("Curso C#", "Desenvolvedor", 10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Java Developer", LocalDate.now());

        System.out.println(mentoria1);

    }
}