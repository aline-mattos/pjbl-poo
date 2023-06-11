import javax.swing.*;

public abstract class Pucademia extends JFrame {
  private static final int WIDTH = 1000;
  private static final int HEIGHT = 600;
  private static final JFrame frame = new JFrame("Pucademia");

  public static void abrir(JPanel panel) {
    frame.add(panel);

    frame.setSize(WIDTH, HEIGHT);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void changePanel(JPanel panel) {
    frame.getContentPane().removeAll();
    frame.getContentPane().add(panel);
    frame.revalidate();
    frame.repaint();
  }

  public abstract JPanel mostrar();
}
