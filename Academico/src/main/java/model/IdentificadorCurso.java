package model;

public abstract class IdentificadorCurso {

    public static String retornaTipo(Curso curso) {

        return curso.toString() + curso.descricao();

    }

}
