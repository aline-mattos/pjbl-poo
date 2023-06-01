public class Caminhada extends Aerobico {

    private String tipoCaminhada;

//    Caminhada lenta (2,0 km/h): 2 MET
//    Caminhada moderada (5,0 km/h): 4 MET
//    Caminhada intensa (8,0 km/h): 6 MET
    public Caminhada(int duracaoMinutos, int intensidade, double pesoUsuario) {
        super(duracaoMinutos, intensidade, pesoUsuario);
    }

    @Override
    public float definirMet() {
        float met = 2;

        for(int i = 1; i < intensidade; i++) {
            met = met + 2;
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
        System.out.println("Realizando exercício de caminhada: " + tipoCaminhada);
    }
}
