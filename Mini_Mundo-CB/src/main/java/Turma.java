public class Turma {
    private String nome;
    private int quantidadeAlunos;
    private Sala sala;

    public Turma() {
      
    }

    public Turma(String nome, int quantidadeAlunos, Sala sala) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public static void main(String[] args) {
        // Code to test the Turma class
    }
}
