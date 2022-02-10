package model;

public class Curso_Superior extends Curso {

    private String ingresso;

    public Curso_Superior(String ingresso, String descricao, String coordenador, Nivel nivel) {
        super(descricao, coordenador, nivel);
        this.ingresso = ingresso;

    }

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    @Override
    public String descricao() {
        return "Curso: " + getDescricao() + "\nCoodernador: " + getCoordenador() + "\nNivel: " + getNivel().getnomeNivel() + "\nForma de Ingresso: " + getIngresso();
    }

    @Override
    public String toString() {
        return "Curso do tipo Superior\n";
    }

}
