package ExercicioUniversidade;

public class Disciplina {
    private Aluno aluno;
    private Professor professor;
    private String nome;

    public Disciplina(Aluno aluno, Professor professor, String nome) {
        this.aluno = aluno;
        this.professor = professor;
        this.nome = nome;
    }

    public void juntarinfos(){
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: "+ aluno.getMatricula());
        System.out.println("Professor: "+ professor.getNome());
        System.out.println("Id do professor: "+ professor.getIdentificador());
        System.out.println("Disciplina: "+ nome);

    }
}
