public abstract class Exercicio {
    private String id;
    private String nome;
    private int tempoDescanso;
    private Boolean finalizado;

    Exercicio(String id, String nome, int tempoDescanso, Boolean finalizado) {
        this.id = id;
        this.nome = nome;
        this.tempoDescanso = tempoDescanso;
        this.finalizado = finalizado;
    }

    public abstract void adicionarProgresso(Progresso progresso);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanso(int tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
}