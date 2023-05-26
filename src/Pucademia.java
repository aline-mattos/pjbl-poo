import javax.swing.*;
import java.awt.*;

public class Pucademia extends JPanel {
  private static final int WIDTH = 1000;
  private static final int HEIGHT = 600; 
  private JFrame frame;

  public Pucademia(String nome) {
    frame = new JFrame(nome);

    JLabel title = new JLabel("Lista de Treino", JLabel.CENTER);
    title.setFont(new Font("Roboto", Font.PLAIN, 24));
    title.setForeground(Color.BLACK);

    this.add(title);
    
    frame.add(this);
    frame.setSize(WIDTH, HEIGHT);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
