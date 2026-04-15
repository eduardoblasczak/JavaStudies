package SistemaAlunoeTurma;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private int periodo;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public void listarAlunos(){
        for(int i = 0; i < alunos.size(); i++ ){
            Aluno indice = alunos.get(i);
            System.out.println("Turma: " + nome + " | Período: " + periodo + " | Nome do Aluno: " + indice.getNome() + " | Matrícula do aluno: " + indice.getMatricula());
        }
    }

    public Turma(String nome, int periodo){
        this.nome = nome;
        this.periodo = periodo;
    }
}
