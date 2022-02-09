package Classes;

public class Orientador extends Usuario implements Interface_Tratamento{

    public Orientador(String nome, boolean sexo, String email) {
        super(nome, email, sexo);


    }

    public String descrição() {

        return formaTratamento() + "\nE-mail: " + getEmail();

    }

    @Override
    public String formaTratamento() {
                if (getSexo()) {
        return "Professor " + getNome();
        } else {
           return "Professora " + getNome();

        }
    }
    

}
