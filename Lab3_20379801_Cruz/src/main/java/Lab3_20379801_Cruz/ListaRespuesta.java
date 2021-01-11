
package Lab3_20379801_Cruz;

import java.util.ArrayList;
import java.util.Date;
/**
 * Una clase para representar una lista de Respuesta en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */

public class ListaRespuesta {
    
     private ArrayList<Respuesta> listaRespuesta=new ArrayList (); 
     private Date fecha = new Date();
     
    /** 
     * Añade una respuesta a lista de Respuesta
     * @param idPregunta.
     * @param contenido..
     */
    public void addRespuesta(Respuesta respuesta,String contenido, int idPregunta){
       
        respuesta.setRespuesta(contenido);
        respuesta.setIdPregunta(idPregunta);
        respuesta.setAutor("");
        respuesta.setVotoAcontra(0);
        respuesta.setVotoAfavor(0);
        respuesta.setFecha(fecha);
        int IdRespuesta=listaRespuesta.size()+1;
        respuesta.setIdRespuesta(IdRespuesta);
         this.listaRespuesta.add(0,respuesta);     
    }
      
    /** 
     * Permite buscar a un Usuario que fue autor de una respuesta a partir del id de la respuesta.
     * @param IdRespuesta.
     * @return String.
     */ 
    public String buscarUsuario(int IdRespuesta){
        String nombre="";
        for(int i=0;i< this.listaRespuesta.size();i++){ 
            if( this.listaRespuesta.get(i).getIdPregunta()== IdRespuesta){
                nombre= this.listaRespuesta.get(i).getAutor();
            }
              
        }
        return nombre;
    } 
/** 
     * Permite obtener la lista de Respuesta
     * @return listaRespuesta.
     */
    public ArrayList<Respuesta> getListaRespuesta() {
        return listaRespuesta;
    }

    public void setListaRespuesta(ArrayList<Respuesta> listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }
      
         
}
