package ExerciciosAnaerobicos;

public class RoscaDireta extends Anaerobico {


    public RoscaDireta(int repeticao, int tempoDescanso, int serie, float peso, String equipamento) {
        super(repeticao, tempoDescanso, serie, peso, equipamento);
    }

    @Override
    public void calcularEvolucao() {
        //calcula a evolução de peso
        System.out.println("Calculando evolução para exercício de agachamento");
    }


/*    @override
    public void fazExercicio() {
        System.out.println("Realizando exercício de rosca direta");
    }*/
}