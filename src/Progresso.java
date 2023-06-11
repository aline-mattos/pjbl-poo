import java.util.Date;

public class Progresso {
    private double peso;
    private int tempo;
    private Date data;

    public Progresso(double peso, Date data) {
        this.peso = peso;
        this.data = data;
    }

    public Progresso(int tempo, Date data) {
        this.tempo = tempo;
        this.data = data;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}