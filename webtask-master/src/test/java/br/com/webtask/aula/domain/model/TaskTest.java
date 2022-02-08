/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webtask.aula.domain.model;

import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 *
 * @author adail
 */


public class TaskTest {
    
    public TaskTest() {
    }

    @Test
    public void testSomeMethod() {
        
       //cenario 
       int a = 3;
       int b=  5;
       
       
       //executar
       int c = a+b;
       //verificar
        Assertions.assertEquals(8, c);
    }
    
    
     @Test
     @DisplayName("Verificar se um projeto em atraso possui status atrasado")
    public void testAtrasoTakFuncionando() {
        
       //cenario 
      Task t = new Task(1l, "Task *", LocalDate.now().minusDays(2), null, null);
       
       
       //executar
      EStatus status = t.getStatus();
       
       //verificar
        Assertions.assertEquals(EStatus.ATRASADO, status);
    }
    
         @Test
     @DisplayName("Verificar é possivel fechar uma Task (Data Finalizacao) dentro do prazo")
    public void testStatusTakFuncionando() {
        
       //cenario 
      Task t = new Task(1l, "Task 2", LocalDate.now().plusDays(5), null, null);
       
       
       //executar
       
       t.setFinishedDate(LocalDate.now().plusDays(3));
       EStatus status = t.getStatus();
       
       //verificar
        Assertions.assertEquals(EStatus.CONCLUIDO_PRAZO, status);
        
    }
    
             @Test
     @DisplayName("Verificar é possivel fechar uma Task em atraso")
    public void testFecharTakComAtraso() {
        
       //cenario 
      Task t = new Task(1l, "Task 3", LocalDate.now().minusDays(3), null, null);
       
       
       //executar
       
        t.setFinishedDate(LocalDate.now());
        EStatus status = t.getStatus();
       
       //verificar
         Assertions.assertEquals(EStatus.CONCLUIDO_ATRASADO, status);

        
    }
    
     @Test
     @DisplayName("Verificar se uma tarefa esta no prazo ")
    public void testTakNoPrazo() {
        
       //cenario 
      Task t = new Task(1l, "Task 4", LocalDate.now().plusDays(2), null, null);
       
       
       //executar
       
        EStatus status = t.getStatus();
       
       //verificar
         Assertions.assertEquals(EStatus.NOVO, status);

        
    }
}
