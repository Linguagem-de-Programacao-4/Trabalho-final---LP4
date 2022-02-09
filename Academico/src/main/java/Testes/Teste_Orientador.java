

package Testes;

import Classes.Orientador;


public class Teste_Orientador {
    public static void main(String[] args) {
        
        Orientador p1 = new Orientador("Hilton", true, "hiltonjunior@gmail.com");
        Orientador p2 = new Orientador("Marcia", false, "Marcia@gmail.com");
        
        System.out.println(p1.descrição());
        System.out.println(p2.descrição());
        
    }
}
