package Testes;

import Classes.Aluno;

import Classes.Curso_Superior;

import Classes.Nivel;
import Classes.Nota;

public class Teste_Nota {

    public static void main(String[] args) throws Exception {

        Nivel ni1 = new Nivel("Graduacao");

        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", ni1); // Tive que instaciar o curso aqui pelo fato de utilizar da mesma classe Aluno

        Aluno a1 = new Aluno("Adailton", true, "adailton@gmail.com", c1);
        Aluno a2 = new Aluno("Teste", true, "teste@gmail.com", c1);
        Aluno a3 = new Aluno("Maria", false, "maria@gmail.com", c1);
        Aluno a4 = new Aluno("Joao", true, "joao@gmail.com", c1);

        Nota n1 = new Nota(10, 2);
        Nota n2 = new Nota(9.5, 1);
        Nota n3 = new Nota(9.4, 1);
        Nota n4 = new Nota(0, 1);

        a1.registraNota(n1);
        a1.registraNota(n2);
        a1.registraNota(n3);

        
        a2.registraNota(n2);
        a2.registraNota(n3);
        a2.registraNota(n2);

        a3.registraNota(n2);
        a3.registraNota(n4);
        a3.registraNota(n4);

        System.out.println("--------Media/Situacao ---------"); // Coloquei situacao e Avaliacao aqui pois esta diretamente ligado com Notas.

        System.out.println("Media " + a1.formaTratamento() + " foi de " + a1.retornaMedia() + " --- Situacao Final: " + a1.verificaSituacao());
        System.out.println("Media " + a2.formaTratamento() + " foi de " + a2.retornaMedia() + " --- Situacao Final: " + a2.verificaSituacao());
        System.out.println("Media " + a3.formaTratamento() + " foi de " + a3.retornaMedia() + " --- Situacao Final: " + a3.verificaSituacao());
        System.out.println("Media " + a4.formaTratamento() + " foi de " + a4.retornaMedia() + " --- Situacao Final: " + a4.verificaSituacao());

        System.out.println("--------Avaliacoes Realizada----");
        System.out.println(a1.formaTratamento() + " realizou " + a1.qntAvaliacao() + " avaliacoes ");
        System.out.println(a2.formaTratamento() + " realizou " + a2.qntAvaliacao() + " avaliacoes ");
        System.out.println(a3.formaTratamento() + " realizou " + a3.qntAvaliacao() + " avaliacoes ");
        System.out.println(a4.formaTratamento() + " realizou " + a4.qntAvaliacao() + " avaliacoes ");

    }
}
