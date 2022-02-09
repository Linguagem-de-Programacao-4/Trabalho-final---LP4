package Testes;

import Classes.Aluno;
import Classes.Curso_Superior;
import Classes.MinhaExcpetion;
import Classes.Nivel;
import Classes.Nota;

public class Teste_Excecao {

    public static void main(String[] args) throws MinhaExcpetion {
        Nivel ni1 = new Nivel("Graduacao");

        Curso_Superior c1 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", ni1); // Tive que instaciar o curso aqui pelo fato de utilizar da mesma classe Aluno

        Aluno a1 = new Aluno("Adailton", true, "adailton@gmail.com", c1);

        Nota n1 = new Nota(11, 2);
        Nota n2 = new Nota(9.5, 1);
        Nota n3 = new Nota(8.0, 1);
        Nota n4 = new Nota(9.0, 1);
        
        
        System.out.println("======== Teste Exception =======");
        
        a1.registraNota(n1);
        a1.registraNota(n2);
        a1.registraNota(n3);
        a1.registraNota(n4);
     

        
        
        System.out.println("\n-------------Media/Situação---------------\nMedia do " + a1.formaTratamento() + " foi de " + a1.retornaMedia() + " --- Situacao Final: " + a1.verificaSituacao());

        System.out.println("-------------Avaliacoes Realizada-----------");
        System.out.println(a1.formaTratamento()+ " realizou " + a1.qntAvaliacao() + " avaliacoes ");

    }
}
