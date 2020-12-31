
package Opcion2;

import java.util.ArrayList;
import java.util.Date;

public class ListaPregunta {
    
    ArrayList<Preguntas> listaPregunta=new ArrayList ();   
    Date fecha = new Date();
    
    
     public void addPregunta(String titulo, String contenido,Date fecha){
        
        Preguntas pregunta =new Preguntas();
        pregunta.setPregunta(contenido);
        pregunta.setEstado("abierta");
        pregunta.setRecompensa(0);
        pregunta.setTitulo(titulo);
        pregunta.setAutor("");
        pregunta.setFecha(fecha);
        int IdPregunta=listaPregunta.size()+1;
        pregunta.setIdPregunta(IdPregunta);
        listaPregunta.add(pregunta);   
     }

    public ArrayList<Preguntas> getListaPregunta() {
        return listaPregunta;
    }

    public void setListaPregunta(ArrayList<Preguntas> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }
     
     
     
}
