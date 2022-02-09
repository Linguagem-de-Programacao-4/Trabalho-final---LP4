
package Testes;

import Classes.Curso_Superior;
import Classes.Curso_tecnico;
import Classes.Modalidade;
import Classes.Nivel;
import Classes.IdentificadorCurso;





public class Teste_Indentificador_de_Curso {
    public static void main(String[] args) {
        
        Modalidade m1 = new Modalidade("Integrado");
        Modalidade m2 = new Modalidade("Subsquente");
        Modalidade m3 = new Modalidade("Comitante");

        Nivel n1 = new Nivel("Medio");
        Nivel n2 = new Nivel("Graduacao");
        Nivel n3 = new Nivel("Mestrado");
        Nivel n4 = new Nivel("Doutorado");

        Curso_tecnico c1 = new Curso_tecnico("Informatica", "Emerson", m1, n1);
        Curso_tecnico c2 = new Curso_tecnico("Metalurgia", "Paulo", m3, n1);
        Curso_tecnico c3 = new Curso_tecnico("Edificações", "Roberto", m2, n1);
        Curso_tecnico c4 = new Curso_tecnico("Mecanica", "Patricia", m1, n1);
        Curso_Superior c5 = new Curso_Superior("Ampla concorrencia", "Sistemas de Informação", "Emerson", n2);
        Curso_Superior c6 = new Curso_Superior("Ampla concorrencia", "Engenharia de software", "Hilton", n3);
        Curso_Superior c7 = new Curso_Superior("Cota", "Engenharia dos games", "Paulo", n4);

        System.out.println("---------Tipos de Curso--------");

        System.out.println(IdentificadorCurso.retornaTipo(c1));
        System.out.println("-------------------------------");
        System.out.println(IdentificadorCurso.retornaTipo(c2));
        System.out.println("-------------------------------");
        System.out.println(IdentificadorCurso.retornaTipo(c3));
        System.out.println("-------------------------------");
        System.out.println(IdentificadorCurso.retornaTipo(c4));
        System.out.println("-------------------------------");
        System.out.println(IdentificadorCurso.retornaTipo(c5));
        System.out.println("-------------------------------");
        System.out.println(IdentificadorCurso.retornaTipo(c6));
        System.out.println("-------------------------------");
        System.out.println(IdentificadorCurso.retornaTipo(c7));

    }
   
   
   
}
