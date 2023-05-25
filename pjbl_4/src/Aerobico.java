public abstract class Aerobico implements Exercicio{

    protected int duracaoMinutos;
    protected int intensidade;
    protected double pesoUsuario;

    public Aerobico(int duracaoMinutos, int intensidade, double pesoUsuario) {
        this.duracaoMinutos = duracaoMinutos;
        this.intensidade = intensidade;
        this.pesoUsuario = pesoUsuario;
    }

    public abstract double calcularCaloriasGastas();
}
