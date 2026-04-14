import ExercicioUniversidade.Aluno;
import ExercicioUniversidade.Disciplina;
import ExercicioUniversidade.Professor;

public class ProgramaPrincipalUniversidade {
    static void main(String[] args) {
        Professor p1 = new Professor("Abimael", 67);
        Aluno a1 = new Aluno("Dozan Codes", 68);
        Disciplina d1 = new Disciplina(a1, p1, "POO");
        d1.juntarinfos();
    }
}
