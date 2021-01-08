
package Lab3_20379801_Cruz;

import java.util.ArrayList;
import java.util.Date;

/**
 * Una clase para representar una lista de Preguntas en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */
public class ListaPregunta {
    
    ArrayList<Preguntas> listaPregunta=new ArrayList ();   
    Date fecha = new Date();
    
    /** 
     * Añade una Preguntas a lista de Preguntas.
     * @param titulo.
     * @param contenido.
     * @param fecha.
     * @param etiquetas.
     */
    public void addPregunta(String titulo, String contenido,Date fecha,ListaEtiquetas etiquetas){
        Preguntas pregunta =new Preguntas();
        pregunta.setPregunta(contenido);
        pregunta.setEstado("abierta");
        pregunta.setTitulo(titulo);
        pregunta.setAutor("");
        pregunta.setFecha(fecha);
        int IdPregunta=listaPregunta.size()+1;
        pregunta.setIdPregunta(IdPregunta);
        pregunta.setListaEtiquetas(etiquetas);
        listaPregunta.add(0,pregunta);   
    }
     
    /** 
     * Permite buscar a un Usuario que fue autor de una pregunta a partir del id de la pregunta.
     * @param IdPregunta.
     * @return String.
     */ 
    public String buscarUsuario(int IdPregunta){
        String nombre="";
        for(int i=0;i<listaPregunta.size();i++){ 
            if(listaPregunta.get(i).getIdPregunta()==IdPregunta){
                nombre=listaPregunta.get(i).getAutor();
            }
            
        }
        return nombre;
    } 
/** 
     * Permite obtener la lista de Preguntas.
     * @return listaPregunta.
     */
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

