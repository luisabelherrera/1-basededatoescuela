/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author abel
 */
public class Documento {
    private int codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private int anoPub;

    public Documento(int codigo, String titulo, String autor, String editorial, int anoPub) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anoPub = anoPub;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo +"\n"+ ", titulo=" + titulo +"\n"+ ", autor=" + autor + "\n"+ ", editorial=" + editorial +"\n"+  ", anoPub=" + anoPub +"\n";
    }
    
    
}
