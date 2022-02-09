package Testes;

import Classes.Aluno;

import Classes.Curso_Superior;
import Classes.Curso_tecnico;
import Classes.Modalidade;
import Classes.Nivel;


public class Teste_Aluno {

    public static void main(String[] args) {

        Nivel n1 = new Nivel("Medio");
        Nivel n2 = new Nivel("Graduacao");

        Modalidade m1 = new Modalidade("Integrado");

        

        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", n2);// Embora neste topico eu não use o Curso eu aproveitei a classe aluno se não teria que criar outra sem o Curso
        Curso_tecnico c2 = new Curso_tecnico("Informaica", "Roberto", m1, n1);

        Aluno a1 = new Aluno("Adailton", true, "adailton@gmqail.com", c1);
        Aluno a2 = new Aluno("Junior", true, "junior@gmail.com", c2);
        Aluno a3 = new Aluno("Maria", false, "maria@gmail.com", c1);

   
        
  

        System.out.println("-------Informação Aluno --------"); //adicionei  novos atributos  referente a Parte 2 na descrição
        System.out.println(a1.descricao());                     // Vou colocar só uma para teste pois ja testei a mesma funcionalidade na parte 1 
        System.out.println("--------------------------------");
        System.out.println(a2.descricao());
        System.out.println("--------------------------------");
        System.out.println(a3.descricao());
        System.out.println("--------Informação Sistema-------");
        System.out.println("O sistema tem: " + Aluno.getQntAluno() + " alunos.");  // Teste Parte 2 topico 6

        System.out.println("-------Lista Matricula ----------"); // Teste Parte 2 topico 7
        System.out.println(a1.getMatricula());
        System.out.println(a2.getMatricula());
        System.out.println(a3.getMatricula());

    }
}
