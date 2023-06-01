public class Afundo extends Anaerobico {
    private float pesoAnterior;

    public Afundo(int repeticao, int tempoDescanso, int serie, float peso, String equipamento, float pesoAnterior) {
        super(repeticao, tempoDescanso, serie, peso, equipamento);
        this.pesoAnterior = pesoAnterior;
    }

    @Override
    public void fazExercicio() {
        System.out.println("Realizando exercício de afundo");
    }

    @Override
    public void calcularEvolucao() {
        double diferenca = getPeso() - pesoAnterior;

        if (diferenca > 0) {
            System.out.println("Você evoluiu! Aumentou " + diferenca + "kg no peso utilizado.");
        } else if (diferenca < 0) {
            System.out.println("Cuidado! Você teve uma regressão. Diminuiu " + Math.abs(diferenca) + "kg no peso utilizado.");
        } else {
            System.out.println("Seu peso utilizado se manteve igual.");
        }
    }
}

