
package Vista;

import com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme;

/**
 *
 * @author Abel
 */
public class comenzar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         FlatGradiantoMidnightBlueIJTheme.setup();
        new Login().setVisible(true);
    }

}
