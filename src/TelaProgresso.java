import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class TelaProgresso extends Pucademia {
    Treino treino;

    public TelaProgresso(Treino treino) {
        this.treino = treino;
    }

    @Override
    public JPanel mostrar() {
        JPanel panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Progresso do " + treino.getNome(), JLabel.CENTER);
        title.setFont(new Font("Roboto", Font.PLAIN, 24));
        title.setForeground(Color.BLACK);

        panel.add(title, "North");

        populaTabela(this.treino, panel);

        JButton sair = new JButton("Sair");
        sair.addActionListener(e -> changePanel(new TelaTreino(treino).mostrar()));
        panel.add(sair, "South");

        return panel;
    }

    public void populaTabela(Treino treino, JPanel container) {

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("./database/progressos/" + treino.getNome() + "_progresso.csv"));
            JPanel panel = new JPanel();

            String[] header = {"Exercício (id)", "Peso/Tempo", "Data"};

            String[][] dadosTabela = new String[12][3];
            int i = 0;

            while (buffer.ready()) {
                String linha = buffer.readLine();
                String[] dados = linha.split(",");

                if(i < 6) {
                    dadosTabela[i][0] = dados[0];
                    dadosTabela[i][1] = dados[1];
                    dadosTabela[i][2] = dados[2];
                    i++;
                } else {
                    break;
                }
            }
            panel.setLayout(new BorderLayout());
            JTable table = new JTable(dadosTabela, header) {
                @Override
                public Class<?> getColumnClass(int column) {
                    return getValueAt(0, column).getClass();
                }

            };
            panel.add(new JScrollPane(table));
            container.add(panel);
            buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
