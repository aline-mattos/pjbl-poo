import javax.swing.*;
import java.awt.*;
import java.util.List;


public class TelaTreino extends Pucademia {
  private Treino treino; 

  public TelaTreino(Treino treino) {
    this.treino = treino;
  }

  @Override
  public JPanel mostrar() {
    JPanel panel = new JPanel(new BorderLayout());

    JLabel title = new JLabel("Lista de exercício do " + treino.getNome(), JLabel.CENTER);
    title.setFont(new Font("Roboto", Font.PLAIN, 24));
    title.setForeground(Color.BLACK);

    JPanel listaExercicio = new JPanel(new GridLayout(2, 3));
    for (Exercicio exercicio : treino.getExercicios()) {
      JButton button = new JButton(
          "<html><p style='text-align:center;color:white;background-color:#0000007a;'>" + exercicio.getNome() + "<br/>" + "Não finalizado</p></html>");
          button.setBackground(new Color(247, 68, 68));
      button.addActionListener(e -> {
        if (Boolean.TRUE.equals(exercicio.getFinalizado())) {
          button.setText(
              "<html><p style='text-align:center;color:white;background-color:#0000007a;'>" + exercicio.getNome() + "<br/>" + "Não finalizado</p></html>");
          button.setBackground(new Color(247, 68, 68));
        } else {
          button.setText("<html><p style='text-align:center;color:white;background-color:#0000007a;'>" + exercicio.getNome() + "<br/>" + "Finalizado</p></html>");
          button.setBackground(new Color(68, 247, 107));
        }
        exercicio.toggleFinalizado();
      });
      listaExercicio.add(button);
    }

    JPanel footer = new JPanel(new GridLayout(1,3));

    JButton sair = new JButton("Sair");
    sair
      .addActionListener(e -> changePanel(new ListaTreino(Boolean.TRUE, treino.getPesoUsuario()).mostrar()));

    JButton calcularCalorias = new JButton("Calcular calorias");
    calcularCalorias
      .addActionListener(e -> showCaloriasGastas(treino.getExercicios()));
    
    JButton calcularProgresso = new JButton("Calcular progresso");
    calcularProgresso
      .addActionListener(e -> changePanel(new TelaProgresso(treino).mostrar()));

    footer.add(calcularCalorias);
    footer.add(calcularProgresso);
    footer.add(sair);

    panel.add(listaExercicio);
    panel.add(title, "North");
    panel.add(footer, "South");
    
    return panel;
  }

  private void showCaloriasGastas(List<Exercicio> exercicios) {
    double totalCaloriasGastas = 0;
    for (Exercicio e : exercicios) {
      totalCaloriasGastas += e.calcularCaloriasGastas();
    }
    JOptionPane.showMessageDialog(null, "Total de calorias gastas " + totalCaloriasGastas);
  }
}
