import javax.swing.*;
import java.awt.*;
import java.util.List;


public class ListaTreino extends Pucademia {
  private double pesoUsuario;
  private Boolean jaCarregaTreino = Boolean.FALSE;

  public ListaTreino() {
  }

  public ListaTreino(Boolean jaCarregaTreino, double pesoUsuario) {
    this.jaCarregaTreino = jaCarregaTreino;
    this.pesoUsuario = pesoUsuario;
  }

  @Override
  public JPanel mostrar() {
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    JLabel title = new JLabel("Lista de Treino", JLabel.CENTER);
    title.setFont(new Font("Roboto", Font.PLAIN, 24));
    title.setForeground(Color.BLACK);

    if(Boolean.TRUE.equals(jaCarregaTreino)) 
      carregaTreinos(panel);

    JButton carregaTreino = new JButton("Carregar treinos");
    carregaTreino.addActionListener(e -> {
      getPesoUsuario();
      carregaTreinos(panel);
    });

    panel.add(title, "North");
    panel.add(carregaTreino, "South");

    return panel;
  }
  
  private void carregaTreinos(JPanel panel) {
    if (pesoUsuario > 0) {
      List<Treino> treinos = Treino.carregaTreinos("./database/treinos", pesoUsuario);

      JPanel listaTreinos = new JPanel(new GridLayout(2, 3));
      for (Treino treino : treinos) {
        JButton button = new JButton(treino.getNome());
        button.addActionListener(ev -> changePanel(new TelaTreino(treino).mostrar()));
        listaTreinos.add(button);
      }
      panel.add(listaTreinos);
      panel.revalidate();
      panel.repaint();
    }
  }
  
  private void getPesoUsuario() {
    String peso = JOptionPane.showInputDialog("Informe o seu peso (kg)");

    try {
      if (peso != null && peso.length() >= 0) {
        this.pesoUsuario = Float.parseFloat(peso);
        if (pesoUsuario <= 0)
          throw new Exception();
      }

    } catch (Exception err) {
      JOptionPane.showMessageDialog(null, "O peso precisar ser um número válido\nExemplo: 56.7");
      getPesoUsuario();
    }

  }


}
