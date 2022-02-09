package Testes;

import Classes.Aluno;
import Classes.Curso_Superior;
import Classes.Curso_tecnico;
import Classes.Adiciona_Orientador_Aluno;
import Classes.Modalidade;
import Classes.Nivel;
import Classes.Orientador;

import java.util.Set;

public class Teste_Adiciona_Orientador_Aluno {

    public static void main(String[] args) {

        Adiciona_Orientador_Aluno insere = new Adiciona_Orientador_Aluno();

        Nivel n1 = new Nivel("Medio");
        Nivel n2 = new Nivel("Graduacao");

        Modalidade m1 = new Modalidade("Integrado");

        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", n2);// Embora neste topico eu não use o Curso eu aproveitei a classe aluno se não teria que criar outra sem o Curso
        Curso_tecnico c2 = new Curso_tecnico("Informaica", "Roberto", m1, n1);

        Aluno a1 = new Aluno("Adailton", true, "adailton@gmqail.com", c1);
        Aluno a2 = new Aluno("Junior", true, "junior@gmail.com", c2);
        Aluno a3 = new Aluno("Maria", false, "maria@gmail.com", c1);

        Aluno a4 = new Aluno("Teste", true, "teste@gmail.com", c1);
        Aluno a5 = new Aluno("Teste1", true, "tes@gmail.com", c2);
        Aluno a6 = new Aluno("Teste2", true, "teesc@gmail.com", c1);

        Orientador p1 = new Orientador("Hilton", true, "hilton@gmail.com");
        Orientador p2 = new Orientador("Emerson", true, "Emerson@gmail.com");

        insere.distribuiOrientador(a1, p1);
        insere.distribuiOrientador(a2, p1);
        insere.distribuiOrientador(a3, p1);
        insere.distribuiOrientador(a4, p2);
        insere.distribuiOrientador(a5, p2);
        insere.distribuiOrientador(a6, p2);

        Set<Aluno> listaAluno = insere.getLista();

        System.out.println("----------Lista Aluno/ Orientador -----------");

        for (Aluno a : listaAluno) {
            System.out.println(a.formaTratamento() + "\nOrientador:" + insere.getOrientador(a).descrição() + "\n------------------------");

        }

        System.out.println("\n------------Consulta de Orientador-------------");
        System.out.println(insere.ConsultaOrientador(a1));
        System.out.println(insere.ConsultaOrientador(a3));
        System.out.println(insere.ConsultaOrientador(a4));

    }
}
