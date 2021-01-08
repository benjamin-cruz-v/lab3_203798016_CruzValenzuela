
package Lab3_20379801_Cruz;

import java.util.ArrayList;
import java.util.Date;


public class ListaRespuesta {
    
 ArrayList<Respuesta> listaRespuesta=new ArrayList (); 
    Date fecha = new Date();
      
      public void addRespuesta(String contenido, int idPregunta){
        Respuesta respuesta =new Respuesta();
        respuesta.setRespuesta(contenido);
        respuesta.setIdPregunta(idPregunta);
        respuesta.setAutor("");
        respuesta.setRecompensa(0);
        respuesta.setVotoAcontra(0);
        respuesta.setVotoAfavor(0);
        respuesta.setFecha(fecha);
        
        int IdRespuesta=listaRespuesta.size()+1;
        respuesta.setIdRespuesta(IdRespuesta);
        listaRespuesta.add(0,respuesta);     
    }
      
      
    public String buscarUsuario(int IdRespuesta){
        String nombre="";
        for(int i=0;i<listaRespuesta.size();i++){ 
            if(listaRespuesta.get(i).getIdPregunta()== IdRespuesta){
                nombre=listaRespuesta.get(i).getAutor();
            }
              
        }
        return nombre;
    } 

    public ArrayList<Respuesta> getListaRespuesta() {
        return listaRespuesta;
    }

    public void setListaRespuesta(ArrayList<Respuesta> listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }
      
      
      
      
      
}
