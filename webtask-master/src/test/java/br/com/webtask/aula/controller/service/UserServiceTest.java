/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webtask.aula.controller.service;

import br.com.webtask.aula.domain.model.UserClient;
import br.com.webtask.aula.domain.repo.UserRepo;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
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
public class UserServiceTest {

    @InjectMocks
    private UserService users;
    @MockBean
    private UserRepo usersRepo;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSomeMethod() throws Exception {

        // cenario
        UserClient user = new UserClient(1l, "Adailton", "2324", "adailton@gmail.com", "44421", true, null);

        // execucao
        users.salvar(user);

        // verificacao
        Assertions.assertTrue(user.isAtivo());

    }

    @Test
    public void testSomeMethod1() {

        // cenario
        UserClient user = new UserClient(1l, "", "2324", "adailton@gmail.com", "44421", true, null);

        try {
            // execucao

            users.salvar(user);

            fail("\n#########\nErro Inesperado\n#########");

        } catch (Exception ex) {
            // verificacao
            Assertions.assertTrue(true);
        }

    }
}
