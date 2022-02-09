package Classes;

import java.util.Comparator;


public class ComparadorNotaCres implements Comparator<Nota>{

    @Override
    public int compare(Nota nota1, Nota nota2) {
      if(nota1.getValor()<(nota2.getValor())){
          return -1;
      } 
          return 1;
        
      
    }
    
}
