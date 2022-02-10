
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Adiciona_Orientador_Aluno {
    private  Map<Aluno, Orientador> adiciona = new HashMap<>();
    
    
    public boolean estaVazia(){
        return adiciona.isEmpty();
    }
    public void distribuiOrientador(Aluno aluno, Orientador orientador){
        this.adiciona.put(aluno, orientador);
    }
    
    public Orientador getOrientador(Aluno aluno){
        return this.adiciona.get(aluno);
    }
    
    public Set<Aluno> getLista(){
        Set<Aluno> lista = this.adiciona.keySet();
        return lista;
    }
    
    public String ConsultaOrientador(Aluno aluno){
        return aluno.formaTratamento() + " tem o " + getOrientador(aluno).formaTratamento() + " como orientador";
    }
    
    
}
