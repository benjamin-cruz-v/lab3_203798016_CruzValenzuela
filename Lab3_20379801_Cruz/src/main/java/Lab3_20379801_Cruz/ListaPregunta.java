
package Lab3_20379801_Cruz;

import java.util.ArrayList;
import java.util.Date;

/**
 * Una clase para representar una lista de Preguntas en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */
public class ListaPregunta {
    
     private ArrayList<Preguntas> listaPregunta=new ArrayList ();   
     private Date fecha = new Date();
    
    /** 
     * A�ade una Preguntas a lista de Preguntas.
     * @param pregunta
     * @param titulo.
     * @param contenido.
     * @param fecha.
     * @param etiquetas.
     */
    public void addPregunta( Preguntas pregunta,String titulo, String contenido,Date fecha,ListaEtiquetas etiquetas){
        
        pregunta.setPregunta(contenido);
        pregunta.setEstado("abierta");
        pregunta.setTitulo(titulo);
        pregunta.setAutor("");
        pregunta.setFecha(fecha);
        int IdPregunta=listaPregunta.size()+1;
        pregunta.setIdPregunta(IdPregunta);
        pregunta.setListaEtiquetas(etiquetas);
        this.listaPregunta.add(0,pregunta);   
    }
     
    /** 
     * Permite buscar a un Usuario que fue autor de una pregunta a partir del id de la pregunta.
     * @param IdPregunta.
     * @return String.
     */ 
    public String buscarUsuario(int IdPregunta){
        String nombre="";
        for(int i=0;i< this.listaPregunta.size();i++){ 
            if( this.listaPregunta.get(i).getIdPregunta()==IdPregunta){
                nombre= this.listaPregunta.get(i).getAutor();
            }
            
        }
        return nombre;
    } 

    public ArrayList<Preguntas> getListaPregunta() {
        return listaPregunta;
    }
/** 
     * Permite modificar la lista de Preguntas.
     * @param  listaPregunta.
     */
    public void setListaPregunta(ArrayList<Preguntas> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }
     
     
     
}

