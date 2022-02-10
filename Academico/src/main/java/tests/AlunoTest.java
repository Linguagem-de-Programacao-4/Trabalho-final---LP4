package tests;

import static org.junit.jupiter.api.Assertions.*;

import model.*;
import org.junit.jupiter.api.Test;

class AlunoTest {

    @Test
    void obterAlunoSemAvaliacao(){

        Aluno aluno;
        aluno = new Aluno("Luis", true, "luis@gmail.com",null);
        assertTrue(aluno.verificaSituacao().equals("Aluno sem avaliacoes."));
    }

    @Test
    void obterAprovacaoCursoSuperior(){

        Aluno aluno;
        Curso curso = new Curso_Superior("sdfa","dsf","fds", null);
        aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        Nota nota = new Nota(10,1);
        try {
            aluno.registraNota(nota);
            System.out.println(aluno.getListaGenericaNota().getLista().get(0).getValor());
            System.out.println(aluno.retornaMedia());
            fail();
        } catch (MinhaExcpetion e){
            assertTrue(aluno.verificaSituacao().equals("Aluno Aprovado."));
        }

    }

}