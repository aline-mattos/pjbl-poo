import java.util.ArrayList;
import java.util.List;
public class Danca extends Aerobico {

    private String tipoDanca;
    private double valorMet;

    //    Verificar a melhor forma de guardar esses valores em uma lista para o usuário selecionar.

    //    Danca leve: 3 METs
    //    Danca moderada: 5 METs
    //    Danca intensa 7 METs

    //    Dança de salão (leve)
    //    Ballet (moderada)
    //    Dança contemporânea (leve)
    //    Dança de rua (hip hop, breakdance) (moderada)
    //    Dança do ventre (leve)
    //    Dança aeróbica (moderada)
    //    Zumba (moderada)
    //    Jazz (moderada)
    //    Salsa (moderada)
    //    Flamenco (moderada)
    //    Dança de competição (intensa)
    //    Dança de salão (intensa)
    //    Dança de tango (intensa)
    //    Dança de salsa (intensa)
    //    Dança de pole dance (intensa)
    public Danca(int duracaoMinutos, int intensidade, double pesoUsuario, String tipoDanca, double valorMet) {
        super(duracaoMinutos, intensidade, pesoUsuario);
        this.tipoDanca = tipoDanca;
        this.valorMet = valorMet;
    }

    public String getTipoDanca() {
        return tipoDanca;
    }

    @Override
    public float definirMet() {
        float met = 3;

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
        System.out.println("Realizando exercício de dança: " + tipoDanca);
    }
}
