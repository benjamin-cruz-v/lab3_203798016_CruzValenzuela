/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3_20379801_Cruz;

/**
 *
 * @author benja
 */
public class Preguntas {
    
    public String titulo;
    public boolean estado;
    public int recompensa;
    public String pregunta;
    public int idPregunta;
    public String autor;

    public Preguntas(String titulo, boolean estado, int recompensa, String pregunta, int idPregunta, String autor) {
        this.titulo = titulo;
        this.estado = estado;
        this.recompensa = recompensa;
        this.pregunta = pregunta;
        this.idPregunta = idPregunta;
        this.autor = autor;
    }
    
    public Preguntas(){
        
    }

    @Override
    public String toString() {
        return "Preguntas{" + "titulo=" + titulo + ", estado=" + estado + ", recompensa=" + recompensa + ", pregunta=" + pregunta + ", idPregunta=" + idPregunta + ", autor=" + autor + '}';
    }
    
    
    //Id, respuestas,titulo,contendoo,fecha ,autor,estado,recompensa
    
    public String datosP(){
        return "Pregunta:"+pregunta+" Id Pregunta: "+idPregunta+" Autor:"+autor+"\n";
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

