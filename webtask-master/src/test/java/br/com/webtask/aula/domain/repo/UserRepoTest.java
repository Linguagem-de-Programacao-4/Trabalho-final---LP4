/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webtask.aula.domain.repo;

import br.com.webtask.aula.domain.model.UserClient;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
public class UserRepoTest {

    @Autowired
    private UserRepo users;
    UserClient user;

    @BeforeEach
    public void init() {
        System.out.println("------Criando Base -----");
        user = new UserClient(1l, "Adailton", "1112223334", "adailton@gmail.com", "1234", true, null);
        users.save(user);
    }

    @AfterEach
    public void destroy() {
        System.out.println("-------Destruindo Base-------");
        users.deleteAll();

    }

    @Test
    public void testSomeMethod() {

        //cenario
        //execucao
        List<UserClient> listClient = users.findAll();
        
        UserClient test = listClient.get(0);

        //validacao 
       
        Assertions.assertEquals("adailton@gmail.com", test.getEmail());
    }

}
