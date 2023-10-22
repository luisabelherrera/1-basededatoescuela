package renderizador;

import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class AnimacionBorderPanel1 {
    private JPanel panel;
    private Timer borderTimer;
    private Color currentBorderColor;
    private int animationSpeed = 500; // Velocidad más rápida (en milisegundos)
    private Color initialColor = Color.BLACK; // Cambiado a negro
    private Color targetColor = new Color(0, 128, 0); // Cambiado a verde
    private float colorBlend = 0.0f; // Variable para mezclar colores
    private float colorBlendIncrement = 0.03f; // Incremento un poco más grande para una animación más rápida

    public AnimacionBorderPanel1(JPanel panel, JLabel jLabel4) {
        this.panel = panel;

        panel.setBorder(new LineBorder(initialColor, 2)); // Color de borde inicial
        currentBorderColor = initialColor;

        borderTimer = new Timer(animationSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar gradualmente el color del borde
                colorBlend += colorBlendIncrement; // Incremento más grande
                if (colorBlend > 1.0f) {
                    colorBlend = 0.0f; // Reinicia la mezcla cuando llega a 1.0
                }
                int red = (int) (initialColor.getRed() * (1 - colorBlend) + targetColor.getRed() * colorBlend);
                int green = (int) (initialColor.getGreen() * (1 - colorBlend) + targetColor.getGreen() * colorBlend);
                int blue = (int) (initialColor.getBlue() * (1 - colorBlend) + targetColor.getBlue() * colorBlend);
                currentBorderColor = new Color(red, green, blue);

                panel.setBorder(new LineBorder(currentBorderColor, 2));

                // Modificar el JLabel4 durante la animación (ejemplo: cambiar el texto)
            }
        });

        borderTimer.start();
    }
}
