import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

  public void addExercicio(Anaerobico exercicio) throws LimiteExerciciosException {
    if (exercicios.size() == 6)
      throw new LimiteExerciciosException();
    exercicios.add(exercicio);
  }
  
  public void addExercicio(Aerobico exercicio) throws LimiteExerciciosException {
    if (exercicios.size() == 6)
      throw new LimiteExerciciosException();
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

  public double getPesoUsuario() {
    return pesoUsuario;
  }  

  public static List<Treino> carregaTreinos(String caminhoDiretorio, double pesoUsuario) {
    File folder = new File(caminhoDiretorio);
    List<Treino> treinos =  new ArrayList<>();
    for (File file : folder.listFiles()) {
      String nomeTreino = file.getName().split("\\.(?=[^\\.]+$)")[0];
      Treino treino = new Treino(nomeTreino, pesoUsuario);
      try {
        Scanner scanner = new Scanner(new FileInputStream(file), "UTF-8");
        while (scanner.hasNextLine()) {
          String dado = scanner.nextLine();
          Scanner dadoSeparado = new Scanner(dado).useDelimiter(",");
          String id = dadoSeparado.next();
          String nomeExercicio = dadoSeparado.next();
          int tempoDescanso = dadoSeparado.nextInt();
          Boolean finalizado = dadoSeparado.nextBoolean();
          if (id.startsWith("AN")) {
            int serie = dadoSeparado.nextInt();
            int repeticao = dadoSeparado.nextInt();
            String equipamento = dadoSeparado.next();
            treino.addExercicio(
                new Anaerobico(id, nomeExercicio, tempoDescanso, finalizado, serie, repeticao, equipamento));
          } else if (id.startsWith("AE")) {
            int intensidade = dadoSeparado.nextInt();
            int duracao = dadoSeparado.nextInt();
            treino.addExercicio(new Aerobico(id, nomeExercicio, tempoDescanso, finalizado, intensidade, duracao));
          }

          else {
            dadoSeparado.close();
            throw new TipoExercicioInexistente("Tipo de exercicio não existe");
          }
          dadoSeparado.close();
        }
        scanner.close();

      } catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado");
      } catch (LimiteExerciciosException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        e.printStackTrace();
      }
      treinos.add(treino);
    }
    return treinos;
  }
}