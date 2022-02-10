package model;

import java.time.LocalDate;
import java.util.Collections;


public class Aluno extends Usuario implements Interface_Tratamento {

    private String matricula;
    private Nota nota;
    private Curso curso;
    private static int qntAluno = 0;
    private static int num = 0;
    int novoAno;
    static int ano = LocalDate.now().getYear();

    private ListaGenerica<Nota> listaGenericaNota = new ListaGenerica<>();

    public Aluno(String nome, boolean sexo, String email, Curso curso) {

        super(nome, email, sexo);
        novoAno = LocalDate.now().getYear();

        this.curso = curso;

        if (novoAno != ano) {
            num = 1;
            ano = novoAno;
        } else {
            num++;
        }
        this.matricula = "Matricula : " + novoAno + "-" + num;
        qntAluno++;
    }

    // Tratando a exeção ** Só para teste da execção **
    public void registraNota(Nota nota) throws MinhaExcpetion {
        try {
            if (nota.verificaNota()) {
                listaGenericaNota.adiciona(nota);
            }
        } catch (MinhaExcpetion e) {
            System.out.println("Erro adição de nota " + formaTratamento() + "\n" + e);
        }
    }

    public double retornaMedia() {

        double soma = 0;
        double somaPeso = 0;
        double media;

        for (Nota lista : listaGenericaNota.getLista()) {

            soma = soma + lista.getValor() * lista.getPeso();
            somaPeso += lista.getPeso();
        }

        if (!listaGenericaNota.temItens()) {
            media = 0;
            return media;
        } else {

            media = soma / somaPeso;
            return media;
        }

    }

    public int qntAvaliacao() {
        return listaGenericaNota.getLista().size();
    }

    public String verificaSituacao() {
        if (!listaGenericaNota.temItens()) {
            return "Aluno sem avaliacoes.";
        }
        if (this.getCurso() instanceof Curso_Superior){
            if (retornaMedia() >= 7) {
                return "Aluno Aprovado.";
            }
            if (retornaMedia() < 7 && retornaMedia() >= 4) {
                return "Deverá fazer prova substituva.";
            }
            if (retornaMedia()  < 4) {
                return "Aluno Reprovado.";
            }
        }
        else if (this.getCurso() instanceof Curso_tecnico){
            if (retornaMedia() >= 6) {
                return "Aluno Aprovado.";
            }
            if (retornaMedia() < 6 && retornaMedia() >= 4) {
                return "Deverá fazer prova substituva.";
            }
            if (retornaMedia()  < 4) {
                return "Aluno Reprovado.";
            }
        }

        return "Aluno não está matriculado em um curso.";
    }

    public String descricao() {

        {

            return formaTratamento() + "\n" + getMatricula() + "\nE-mail: " + getEmail() + "\n" + "Curso: " + curso.getDescricao();

        }
    }

    public String getMatricula() {
        return matricula;
    }

    public Nota getNota() {
        return new Nota(this.nota);
    }

    public Curso getCurso() {
        return new Curso(this.curso);
    }

    public static int getQntAluno() {
        return qntAluno;
    }

    public static int getNum() {
        return num;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }



    public String retornaCrescente() {
        String list = "Notas " + formaTratamento();

        Collections.sort(this.listaGenericaNota.getLista(), new ComparadorNotaCres());

        for (Nota lista : listaGenericaNota.getLista()) {

            list = list + "\n" + lista.getValor();
        }

        return list + "\nMedia: " + retornaMedia() + "\nSituacao: " + verificaSituacao();
    }

    public String retornaDrescente() {

        String lis = "Notas " + formaTratamento();

        Collections.sort(this.listaGenericaNota.getLista(), new ComparadorNotaCres());
        Collections.reverse(listaGenericaNota.getLista());

        for (Nota lista : listaGenericaNota.getLista()) {

            lis = lis + "\n" + lista.getValor();
        }

        return lis + "\nMedia: " + retornaMedia() + "\nSituacao: " + verificaSituacao();

    }

    @Override
    public String formaTratamento() {
        if (getSexo()) {
            return "Aluno " + getNome();
        } else {
            return "Aluna " + getNome();

        }
    }

    public ListaGenerica<Nota> getListaGenericaNota() {
        return listaGenericaNota;
    }

    
}
