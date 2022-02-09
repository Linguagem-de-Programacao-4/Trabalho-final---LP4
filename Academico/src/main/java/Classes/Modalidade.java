
package Classes;


public class Modalidade {
    private String nome;

    public Modalidade(String modalidade) {
        this.nome = modalidade;
    }

     public String descricaoModalidade(){
     if(null != nome)switch (nome) {
            case "Integrado":
                return nome+ ": nesta modalidade o aluno cursa o ensino médio juntamente com o ensino técnico.";
            case "Subsequente":
                return nome +": o aluno cursa o ensino técnico após a conclusão do ensino médio.";
            case "Comitante":
                return nome + ": o aluno faz o ensino médio e o técnico paralelamente, ou seja, cursa o médio em um período e o técnico em outro. ";
            default:
                break;
        }
    return "erro";
 }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
 
    


 
    
    
}


