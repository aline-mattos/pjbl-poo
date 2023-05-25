package ExerciciosAnaerobicos;

public abstract class Anaerobico /*implements Exercicio*/ {

    private String nome;
    private int repeticao;
    private int tempoDescanso;
    private int serie;
    private double peso;
    private String equipamento;

    public Anaerobico(int repeticao, int tempoDescanso, int serie, double peso, String equipamento) {
        this.repeticao = repeticao;
        this.tempoDescanso = tempoDescanso;
        this.serie = serie;
        this.peso = peso;
        this.equipamento = equipamento;
    }

    public String getNome() { return nome; }

    public void setNome() { this.nome = nome; }

    public int getRepeticao() {
        return repeticao;
    }
    public void setRepeticao(int repeticao) {
        this.repeticao = repeticao;
    }

    public int getTempoDescanso() {
        return tempoDescanso;
    }
    public void setTempoDescanso(int tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public int getSerie() {
        return serie;
    }
    public void setSerie(int serie) {
        this.serie = serie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public abstract void calcularEvolucao();

}