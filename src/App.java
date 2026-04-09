import java.util.ListIterator;

import snacks.student.Studente;

public class App {
    public static void main(String[] args) {
        Studente newStudent = new Studente("Giuseppe", "Lisi", 24);

        System.out.println(newStudent.catNameSurnameAge());
    }
}
