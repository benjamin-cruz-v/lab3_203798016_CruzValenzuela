
package Lab3_20379801_Cruz;

import java.util.Date;


public class Respuesta {
  private String respuesta;
   private int idRespuesta;
   private String autor;
   private int idPregunta;
   private int votoAfavor;
   private String estado;
   private int votoAcontra;
   private int recompensa;
   private Date fecha;

    
    public Respuesta(){
        
    }
    
   @Override
     public String toString(){
        return "    Respuesta:"+respuesta+ " Id Respuesta: "+idRespuesta+" Autor:"+autor+" Votos a favor:"+votoAfavor+
                 " Votos en Contra:"+votoAcontra+ " fecha"+fecha+"\n";
        
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    } 

    public int getVotoAfavor() {
        return votoAfavor;
    }

    public void setVotoAfavor(int votoAfavor) {
        this.votoAfavor = votoAfavor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getVotoAcontra() {
        return votoAcontra;
    }

    public void setVotoAcontra(int votoAcontra) {
        this.votoAcontra = votoAcontra;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
