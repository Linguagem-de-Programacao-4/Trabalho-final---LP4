package Testes;

import Classes.Aluno;

import Classes.Curso_Superior;
import Classes.Curso_tecnico;
import Classes.ListaGenerica;

import Classes.Modalidade;
import Classes.Nivel;

import Classes.Orientador;

public class Teste_Lista_Generica {

    public static void main(String[] args) {

        ListaGenerica<Aluno> listaAluno = new ListaGenerica<>();
        ListaGenerica<Orientador> listaOrientador = new ListaGenerica<>();

        Nivel n1 = new Nivel("Medio");
        Nivel n2 = new Nivel("Graduacao");

        Modalidade m1 = new Modalidade("Integrado");
        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", n2);// Embora neste topico eu não use o Curso eu aproveitei a classe aluno se não teria que criar outra sem o Curso
        Curso_tecnico c2 = new Curso_tecnico("Informaica", "Roberto", m1, n1);

        Aluno a1 = new Aluno("Adailton", true, "adailton@gmqail.com", c1);
        Aluno a2 = new Aluno("Junior", true, "junior@gmail.com", c2);
        Aluno a3 = new Aluno("Maria", false, "maria@gmail.com", c1);

        Orientador p1 = new Orientador("Hilton", true, "hiltonjunior@gmail.com");
        Orientador p2 = new Orientador("Marcia", false, "Marcia@gmail.com");

        listaAluno.adiciona(a1);
        listaAluno.adiciona(a2);
        listaAluno.adiciona(a3);
        
        
        System.out.println("-------Lista de Alunos-------------");

        for (Aluno lista : listaAluno.getLista()) {
            System.out.println(lista.formaTratamento());
        }
        System.out.println("\n------Remorção de Aluno-----------");
        
        if (listaAluno.Remove(a2)) {
            System.out.println(a2.formaTratamento() + " foi removido  da lista de alunos");
        } else {
            System.out.println(a2.formaTratamento() + " Não consta na lista");
        }

        listaOrientador.adiciona(p1);
        listaOrientador.adiciona(p2);

        System.out.println("\n-------Lista de Alunos Atualizada -------");

        for (Aluno lista : listaAluno.getLista()) {
            System.out.println(lista.formaTratamento());
        }

        System.out.println("\n-------Lista de Orientadores-------");

        for (Orientador lista : listaOrientador.getLista()) {
            System.out.println(lista.formaTratamento());
        }

    }

}
