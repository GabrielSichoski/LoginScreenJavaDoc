## Documentação tela de login

# Tarefa
  Criar um cenario de teste documentado utilizando JUnit, seguindo padrão TDD(Test Driven Development) com a geração de um Javadoc.

# Criação da classe
   Seguindo o que foi passado e ao padrão TDD, primeiro foi criado as classes do projeto
   com o intuito de entender os recursos necessários para o funcionamento de acordo com o que foi passado
   e de acordo com que a IDE pedia.
  
             public class LoginScreenTest {
        @Test
        public void testeSucessfulLogin(){
        LoginScreen loginScreen = new LoginScreen();
        Assertions.assertTrue(loginScreen.login("john", "password123"));
        }
    
        @Test
        public void testeFailedLogin(){
         LoginScreen loginScreen = new LoginScreen();
         Assertions.assertFalse(loginScreen.login("john", "wrong"));
        }
    
        @Test
        public void testeAdd(){
            LoginScreen loginScreen = new LoginScreen();
            loginScreen.addUser("testuser", "testpassword");
            Assertions.assertTrue(loginScreen.login("testuser", "testpassword"));
        }
    
    }

# Classe loginScreen
  Observando os erros, foi criado a classe LoginScreen, utilizando os metodos
  da LoginScreenTest e foi testado a classe

        package Test;
      
      import java.util.HashMap;
      import java.util.Map;
      
      
      private Map<String, String> userDatabase;
      
      
      public LoginScreen(){
      userDatabase = new HashMap<>();
      userDatabase.put("john", "password123");
      userDatabase.put("alice", "securepass");
      }
      
      
      public boolean login(String username, String password) {
      if(userDatabase.containsKey(username)){
      String storedPassword = userDatabase.get(username);
      if(storedPassword.equals(password)){
      return true; 
      }
      
      }
      return false; 
      }
      
      
      public void addUser(String username, String password){
      userDatabase.put(username, password);
      }
      }
  # Realização dos testes
![image](https://github.com/GabrielSichoski/LoginScreenJavaDoc/assets/104863390/764c4da1-ee4c-45bc-ae78-dc25292c9048)



  # Documentação para o javadoc

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
      
  # JavaDoc
  JavaDoc gerado apartir do codigo

  ![image](https://github.com/GabrielSichoski/LoginScreenJavaDoc/assets/104863390/02dca0a9-2178-4d89-aad7-a45e29fe8b86)

