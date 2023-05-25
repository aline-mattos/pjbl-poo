package ExerciciosAnaerobicos;

public class Supino extends Anaerobico {

    public Supino(int repeticao, int tempoDescanso, int serie, float peso, String equipamento, String maquina) {
        super(repeticao, tempoDescanso, serie, peso, equipamento);
    }

    @Override
    public void calcularEvolucao() {
        System.out.println("Calculando evolução para exercício de supino");
    }

/*
    @Override
    public void fazExercicio() {
        System.out.println("Realizando exercício de supino");
    }
*/

}