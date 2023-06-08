import javax.swing.*;


public interface ChangePanel {
  static void changePanel(JFrame frame, JPanel panel) {
    frame.getContentPane().removeAll();
    frame.getContentPane().add(panel);
    frame.revalidate();
    frame.repaint();
  }
}
