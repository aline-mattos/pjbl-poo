import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pucademia extends JFrame {
  private static final int WIDTH = 1000;
  private static final int HEIGHT = 600; 

  public Pucademia(String nome) {
    this.setTitle(nome);
    JPanel jp = new JPanel();
    jp.setLayout(new BorderLayout());
    jp.setBackground(Color.RED);
    JButton button = new JButton("Volta pra Lista de Treino");
    button.addActionListener(new MenuAction(this,new ListaExercicio(this)));
    button.setBorderPainted(false);
    jp.add(button);
    
    
    // JPanel formulario = new Formulario(this);
    JPanel listaExercicio = new ListaExercicio(this);
    

    this.add(listaExercicio);
    this.setSize(WIDTH, HEIGHT);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  private class MenuAction implements ActionListener {
    private JPanel panel;
    private JFrame frame;

    private MenuAction(JFrame frame, JPanel pnl) {
      this.panel = pnl;
      this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      ChangePanel.changePanel(frame, panel);
    }

  }


}
