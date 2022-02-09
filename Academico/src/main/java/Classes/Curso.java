package Classes;

public class Curso {

    private String descricao;
    private String coordenador;
    private Nivel nivel;

    public Curso(String descricao, String coordenador, Nivel nivel) {
        this.descricao = descricao;
        this.coordenador = coordenador;
        this.nivel = nivel;

    }

    public Curso(Curso curso) {

        this.coordenador = curso.coordenador;
        this.descricao = curso.descricao;
        this.nivel = curso.nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCoordenador() {
        return coordenador;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String descricao() {
        return "Curso";
    }

    @Override
    public String toString() {
        return "Curso{" + "descricao=" + descricao + ", coordenador=" + coordenador + ", nivel=" + nivel + '}';
    }

}
