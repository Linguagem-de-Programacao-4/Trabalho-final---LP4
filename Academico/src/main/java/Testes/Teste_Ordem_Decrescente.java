package Testes;

import Classes.Aluno;
import Classes.Curso_Superior;
import Classes.MinhaExcpetion;
import Classes.Nivel;
import Classes.Nota;

public class Teste_Ordem_Decrescente {

    public static void main(String[] args) throws MinhaExcpetion {
        Nivel ni1 = new Nivel("Graduacao");

        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", ni1); // Tive que instaciar o curso aqui pelo fato de utilizar da mesma classe Aluno

        Aluno a1 = new Aluno("Adailton", true, "adailton@gmail.com", c1);
        Aluno a2 = new Aluno("Teste", true, "teste@gmail.com", c1);
        Aluno a3 = new Aluno("Maria", false, "maria@gmail.com", c1);
        Aluno a4 = new Aluno("Joao",  true, "joao@gmail.com", c1);


        Nota n1 = new Nota(10, 2);
        Nota n2 = new Nota(9.5, 1);
        Nota n3 = new Nota(9.4, 1);
        Nota n4 = new Nota(0, 1);
        Nota n5 = new Nota(8, 1);
        Nota n6 = new Nota(7, 1);
        
        a1.registraNota(n1);
        a1.registraNota(n2);
        a1.registraNota(n3);

        a2.registraNota(n2);
        a2.registraNota(n3);
        a2.registraNota(n2);
        a2.registraNota(n1);
        a2.registraNota(n5);

        a3.registraNota(n6);
        a3.registraNota(n4);
        a3.registraNota(n2);

        System.out.println("-----Lista de notas em ordem decrescente-------");
        System.out.println(a1.retornaDrescente());
        System.out.println("-----------------------------------------------");
        System.out.println(a2.retornaDrescente());
        System.out.println("-----------------------------------------------");
        System.out.println(a3.retornaDrescente());
        System.out.println("-----------------------------------------------");
        System.out.println(a4.retornaDrescente());
    }
}
