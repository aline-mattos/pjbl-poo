import java.util.ArrayList;
import java.util.List;

public class Aerobico extends Exercicio {
    private int intensidade;
    private double pesoUsuario;
    private int duracao;
    private List<Progresso> progressao;

    public Aerobico(String id, String nome, int tempoDescanso, Boolean finalizado, int intensidade, double pesoUsuario, int duracao) {
        super(id, nome, tempoDescanso, finalizado);
        this.intensidade = intensidade;
        this.pesoUsuario = pesoUsuario;
        this.duracao = duracao;
        this.progressao = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return super.getNome() + " (Aeróbico)";
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade() {
        this.intensidade = intensidade;
    }

    public double getPesoUsuario() {
        return pesoUsuario;
    }

    public void setPesoUsuario() {
        this.pesoUsuario = pesoUsuario;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao() {
        this.duracao = duracao;
    }

    public List<Progresso> getProgressao() {
        return progressao;
    }

    @Override
    public void adicionarProgresso(Progresso progresso) {
        progressao.add(progresso);
    }

}