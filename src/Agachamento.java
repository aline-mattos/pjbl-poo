public class Agachamento extends Anaerobico {

    public Agachamento(int repeticao, int tempoDescanso, int serie, float peso, String equipamento) {
        super(repeticao, tempoDescanso, serie, peso, equipamento);
    }

    @Override
    public void calcularEvolucao() {
        //calcula a evolução de peso
        System.out.println("Calculando evolução para exercício de agachamento");
    }

    @Override
    public void fazExercicio() {
        System.out.println("Realizando exercício de agachamento");
    }
}
