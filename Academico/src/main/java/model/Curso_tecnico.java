package model;

public class Curso_tecnico extends Curso {

    private Modalidade modalidade;

    public Curso_tecnico(String descricao, String coordenador, Modalidade modalidade, Nivel nivel) {

        super(descricao, coordenador, nivel);
        this.modalidade = modalidade;

    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    @Override
    public String descricao() {
        return "Curso: " + getDescricao() + "\nCoodernador: " + getCoordenador() + "\nNivel: " + getNivel().getnomeNivel() + "\nModalidade: " + getModalidade().getNome();
    }

    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return "Curso do tipo Tecnico\n";
    }

}
