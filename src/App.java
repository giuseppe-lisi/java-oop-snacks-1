import java.math.BigDecimal;
import java.util.ListIterator;

import snacks.contoBancario.ContoBancario;
import snacks.student.Studente;

public class App {
    public static void main(String[] args) {
        // crea nuova istanza di una classe Studente 
        // e stampa in console i dati concatenati
        Studente newStudent = new Studente("Giuseppe", "Lisi", 24);
        System.out.println(newStudent.catNameSurnameAge());

        ContoBancario newConto = new ContoBancario(123456789, new BigDecimal(100.25));
        System.out.println("Il tuo saldo attuale è: " + newConto.getSaldo() + "€");
        newConto.deposit(new BigDecimal(100));
        System.out.println("Il tuo saldo attuale è: " + newConto.getSaldo() + "€");
    }
}
