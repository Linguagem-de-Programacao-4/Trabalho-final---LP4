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
        
        if(this.valor <= 10 && this.valor >= 0){
            return true;
        }else{
            throw new MinhaExcpetion("Nota " + getValor() + " não registrada! O sistema aceita somente notas de 0 a 10!");
        }
       
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}
