import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String nome;
    private List<Exercicio> exercicios;

    public Treino(String nome) {
        this.nome = nome;
        this.exercicios = new ArrayList<>();
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public void addExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public String getNome() {
        return nome;
    }
}