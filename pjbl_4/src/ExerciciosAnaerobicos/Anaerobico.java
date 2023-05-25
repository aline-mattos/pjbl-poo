package ExerciciosAnaerobicos;

public abstract class Anaerobico /*implements Exercicio*/ {

    private int repeticao;
    private int tempoDescanso;
    private int serie;
    private float peso;
    private String equipamento;

    public Anaerobico(int repeticao, int tempoDescanso, int serie, float peso, String equipamento) {
        this.repeticao = repeticao;
        this.tempoDescanso = tempoDescanso;
        this.serie = serie;
        this.peso = peso;
        this.equipamento = equipamento;
    }

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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
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