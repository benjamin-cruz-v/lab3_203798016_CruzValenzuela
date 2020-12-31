
package Lab3_20379801_Cruz;


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
   
    
    public Preguntas(){
        
    }

    @Override
    public String toString() {
         return "Pregunta:"+pregunta+" Id Pregunta: "+idPregunta+" Autor:"+autor+" fecha"+fecha+" Votos a favor:"+votoAfavor+
                 " Votos en Contra:"+votoAcontra+" Recompenda"+recompensa+" Estado:"+estado+"\n";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
    

  
    
    
}


