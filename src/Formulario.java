import java.awt.*;
import java.util.*;
import javax.swing.*;


public class Formulario extends Pucademia {

  private JLabel label;
  private JTextField textField;
  private JComboBox<String> subComboBox;
  private HashMap<String, String[]> subItems = new HashMap<>();

  @Override
  public JPanel mostrar() {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 2));

    JLabel labelTipoExercicio = new JLabel("Escolha o tipo de exercicio", SwingConstants.CENTER);
    
    String[] items = { "", "Aerobico", "Anaerobico"};
    JComboBox<String> mainComboBox = new JComboBox<>( items );
    mainComboBox.addActionListener(e -> {
      String item = (String) mainComboBox.getSelectedItem();
      
      Object o = subItems.get(item);
      
      if (item.equals("Aerobico"))
        label.setText("Tempo (min)");
      else if (item.equals("Anaerobico"))
        label.setText("Peso (kg)");

      if (o == null) {
        subComboBox.setModel(new DefaultComboBoxModel<>());
        textField.setEnabled(false);
        label.setText("");
      } else {
        textField.setEnabled(true);
        subComboBox.setModel(new DefaultComboBoxModel<>((String[]) o));
      }
    });
    
    mainComboBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
    panel.add(labelTipoExercicio);
    panel.add(mainComboBox);
    
    subComboBox = new JComboBox<>();

    JLabel labelExercicio = new JLabel("Escolha o exercicio", SwingConstants.CENTER);
    panel.add(labelExercicio);
    panel.add(subComboBox);
    
    String[] subItems1 = { "", "Red", "Blue", "Green" };
    subItems.put(items[1], subItems1);

    String[] subItems2 = { "", "Circle", "Square", "Triangle" };
    subItems.put(items[2], subItems2);

    label = new JLabel("", SwingConstants.CENTER);
    textField = new JTextField(10);
    textField.setEnabled(false);
    panel.add(label);
    panel.add(textField);

    JButton button = new JButton("Adicionar exercicio");
    button.addActionListener(e -> changePanel(new ListaExercicio().mostrar()));

    panel.add(button);
    JLabel aa = new JLabel("Exercicio 1", SwingConstants.CENTER);
    panel.add(aa);

    return panel;
  }
}
