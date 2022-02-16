package tests;

import static org.junit.jupiter.api.Assertions.*;

import model.*;
import static org.easymock.EasyMock.*;
import org.junit.jupiter.api.Test;

class AlunoTest {

    @Test
    void deveRetornarAlunoSemCurso () {
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",null);
        assertTrue(aluno.verificaSituacao().equals("O aluno não está matriculado em nenhum curso"));
    }

    @Test
    void deveReprovarAlunoPorFrequencia () {
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", null);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(74.99);
        assertTrue(aluno.verificaSituacao().equals("Aluno reprovado por frequência"));
    }

    @Test
    void deveRetornarAlunoSemAvaliacoes () {
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", null);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        assertTrue(aluno.verificaSituacao().equals("Aluno sem avaliações cadastradas"));
    }

    @Test
    void deveRetornarMediaErradaAcima () {
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", null);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (10.01, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("[Erro] A média final deve está entre 0 e 10!"));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveRetornarMediaErradaAbaixo () {
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", null);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (-0.01, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("[Erro] A média final deve está entre 0 e 10!"));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveAprovarAlunoCursoSuperior () {
        Nivel nivel = new Nivel ("Superior");
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", nivel);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (7, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("Aluno Aprovado!"));

        } catch (MinhaExcpetion e){
            fail();
        }

    }

    @Test
    void deveDarSubstitutivaAlunoCursoSuperior () {
        Nivel nivel = new Nivel ("Superior");
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", nivel);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (4, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("Deverá fazer prova substituva."));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveReprovarAlunoCursoSuperior () {
        Nivel nivel = new Nivel ("Superior");
        Curso curso = new Curso_Superior("ENEM","BSI","Luis", nivel);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (3.99, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("Aluno reprovado por média final"));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveAprovarAlunoCursoTecnico () {
        Nivel nivel = new Nivel ("Medio");
        Curso curso = new Curso_tecnico("Enfermagem",null,null,nivel);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (7, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("Aluno Aprovado!"));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveDarSubstitutivaAlunoCursoTecnico () {
        Nivel nivel = new Nivel ("Medio");
        Curso curso = new Curso_tecnico("Enfermagem",null,null,nivel);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (4, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("Deverá fazer prova substituva."));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveReprovarAlunoCursoTecnico() {
        Nivel nivel = new Nivel ("Medio");
        Curso curso = new Curso_tecnico("Enfermagem",null,null,nivel);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com",curso);
        aluno.setFrequencia(75);
        Nota nota = new Nota (3.99, 1);
        try {
            aluno.registraNota(nota);
            assertTrue(aluno.verificaSituacao().equals("Aluno reprovado por média final"));

        } catch (MinhaExcpetion e){
            fail();
        }
    }

    @Test
    void deveRetornarDescricaoCursoDoAluno() {
        Curso_Superior curso = createMock(Curso_Superior.class);
        expect(curso.getDescricao()).andReturn("BSI");
        replay(curso);
        Aluno aluno = new Aluno("Luis", true, "luis@gmail.com", curso);

        assertEquals("BSI", aluno.getCurso().getDescricao());
    }

}