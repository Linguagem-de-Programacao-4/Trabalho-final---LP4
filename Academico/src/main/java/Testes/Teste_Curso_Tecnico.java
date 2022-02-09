package Testes;


import Classes.Curso_tecnico;
import Classes.Modalidade;
import Classes.Nivel;

public class Teste_Curso_Tecnico {

    public static void main(String[] args) {

        Modalidade m1 = new Modalidade("Integrado");
        Modalidade m2 = new Modalidade("Subsquente");
        Modalidade m3 = new Modalidade("Comitante");
 
        Nivel n1 = new Nivel("Medio");
        Curso_tecnico c1 = new Curso_tecnico("Informatica", "Emerson", m1, n1);
        Curso_tecnico c2 = new Curso_tecnico("Metalurgia", "Paulo", m3, n1);
        Curso_tecnico c3 = new Curso_tecnico("Edificações", "Roberto", m2, n1);
        Curso_tecnico c4 = new Curso_tecnico("Mecanica", "Patricia", m1, n1);
        
        

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