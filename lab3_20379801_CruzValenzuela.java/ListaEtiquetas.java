
package Lab3_20379801_Cruz;

import java.util.ArrayList;

/**
 * Una clase para representar una lista de Etiquetas en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */

public class ListaEtiquetas {
    
    ArrayList<Etiqueta> listaEtiqueta=new ArrayList (); // Lista de etiquetas
    
    /** 
     * Añade una Etiqueta a lista de Etiquetas.
     * @param nombre.
     * @param descripcion.
     */
    public void addEtiqueta (String nombre, String descripcion) {
        Etiqueta etiqueta= new Etiqueta();
        etiqueta.setNombre(nombre);
        etiqueta.setDescripcion(descripcion);
        listaEtiqueta.add(etiqueta);
    }
    /** 
     * Añade una Etiqueta a lista de Etiquetas.
     * @param etiqueta.
     */
    public void addEtiqueta (Etiqueta etiqueta){
      listaEtiqueta.add(etiqueta);
       
    }
   
    /** 
     * Permite mostrar como String la lista de Etiquetas del Stack.
     * @return String.
     */ 
    public String mostrarEtiqueta(){
        String string ="";
            for(int i=0;i<listaEtiqueta.size();i++){
                string=string+ listaEtiqueta.get(i).toString();
            }
        return string;
          
    }
/** 
     * Permite obtener la lista de Etiqueta.
     * @return nombre.
     */ 
    public ArrayList<Etiqueta> getListaEtiqueta() {
        return listaEtiqueta;
    }
/** 
     * Permite modificar el la lista de Etiqueta.
     * @param  listaEtiqueta.
     */
    public void setListaEtiqueta(ArrayList<Etiqueta> listaEtiqueta) {
        this.listaEtiqueta = listaEtiqueta;
    }
   
}

