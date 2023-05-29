public class Remada extends Anaerobico {

    private String maquina;

    public Remada(int repeticao, int tempoDescanso, int serie, float peso, String equipamento) {
        super(repeticao, tempoDescanso, serie, peso, equipamento);
    }


    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina){
        this.maquina = maquina;
    }

    @Override
    public void calcularEvolucao() {
        System.out.println("Calculando evolução para exercício de remada");
    }

    @Override
    public void fazExercicio() {
        System.out.println("Realizando exercício de remada");
    }

}