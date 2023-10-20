/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Documento;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author abel
 */
public class Registro {
    static ArrayList<Documento>listaDocumentos;

    public Registro() {
        listaDocumentos=new ArrayList<Documento>();
    }

    public static ArrayList<Documento> getListaDocumentos() {
        return listaDocumentos;
    }

    public static void setListaDocumentos(ArrayList<Documento> listaDocumentos) {
        Registro.listaDocumentos = listaDocumentos;
    }
    
    public static void agregarDoc(Documento doc){
        boolean repetido=false;
        for(Documento d:listaDocumentos){
            if(d.getCodigo()==doc.getCodigo()){
                repetido=true;
                JOptionPane.showMessageDialog(null, "no se puede agregar puesto que el nro de doc ya existe");
                break;
            }
        }
        if(repetido==false){
            listaDocumentos.add(doc);
            JOptionPane.showMessageDialog(null, "Documento agregado satisfactoriamente");
        }
        
    }
    public static void eliminarDoc(int cod){
        boolean existe=false;
        for(Documento d:listaDocumentos){
            if(d.getCodigo()==cod){
                existe=true;
                listaDocumentos.remove(d);
                JOptionPane.showMessageDialog(null, "Documento eliminado");
                 break;
            }
        }
        if(existe==false){
            JOptionPane.showMessageDialog(null, "no existe un documento con el codigo ingresado");
        }
        
    }
    public static void listar(){
        for(Documento d:listaDocumentos){
            System.out.println(d.toString());
        }
    }
    
    
    
}
