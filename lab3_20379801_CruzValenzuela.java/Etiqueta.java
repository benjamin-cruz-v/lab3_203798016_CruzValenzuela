
package Lab3_20379801_Cruz;

/**
 * Una clase para representar una etiqeueta en StackoOverflow.
 * Esta Etiqueta esta determiando por su nombre y descripcion.
 * @version 1
 * @author Benjamin Cruz V.
 */

public class Etiqueta {
    
    private String nombre; // nombre de la Etiqueta
    private String descripcion; //descricpcion de la Etiqueta.
  
    /** 
     * Crea una Etiqueta a partir de su nombre y descripcion.
     * @param nombre.
     * @param descripcion.
     */
    public Etiqueta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }
    /** 
     * Crea una Etiqueta como constructor por defecto.
     */
    public Etiqueta() {}
       
    /**
     * Metodo que entrega un string de etiqueta de forma entendible para el usuario.
     * @return string.
     */
    @Override
     public String toString(){
        
        return " Nombre:"+nombre+" Descripcion:"+descripcion+"\n";
        
    }
    
    /** 
     * Permite obtener el nombre de la Etiqueta .
     * @return nombre.
     */  
    public String getNombre() {
        return nombre;
    }
    /** 
     * Permite modificar el nombre de la Etiqueta .
     * @param nombre.
     */ 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /** 
     * Permite obtener la descripcion de la Etiqueta .
     * @return nombre.
     */  
    public String getDescripcion() {
        return descripcion;
    }
    /** 
     * Permite modificar la descripcion de la Etiqueta .
     * @param descripcion.
     */ 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/** 
     * Permite obtener la cantidad de la Etiqueta .
     * @return nombre.
     */  
      
}
