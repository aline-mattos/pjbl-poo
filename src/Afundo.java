public class Afundo extends Anaerobico {
    public Afundo(int repeticao, int tempoDescanso, int serie, float peso, String equipamento) {
        super(repeticao, tempoDescanso, serie, peso, equipamento);
    }

    @Override
    public void calcularEvolucao() {
        System.out.println("Calculando evolução para exercício de afundo");
    }

    @Override
    public void fazExercicio() {
        System.out.println("Realizando exercício de afundo");
    }

}
