public class Main {
    public static void main(String[] args) {

        Aerobico corrida = new Corrida(90,3,80);

        double caloriasCorrida = corrida.calcularCaloriasGastas();
        System.out.println("Gasto calórico: " + caloriasCorrida + " kcal");
    }
}