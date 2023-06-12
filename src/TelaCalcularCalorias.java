import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TelaCalcularCalorias extends Pucademia {
    private Treino treino;
    private Aerobico aerobico;
    private double pesoUsuarios;
    public TelaCalcularCalorias(Treino treino) {
        this.treino = treino;
    }
    @Override
    public JPanel mostrar() {
        JFrame panel = new JFrame();
        String message = "message";
        String text = JOptionPane.showInputDialog(panel, message);

        return panel;
    }
}
