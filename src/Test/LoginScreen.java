package Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Uma classe para simular a conexao com banco de dados e validacao de login
 */
public class LoginScreen {
	
    private Map<String, String> userDatabase;// Simula um banco de dados com (user, password)

    /**
     *  Cria a loginScreen e inicializa o 
     *  insere registros na sua criacao para simular um banco de dados
     */
    public LoginScreen(){
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Tentativa de verificar a atenticidade das credenciais passadas de usuario e senha
     *
     * @param username Nome do usuario que esta tentando fazer o login
     * @param password Senha do usuario que esta tentando fazer o login
     * @return {@code true} se a verificacao for um sucesso, caso contrario {@code false}
     */
    public boolean login(String username, String password) {
        if(userDatabase.containsKey(username)){
            String storedPassword = userDatabase.get(username);
            if(storedPassword.equals(password)){
                return true; // Verificação com sucesso
            }

        }
        return false; // Verificação falhada
    }

    /**
     * Adiciona um novo usuario ao 'banco de dados'
     * Este metodo não é recomendado para o uso em produção
     * Devido a falta de medidas de segurança
     *
     * @param username o username do novo usuario a ser inserido no banco de dados
     * @param password a senha a do novo usuario a ser inserida no  banco de dados
     */
    public void addUser(String username, String password){
        userDatabase.put(username, password);
    }
}
