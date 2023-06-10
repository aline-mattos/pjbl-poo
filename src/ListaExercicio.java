import javax.swing.*;
import java.awt.*;


public class ListaExercicio extends Pucademia {

  @Override
  public JPanel mostrar() {
    JPanel panel = new JPanel();
  
    JLabel title = new JLabel("Lista de Treino", JLabel.CENTER);
    title.setFont(new Font("Roboto", Font.PLAIN, 24));
    title.setForeground(Color.BLACK);

    JButton button = new JButton("Criar treino");
    button.addActionListener(e -> changePanel(new Formulario().mostrar()));

    panel.setLayout(new BorderLayout());
    panel.add(title, "North");
    panel.add(button, "South");

    return panel;
  }
}
