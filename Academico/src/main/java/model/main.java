package model;

public class main {
    public static void main(String[] args) throws MinhaExcpetion {
        Curso curso = new Curso_Superior ("enem", "adassga", null, null);
        Aluno mateus = new Aluno("aasfas",true,"aaaa",curso);
        System.out.println(mateus.getCurso().getDescricao());
        Nota n1 = new Nota (10, 1);
        mateus.registraNota(n1);
        System.out.println(mateus.getListaGenericaNota().getLista().get(0).getValor());
    }
}
