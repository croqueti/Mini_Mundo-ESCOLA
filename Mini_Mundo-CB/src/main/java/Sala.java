public class Sala {
    private String nome;
    private int quantidade;
    private int numero;

    public Sala() {
    
    }

    public Sala(String nome, int quantidade, int numero) {
        setNome(nome);
        setQuantidade(quantidade);
        setNumero(numero);
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public int getNumero() {
        return this.numero;
    }
    
    public static void main(String[] args) {
        // 
    }
}
