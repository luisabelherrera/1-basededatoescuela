package model;

public class Libro extends Documento {

    private boolean prestado;

    public Libro(int codigo, String titulo, String autor, String editorial, int anoPub, boolean prestado) {
        super(codigo, titulo, autor, editorial, anoPub);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString() + "prestado=" + prestado + "\n";
    }

}
