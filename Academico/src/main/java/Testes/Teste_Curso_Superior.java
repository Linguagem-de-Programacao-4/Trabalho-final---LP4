package Testes;

import Classes.Curso_Superior;

import Classes.Nivel;

public class Teste_Curso_Superior {

    public static void main(String[] args) {
        Nivel n1 = new Nivel("Graduacao");
        Nivel n2 = new Nivel("Mestrado");
        Nivel n3 = new Nivel("Doutorado");

        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", n1);// Embora neste topico eu não use o Curso eu aproveitei a classe aluno se não teria que criar outra sem o Curso
        Curso_Superior c2 = new Curso_Superior("Cota", "Engenharia Mecatronica", "Roberta", n1);
        Curso_Superior c3 = new Curso_Superior("Ampla concorrencia", "Engenharia de software", "Hilton", n2);// Embora neste topico eu não use o Curso eu aproveitei a classe aluno se não teria que criar outra sem o Curso
        Curso_Superior c4 = new Curso_Superior("Cota", "Engenharia dos games", "Paulo", n3);

        
        
        System.out.println("-------------Informacao Curso -------------");
        System.out.println(c1.descricao());
        System.out.println("-------------------------------------------");
        System.out.println(c2.descricao());
        System.out.println("-------------------------------------------");
        System.out.println(c3.descricao());
        System.out.println("-------------------------------------------");
        System.out.println(c4.descricao());

    }

}
