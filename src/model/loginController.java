
package model;

/**
 *
 * @author abel
 */
import Vista.Administrador;
import Vista.Panel;


import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.Loginmodel;

public class loginController {

    private final JTextField txt_user;
    private final JTextField txt_password;

    public loginController(JTextField txt_user, JTextField txt_password) {
        this.txt_user = txt_user;
        this.txt_password = txt_password;
    }

    public void attemptLogin() {
        /*el metodo trim me sirve para eliminar cualquier espacio en blanco*/
        String username = txt_user.getText().trim();
        String password = txt_password.getText().trim();

        String result = Loginmodel.authenticate(username, password);

        if (result.equals("Rector")) {
               JOptionPane.showMessageDialog(txt_user, "bienvenido rector");
            new Administrador().setVisible(true);
                
        } else if (result.equals("Profesor")) {
                          JOptionPane.showMessageDialog(txt_user, "bienvenido Profesor");

            new Panel().setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, result);
            txt_user.setText("");
            txt_password.setText("");
        }
    }
}
