package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Documentobibliotecanodisponible;

/**
 *
 * @author abel
 */
public class RegistroControllerbibliotecanodisponible {

    static ArrayList<Documentobibliotecanodisponible> listaDocumentos;

    public RegistroControllerbibliotecanodisponible() {
        listaDocumentos = new ArrayList<Documentobibliotecanodisponible>();
    }

    public static ArrayList<Documentobibliotecanodisponible> getListaDocumentos() {
        return listaDocumentos;
    }

    public static void setListaDocumentos(ArrayList<Documentobibliotecanodisponible> listaDocumentos) {
        RegistroControllerbibliotecanodisponible.listaDocumentos = listaDocumentos;
    }

    public static void agregarDoc(Documentobibliotecanodisponible doc) {
        boolean repetido = false;
        for (Documentobibliotecanodisponible d : listaDocumentos) {
            if (d.getCodigo() == doc.getCodigo()) {
                repetido = true;
                JOptionPane.showMessageDialog(null, "no se puede agregar puesto que el nro de doc ya existe");
                break;
            }
        }
        if (repetido == false) {
            listaDocumentos.add(doc);
            JOptionPane.showMessageDialog(null, "Documento agregado satisfactoriamente");
        }
    }

    public static void eliminarDoc(int cod) {
        boolean existe = false;
        for (Documentobibliotecanodisponible d : listaDocumentos) {
            if (d.getCodigo() == cod) {
                existe = true;
                listaDocumentos.remove(d);
                JOptionPane.showMessageDialog(null, "Documento eliminado");
                break;
            }
        }
        if (existe == false) {
            JOptionPane.showMessageDialog(null, "no existe un documento con el codigo ingresado");
        }
    }

    public static void listar() {
        for (Documentobibliotecanodisponible d : listaDocumentos) {
            System.out.println(d.toString());
        }
    }
}
