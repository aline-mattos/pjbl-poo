public class Anaerobico extends Exercicio {
    private int serie;
    private int repeticao;
    private String equipamento;

    public Anaerobico(String id, String nome, int tempoDescanso, Boolean finalizado, int serie, int repeticao,String equipamento) {
      super(id, nome, tempoDescanso, finalizado);
      this.serie = serie;
      this.repeticao = repeticao;
      this.equipamento = equipamento;
    }

    @Override
    public double calcularCaloriasGastas() {
        return (serie * repeticao * 2.3);
    }

    @Override
    public String getNome() {
      return super.getNome() + " (Anaerobico)";
    }

    public int getSerie() {
      return serie;
    }

    public void setSerie(int serie) {
      this.serie = serie;
    }

    public int getRepeticao() {
      return repeticao;
    }

    public void setRepeticao(int repeticao) {
      this.repeticao = repeticao;
    }

    public String getEquipamento() {
      return equipamento;
    }

    public void setEquipamento(String equipamento) {
      this.equipamento = equipamento;
    }

    
}