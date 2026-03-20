import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.security.MessageDigest;

public class autenticação {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gson gson = new Gson();

        int tentativas = 0;
        boolean logado = false;

        try {
            FileReader reader = new FileReader("usuarios.json");
            List<Map<String, String>> usuarios = gson.fromJson(reader, new TypeToken<List<Map<String, String>>>() {
            }.getType());

            while (!logado && tentativas < 5) {
                System.out.println("\nTentativa " + (tentativas + 1) + " de 5");

                System.out.print("E-mail: ");
                String emailInput = leitor.nextLine();

                System.out.print("Senha: ");
                String senhaInput = leitor.nextLine();

                // Transforma a senha digitada em hash para comparar com o JSON
                String senhaHasheada = gerarHash(senhaInput);

                // Verifica na lista de usuários
                for (Map<String, String> user : usuarios) {
                    if (user.get("email").equals(emailInput) && user.get("senha").equals(senhaHasheada)) {
                        logado = true;
                        System.out.println("Acesso permitido! Bem-vindo, " + user.get("nome"));
                        break;
                    }
                }
                if (!logado) {
                    tentativas++;
                    if (tentativas < 5) {
                        System.out.println("\nUsuário ou senha inválidos.");
                    }
                }
            }

            catch (Exception e) {
                System.out.println("Erro no arquivo json");
            }
            sc.close();
        }
        public static String gerarHash(String senha) {
            try {
                // 1. Escolhe o algoritmo (SHA-256)
                MessageDigest digest = MessageDigest.getInstance("SHA-256");

                // 2. Transforma a senha em bytes e gera o hash
                byte[] hashBytes = digest.digest(senha.getBytes("UTF-8"));

                // 3. Converte os bytes para o formato Hexadecimal (o texto do hash)
                StringBuilder hexString = new StringBuilder();
                for (byte b : hashBytes) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) hexString.append('0');
                    hexString.append(hex);
                }
                return hexString.toString();

            } catch (Exception e) {
                return null; // Caso ocorra erro de algoritmo
            }
        }
    }