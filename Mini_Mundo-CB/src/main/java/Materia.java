public class Materia {
    private String nome;
    private String disciplina;
    private int cargaHoraria;

    public Materia() {
    }

    public Materia(String nome, String disciplina, int cargaHoraria) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public static void main(String[] args) {
        // Code to test Materia class
    }
}
