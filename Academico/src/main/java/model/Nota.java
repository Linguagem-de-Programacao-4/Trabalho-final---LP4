package model;

public class Nota {

    private double valor;
    private int peso;

    public Nota(double valor, int peso) {
        this.peso = peso;
        this.valor = valor;

    }

    public Nota(Nota nota) {
        this.valor = nota.valor;
        this.peso = nota.peso;
    }

    public double getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    // Lançando a execção , adicionei o aluno para facilitar qual  nota  não foi registrada em tal aluno.
    public boolean verificaNota() throws MinhaExcpetion {
        return true;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
