
package Lab3_20379801_Cruz;

import java.util.ArrayList;
import java.util.Date;


public class ListaPregunta {
    
 ArrayList<Preguntas> listaPregunta=new ArrayList ();   
    Date fecha = new Date();
    
    
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
     
     
    public String buscarUsuario(int IdPregunta){
        String nombre="";
        for(int i=0;i<listaPregunta.size();i++){ 
            if(listaPregunta.get(i).getIdPregunta()==IdPregunta){
                nombre=listaPregunta.get(i).getAutor();
            }
            
        }
        return nombre;
    } 

    public ArrayList<Preguntas> getListaPregunta() {
        return listaPregunta;
    }

    public void setListaPregunta(ArrayList<Preguntas> listaPregunta) {
        this.listaPregunta = listaPregunta;
    }
     
     
     
}

