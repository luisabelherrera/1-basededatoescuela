package renderizador;

import javax.swing.*;
import org.jfree.chart.ChartPanel;


public class VentanaGrafico extends JFrame {

    public VentanaGrafico(ChartPanel chartPanel) {
        super("Gráfico de Notas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().add(chartPanel);
        setSize(1000, 500);
        setLocationRelativeTo(null);
    }
}
