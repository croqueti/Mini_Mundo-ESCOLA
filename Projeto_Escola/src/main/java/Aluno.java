// Maria Eduarda -- Classe Aluno 01
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Aluno{
      private String nome;
      private int idade;
      private String dataNascimento;

      public Aluno () {
        
      }

      public Aluno (String nome, int idade) {
        setNome(nome);
        setIdade(idade);
      }

      public void setNome(String nome) {
        validarNomeDoAluno(nome);
        this.nome = nome;
      }

      void setIdade(int idade){
           this.idade = idade;
       }

      void registroDataDeNascimentoDoALunos(String dataNascimento){
      this.dataNascimento = dataNascimento;
  }

    public String getNome() {
      return  this.nome;
    }

      public int getIdade(){
          return  this.idade;
      }

      public int getIdadeDoAluno(){
      return  this.idade;
  }
      public String pegarDataDeNascimentoDoAluno(){
      return this.dataNascimento;
  }


    private boolean validarNomeDoAluno(String nome) {

      System.out.println("Nome do aluno: " + nome);
    
      String regex = "/[A-Z][a-z]* [A-Z][a-z]*/";
      Pattern p = Pattern.compile(regex);
      
      System.out.println(p.matcher(nome));

      Matcher m = p.matcher(regex);
      
      if ( m.matches() ) {
        System.out.println("Nome válido");
      } else {
        System.out.println("Nome inválido");
      }
      
      return false;
    }
  
    
}

