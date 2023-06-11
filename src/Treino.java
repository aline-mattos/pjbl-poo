import java.util.ArrayList;
import java.util.List;

public class Treino {
  private String nome;
  private double pesoUsuario;
  private List<Exercicio> exercicios;

  public Treino(String nome, double pesoUsuario) {
    this.nome = nome;
    this.pesoUsuario = pesoUsuario;
    this.exercicios = new ArrayList<>();
  }

  public List<Exercicio> getExercicios() {
    return exercicios;
  }

  public void addExercicio(Anaerobico exercicio) {
    exercicios.add(exercicio);
  }
  
  public void addExercicio(Aerobico exercicio) {
    exercicio.setPesoUsuario(pesoUsuario);
    exercicios.add(exercicio);
  }

  public void progredirExercicio(String id, Progresso progresso) {
    for (Exercicio exercicio: exercicios) {
      if(exercicio.getId().equals(id) && exercicio.getClass() == Anaerobico.class) {
        ((Anaerobico) exercicio).adicionarProgresso(progresso);
      } else if (exercicio.getId().equals(id) && exercicio.getClass() == Aerobico.class) {
        ((Aerobico) exercicio).adicionarProgresso(progresso);
      } 
    }
  }

  public String getNome() {
    return nome;
  }
}