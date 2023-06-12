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
        JPanel panel = new JPanel();

        JLabel title = new JLabel("Progresso dos Treinos", JLabel.CENTER);
        title.setFont(new Font("Roboto", Font.PLAIN, 24));
        title.setForeground(Color.BLACK);

        panel.setLayout(new BorderLayout());
        panel.add(title, "North");

        populaTabela(this.treino);

        return panel;
    }

    public void populaTabela(Treino treino) {

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("./database/progressos/" + treino.getNome() + "_progresso.csv"));

            while (buffer.ready()) {
                String linha = buffer.readLine();
                String[] dados = linha.split(",");

                //TODO: Monta tabela
                //dados[0] - ID exercicio
                //dados[1] - peso ou tempo
                //dados[2] - data

                //id - peso - data
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
