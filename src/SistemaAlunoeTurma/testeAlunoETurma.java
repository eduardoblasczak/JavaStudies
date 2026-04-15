package SistemaAlunoeTurma;

public class testeAlunoETurma {
    public static void main(String [] args){
        Aluno a1 = new Aluno("Gustavo Giacoia", 1);
        Aluno a2 = new Aluno("Mateus dos Santos", 2);
        Aluno a3 = new Aluno("Djames Renunza", 3);
        Aluno a4 = new Aluno("André Gritten", 4);
        Aluno a5 = new Aluno("João Carlos Mezari", 5);
        Aluno a6 = new Aluno("Eduardo Blasczak", 6);
        Aluno a7 = new Aluno("Vitor Natal", 7);
        Aluno a8 = new Aluno("Afonso Santos", 8);
        Aluno a9 = new Aluno("Maria Luiza Senff", 9);
        Aluno a10 = new Aluno("Luiza Hauer", 10);

        Turma t1 = new Turma("TURMA C ENG", 3);
        Turma t2 = new Turma("TURMA U ODONTO", 3);

        t1.adicionarAlunos(a1);
        t1.adicionarAlunos(a2);
        t1.adicionarAlunos(a3);
        t1.adicionarAlunos(a4);
        t1.adicionarAlunos(a5);

        t2.adicionarAlunos(a6);
        t2.adicionarAlunos(a7);
        t2.adicionarAlunos(a8);
        t2.adicionarAlunos(a9);
        t2.adicionarAlunos(a10);

        t1.listarAlunos();
        t2.listarAlunos();
    }
}
