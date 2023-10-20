package model;

import javax.swing.JTextField;
import model.CalculoPromedio;

public class EstudianteController {

    private JTextField txtnota1;
    private JTextField txtnota2;
    private JTextField txtnota3;
    private JTextField txtestado;
    private JTextField txtpromedio;

    public EstudianteController(JTextField txtnota1, JTextField txtnota2, JTextField txtnota3, JTextField txtestado, JTextField txtpromedio) {
        this.txtnota1 = txtnota1;
        this.txtnota2 = txtnota2;
        this.txtnota3 = txtnota3;
        this.txtestado = txtestado;
        this.txtpromedio = txtpromedio;
    }

    public CalculoPromedio realizarCalculo = () -> {
        try {
            float nota1 = Float.parseFloat(txtnota1.getText());
            float nota2 = Float.parseFloat(txtnota2.getText());
            float nota3 = Float.parseFloat(txtnota3.getText());

            float promedio = (nota1 * 0.3f) + (nota2 * 0.3f) + (nota3 * 0.4f);

            if (promedio >= 0 && promedio <= 5.0) {
                txtestado.setText((promedio >= 2.96) ? "Aprobado" : "Reprobado");
                txtpromedio.setText(String.valueOf(promedio));
            } else {
                txtestado.setText("Ingresar nota del 0 al 5.0");
                txtpromedio.setText("");
            }
        } catch (NumberFormatException e) {
            txtestado.setText("Ingrese valores válidos");
            txtpromedio.setText("");
        }
    };
}




