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

    public void progredirExercicio(String id, Progresso progresso) {
        for (Exercicio exercicio: exercicios) {
            if(exercicio.getId().equals(id) && exercicio.getClass() == Anaerobico.class) {
                ((Anaerobico) exercicio).adicionarProgresso(progresso);
            }
        }
    }

    public String getNome() {
        return nome;
    }
}