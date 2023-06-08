import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;


public class Formulario extends JPanel implements ActionListener {

  private JLabel label;
  private JTextField textField;
  private JComboBox<String> mainComboBox;
  private JComboBox<String> subComboBox;
  private HashMap<String, String[]> subItems = new HashMap<>();

  public Formulario(JFrame frame) {
    this.setLayout(new GridLayout(4, 2));

    JLabel labelTipoExercicio = new JLabel("Escolha o tipo de exercicio", SwingConstants.CENTER);

    String[] items = { "", "Aerobico", "Anaerobico"};
    mainComboBox = new JComboBox<>( items );
    mainComboBox.addActionListener( this );

    mainComboBox.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);
    this.add(labelTipoExercicio);
    this.add( mainComboBox );

    subComboBox = new JComboBox<>();

    JLabel labelExercicio = new JLabel("Escolha o exercicio", SwingConstants.CENTER);
    this.add(labelExercicio);
    this.add( subComboBox );

    String[] subItems1 = { "", "Red", "Blue", "Green" };
    subItems.put(items[1], subItems1);

    String[] subItems2 = { "", "Circle", "Square", "Triangle" };
    subItems.put(items[2], subItems2);

    label = new JLabel("", SwingConstants.CENTER);
    textField = new JTextField(10);
    textField.setEnabled(false);
    this.add(label);
    this.add(textField);

    JButton button = new JButton("Adicionar exercicio");
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        ChangePanel.changePanel(frame, new ListaExercicio(frame));
        
      }
    });

    this.add(button);

  }
  
  public void actionPerformed(ActionEvent e) {
    String item = (String) mainComboBox.getSelectedItem();
    System.out.println(item);
    Object o = subItems.get(item);
    
    if (item.equals("Aerobico"))
      label.setText("Peso (kg)");
    else if (item.equals("Anaerobico"))
      label.setText("Tempo (min)");

    if (o == null) {
      subComboBox.setModel(new DefaultComboBoxModel());
      textField.setEnabled(false);
      label.setText("");
    } else {
      textField.setEnabled(true);
      subComboBox.setModel(new DefaultComboBoxModel((String[]) o));
    }
  }
  
}
