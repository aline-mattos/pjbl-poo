public class Progresso {
    private double peso;
    private int tempo;
    private String data;

    public Progresso(double peso, String data) {
        this.peso = peso;
        this.data = data;
    }

    public Progresso(int tempo, String data) {
        this.tempo = tempo;
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}