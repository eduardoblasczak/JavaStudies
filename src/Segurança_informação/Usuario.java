package Segurança_informação;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String senha;

    // Construtor vazio necessário para o Gson
    public Usuario() {
    }

    // Getters para acessar os dados na validação
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }
}