package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaGenerica<E> {

    private List<E> lista = new ArrayList<>();

    public void adiciona(E elemento) {
        lista.add(elemento);
    }

    public boolean temItens() {
        return !lista.isEmpty();
    }

    public List<E> getLista() {
        return lista;
    }

    public boolean busca(E elemento) {
        
        if(lista.contains(elemento)){
            return true;
        }
         return false;
    }
    
    public Boolean Remove( E elemento){
        if(lista.contains(elemento)){
           lista.remove(elemento);
           return true;
        }
        return false;
    }
    

    public void adicionaEmGrupo(List<E> elementos) {
        for (E e : elementos) {
            adiciona(e);
        }
    }
}
