package snacks.registroStudenti;
import snacks.student.Studente;

public class RegistroStudenti {
    private Studente[] registroStudenti;

    public RegistroStudenti() {
        this.registroStudenti = new Studente[0];
    }

    public void getStudents() {
        for (int i = 0; i < registroStudenti.length; i++) {
            System.out.println(registroStudenti[i].catNameSurnameAge());
        }
    }

    public void addStudent(Studente nuovoStudente) {
        Studente[] registroWithNewStudent = new Studente[registroStudenti.length + 1];
        for (int i = 0; i < registroStudenti.length; i++) {
            registroWithNewStudent[i] = registroStudenti[i];
        }
        registroWithNewStudent[registroWithNewStudent.length - 1] = nuovoStudente;
        registroStudenti = registroWithNewStudent;
    }
}
