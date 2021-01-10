
package Lab3_20379801_Cruz;

import java.util.Date;
/**
 * Una clase para representar una Pregunta en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */
public class Preguntas {
    private String titulo;
    private int recompensa;
    private String pregunta;
    private int idPregunta;
    private String autor;
    Date fecha;
    private int votoAfavor;
    private String estado;
    private int votoAcontra;
    private ListaEtiquetas listaEtiquetas;
    
    /** 
     * Crea una Pregunta como constructor por defecto.
     */
    public Preguntas(){}
        
    /**
     * Metodo que entrega un string de Pregunta de forma entendible para el usuario.
     * @return string.
     */
    @Override
    public String toString() {
         return "Titulo:"+titulo+"\nPregunta:"+pregunta+", Id Pregunta: "+idPregunta+", Autor:"+autor+", Votos a favor:"+votoAfavor+
                 ", Votos en Contra:"+votoAcontra+", Recompensa:"+recompensa+", Estado:"+estado+", fecha:"+fecha+"\n"+"Etiquetas:"+listaEtiquetas.mostrarEtiqueta()+"\n";
    }
/** 
     * Permite obtener la recompensa de la Pregunta .
     * @return nombre.
     */ 
    public int getRecompensa() {
        return recompensa;
    }
/** 
     * Permite modificar la recompensa de la Pregunta .
     * @param recompensa.
     */ 
    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
/** 
     * Permite obtener el titulo de la Pregunta.
     * @return nombre.
     */ 
    public String getTitulo() {
        return titulo;
    }
/** 
     * Permite modificar el titulo de la Pregunta .
     * @param titulo.
     */ 
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
/** 
     * Permite obtener la pregunta de la Pregunta.
     * @return nombre.
     */ 
    public String getPregunta() {
        return pregunta;
    }
/** 
     * Permite modificar la pregunta de la Pregunta .
     * @param pregunta.
     */ 
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
/** 
     * Permite obtener el idPregunta de la Pregunta.
     * @return nombre.
     */ 
    public int getIdPregunta() {
        return idPregunta;
    }
/** 
     * Permite modificar el idPregunta de la Pregunta .
     * @param idPregunta.
     */ 
    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }
/** 
     * Permite obtener el autor de la Pregunta.
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
     * Permite obtener la fecha de la Pregunta.
     * @return nombre.
     */ 
    public Date getFecha() {
        return fecha;
    }
/** 
     * Permite modificar la fecha de la Pregunta .
     * @param fecha.
     */ 
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
/** 
     * Permite obtener el votoAfavor de la Pregunta.
     * @return votoAfavor.
     */ 
    public int getVotoAfavor() {
        return votoAfavor;
    }
/** 
     * Permite modificar el votoAfavor de la Pregunta .
     * @param votoAfavor.
     */ 
    public void setVotoAfavor(int votoAfavor) {
        this.votoAfavor = votoAfavor;
    }
/** 
     * Permite obtener el estado de la Pregunta.
     * @return nombre.
     */ 
    public String getEstado() {
        return estado;
    }
/** 
     * Permite modificar el estado de la Pregunta .
     * @param estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
/** 
     * Permite obtener el votoAcontra de la Pregunta.
     * @return nombre.
     */ 
    public int getVotoAcontra() {
        return votoAcontra;
    }
/** 
     * Permite modificar el votoAcontra de la Pregunta .
     * @param votoAcontra.
     */
    public void setVotoAcontra(int votoAcontra) {
        this.votoAcontra = votoAcontra;
    }
/** 
     * Permite obtener la listaEtiquetas de la Pregunta..
     * @return nombre.
     */ 
    public ListaEtiquetas getListaEtiquetas() {
        return listaEtiquetas;
    }
/** 
     * Permite modificar la listaEtiquetas de la Pregunta .
     * @param listaEtiquetas.
     */
    public void setListaEtiquetas(ListaEtiquetas listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }

    

    

    
   
    

  
    
    
}