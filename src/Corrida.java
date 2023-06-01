public class Corrida extends Aerobico {

    private String tipoCorrida;

    /*
    Corrida leve (5 km/h): 6 METs
    Corrida moderada (8 km/h): 9 METs
    Corrida rápida (12 km/h): 12 METs
    Corrida intensa (15 km/h): 15 METs
    */

    public Corrida(int duracaoMinutos, int intensidade, double pesoUsuario, String tipoCorrida) {
        super(duracaoMinutos, intensidade, pesoUsuario);
        this.tipoCorrida = tipoCorrida;
    }

    @Override
    public float definirMet() {
        float met = 6;

        for(int i = 1; i < intensidade; i++) {
            met = met + 3;
        }

        return met;
    }
    @Override
    public double calcularCaloriasGastas() {
        float valorMet = definirMet();
        return (valorMet * pesoUsuario / 60) * duracaoMinutos;
    }

    @Override
    public void fazExercicio() {
        System.out.println("Realizando o exercício: " + tipoCorrida);
    }
}