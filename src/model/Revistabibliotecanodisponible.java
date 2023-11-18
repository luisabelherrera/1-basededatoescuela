package model;
/**
 *
 * @author abel
 */
public class Revistabibliotecanodisponible extends Documentobibliotecanodisponible {

    private int volumen;
    private int numero;
    private String mes;

    public Revistabibliotecanodisponible(int codigo, String titulo, String autor, String editorial, int anoPub, int volumen, int numero, String mes) {
        super(codigo, titulo, autor, editorial, anoPub);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return super.toString() + "volumen=" + volumen + "\n" + ", numero=" + numero + "\n" + ", mes=" + mes + "\n";
    }
}
