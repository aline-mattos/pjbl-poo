import java.util.Date;

public class Main {
  private static Treino treino;

  public static void main(String[] args) {
    treino = Treino.carregaTreino("./database/Treino.csv",60.5);

    for (Exercicio e : treino.getExercicios()) {
      System.out.println(e.getNome());
    }

    treino.progredirExercicio("AN01", new Progresso(15.0, new Date()));

  }
}