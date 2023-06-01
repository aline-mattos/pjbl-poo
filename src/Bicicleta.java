public class Bicicleta extends Aerobico {

    private String tipoPasseio;

//    Passeio casual (leve): 4.0 MET
//    Passeio em ritmo constante (moderada): 6.0 MET
//    Pedalada rápida ou em subida (intensa): 8.0 MET
    public Bicicleta(int duracaoMinutos, int intensidade, double pesoUsuario,String tipoPasseio) {
        super(duracaoMinutos, intensidade, pesoUsuario);
        this.tipoPasseio = tipoPasseio;
    }

    public String getTipoPasseio() {
        return tipoPasseio;
    }

    @Override
    public float definirMet() {
        float met = 4;

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
        System.out.println("Passeio de bicicleta iniciado:" + tipoPasseio);
    }
}
