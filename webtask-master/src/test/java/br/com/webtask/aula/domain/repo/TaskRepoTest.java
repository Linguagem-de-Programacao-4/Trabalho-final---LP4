/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webtask.aula.domain.repo;

import br.com.webtask.aula.domain.model.Task;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter .api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author adail
 */
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest

public class TaskRepoTest {
    
    @Autowired
    private TaskRepo tasks;
    
    Task t1, t2;
    
    @BeforeEach
    public void init(){
        System.out.println("------Criando Base -----");
        t1 = new Task(3l, "estudar", LocalDate.now().minusDays(2), null, null);
        t2 = new Task(4l, "dormir", LocalDate.now().plusDays(5), null, null);
        
        tasks.save(t1);
        tasks.save(t2);
    }
    
    @AfterEach
    public void destroy(){
        System.out.println("-------Destruindo Base-------");
        tasks.deleteAll();
        
    }

    @Test
    public void testSomeMethod() {
        //cenário 
        
        //execução 
        
        List<Task> tList = tasks.findByTaskDescription("estudar");
        
        //verificação 
        Assertions.assertEquals(1, tList.size());
    }
        @Test
        
    public void testSomeMethod1() {
        //cenário 
        
        //execução 
        
        List<Task> tList = tasks.findByTaskDescription("dormir");
        Task t = tList.get(0);
        
        //verificação 
        Assertions.assertEquals("dormir", t.getTaskDescription());
    }
    
}
