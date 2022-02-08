/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.webtask.aula.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

/**
 *
 * @author adail
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class FunctionalScreenTest {

    @LocalServerPort
    private int porta;

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void deveCadastrarUmaTarefa() throws InterruptedException {
        driver.get("http://localhost:" + porta + "/login");
        driver.manage().window().setSize(new Dimension(1352, 616));
        logar();
        driver.findElement(By.cssSelector(".nav-item:nth-child(4) span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("cpNome")).sendKeys("Tarefa do video 1");
        Thread.sleep(3000);
        driver.findElement(By.id("cpData")).sendKeys("01012022");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".nav-item:nth-child(5) span")).click();
        Thread.sleep(3000);
        Assertions.assertEquals("Tarefa do video 1", driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(1)")).getText());
    }

    @Test
    public void fecharTarefaAtrasoEStatus() throws InterruptedException {
        driver.get("http://localhost:" + porta + "/login");
        driver.manage().window().setSize(new Dimension(1352, 616));
        logar();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".nav-item:nth-child(5) span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("tr:nth-child(7) > td:nth-child(5) > .btn-primary")).click();
        Thread.sleep(3000);
        Assertions.assertEquals("concluída com atraso", driver.findElement(By.cssSelector("tr:nth-child(7) > td:nth-child(4) span")).getText());
        Thread.sleep(2000);
    }

    @Test
    public void deveSairDoSistema() throws InterruptedException {
        driver.get("http://localhost:" + porta + "/login");
        logar();
        driver.findElement(By.cssSelector(".nav-item:nth-child(6) span")).click();
        Thread.sleep(3000);
        Assertions.assertEquals("http://localhost:"+porta+"/login?logout", driver.getCurrentUrl());

    }

    @Test
    public void deveFecharUmaTask() throws InterruptedException {
        driver.get("http://localhost:" + porta + "/login");
        logar();
        driver.findElement(By.cssSelector(".nav-item:nth-child(5) span")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(5) > .btn-primary")).click();
        Thread.sleep(3000);
        Assertions.assertEquals("concluída no prazo", driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(4) span")).getText());
        Thread.sleep(2000);
    }

    @Test
    public void naoDeveLogar() throws InterruptedException {

        driver.get("http://localhost:" + porta + "/login");
        driver.manage().window().setSize(new Dimension(1352, 616));
        driver.findElement(By.id("username")).sendKeys("adailton");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.cssSelector(".login100-form-btn")).click();
        Thread.sleep(3000);
        Assertions.assertEquals("http://localhost:"+porta+"/login-error", driver.getCurrentUrl());

    }

    public void logar() throws InterruptedException {

        driver.findElement(By.id("username")).sendKeys("123");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("123");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".login100-form-btn")).click();
        Thread.sleep(2000);
    }
}
