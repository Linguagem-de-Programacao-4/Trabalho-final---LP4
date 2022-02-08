/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webtask.aula.controller.service;

import br.com.webtask.aula.domain.model.Task;
import br.com.webtask.aula.domain.repo.TaskRepo;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author adail
 */
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class TaskServiceTest {

    @InjectMocks
    private TaskService tasks;
    @MockBean
    private TaskRepo tasksRepo;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSomeMethod() throws Exception {

        // cenario
        Task t = new Task(1l, "abc", LocalDate.now().minusDays(2), null, null);
        Task t2 = new Task(1l, "abc", LocalDate.now().minusDays(2), LocalDate.now(), null);
        Mockito.when(tasksRepo.save(Mockito.any(Task.class))).thenReturn(t2);
        //execucao 
        Task t1 = tasks.finalizar(t);

        //verificacao
        Assertions.assertTrue(t1.isFinish());
    }

    @Test
    public void testSomeMethod1() {

        // cenario
        Task t = new Task(1l, "", LocalDate.now().minusDays(2), null, null);
        Task t2 = new Task(1l, "", LocalDate.now().minusDays(2), LocalDate.now(), null);
        Mockito.when(tasksRepo.save(Mockito.any(Task.class))).thenReturn(t2);
        //execucao 
        Task t1;
        try {

            t1 = tasks.finalizar(t);
            fail("deveria gerar um erro");
        } catch (Exception ex) {

            //verificacao
            Assertions.assertTrue(true);
        }

    }

}
