
package Lab3_20379801_Cruz;

import java.util.Date;

/**
 * Una clase para representar una Respuesta en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */
public class Respuesta {
    private String respuesta;
    private int idRespuesta;
    private String autor;
    private int idPregunta;
    private int votoAfavor;
    private int votoAcontra;
    private Date fecha;

    /** 
     * Crea una Respuesta como constructor por defecto.
     */
    public Respuesta(){}
    
    /**
     * Metodo que entrega un string de Respuesta de forma entendible para el usuario.
     * @return string.
     */
   @Override
     public String toString(){
        return "    Respuesta:"+respuesta+ " Id Respuesta: "+idRespuesta+" Autor:"+autor+" Votos a favor:"+votoAfavor+
                 " Votos en Contra:"+votoAcontra+ " fecha"+fecha+"\n";
        
    }
  
    /** 
     * Permite obtener la respuesta de la Pregunta .
     * @return nombre.
     */ 
    public String getRespuesta() {
        return respuesta;
    }
/** 
     * Permite modificar el respuesta de la Pregunta .
     * @param  respuesta.
     */ 
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
/** 
     * Permite obtener el idRespuesta de la Respuesta.
     * @return idRespuesta.
     */
    public int getIdRespuesta() {
        return idRespuesta;
    }
/** 
     * Permite modificar el  idRespuesta de la Pregunta .
     * @param  idRespuesta.
     */ 
    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }
/** 
     * Permite obtener el autor de la Respuesta.
     * @return nombre.
     */ 
    public String getAutor() {
        return autor;
    }
/** 
     * Permite modificar el  autor de la Pregunta .
     * @param  autor.
     */ 
    public void setAutor(String autor) {
        this.autor = autor;
    }
/** 
     * Permite obtener el idPregunta de la Respuesta.
     * @return idPregunta.
     */ 
    public int getIdPregunta() {
        return idPregunta;
    }
/** 
     * Permite modificar el  idPregunta de la Pregunta .
     * @param  idPregunta.
     */ 
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    } 
/** 
     * Permite obtener el votoAfavor de la  Respuesta.
     * @return votoAfavor.
     */
    public int getVotoAfavor() {
        return votoAfavor;
    }
/** 
     * Permite modificar el votoAfavor de la Respuesta. .
     * @param votoAfavor.
     */ 
    public void setVotoAfavor(int votoAfavor) {
        this.votoAfavor = votoAfavor;
    }
/** 
     * Permite obtener el votoAcontra de la Respuesta.
     * @return nombre.
     */ 
    public int getVotoAcontra() {
        return votoAcontra;
    }
/** 
     * Permite modificar el votoAcontra de la Respuesta..
     * @param votoAcontra.
     */
    public void setVotoAcontra(int votoAcontra) {
        this.votoAcontra = votoAcontra;
    }
/** 
     * Permite obtener la fecha de la Respuesta.
     * @return nombre.
     */
    public Date getFecha() {
        return fecha;
    }
/** 
     * Permite modificar la fecha de la Respuesta.
     * @param fecha.
     */ 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
