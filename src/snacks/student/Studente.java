package snacks.student;

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String catNameSurnameAge() {
        if (this.nome != null & this.cognome != null && this.eta > 0) {
            return this.nome + " " + this.cognome + ", " + this.eta + " anni";
        }
        return null;
    }
}
