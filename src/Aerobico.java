public class Aerobico extends Exercicio {
  private int intensidade;
  private double pesoUsuario;
  private int duracao;
  
  public Aerobico(String id, String nome, int tempoDescanso, Boolean finalizado, int intensidade, int duracao) {
    super(id, nome, tempoDescanso, finalizado);
    this.intensidade = intensidade;
    this.duracao = duracao;
  }

  @Override
  public double calcularCaloriasGastas() {
    if(!super.getFinalizado()) {
      return 0;
    }
    return (intensidade * pesoUsuario / 60) * duracao;
  }

  @Override
  public String getNome() {
    return super.getNome() + " (Aeróbico)";
  }

  public int getIntensidade() {
    return intensidade;
  }

  public void setIntensidade(int intensidade) {
    this.intensidade = intensidade;
  }

  public double getPesoUsuario() {
    return pesoUsuario;
  }

  public void setPesoUsuario(double pesoUsuario) {
    this.pesoUsuario = pesoUsuario;
  }

  public int getDuracao() {
    return duracao;
  }

  public void setDuracao(int duracao) {
    this.duracao = duracao;
  }
}