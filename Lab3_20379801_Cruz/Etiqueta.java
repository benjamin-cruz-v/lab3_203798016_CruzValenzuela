
package Lab3_20379801_Cruz;


public class Etiqueta {
    
 private String nombre;
    private String descripcion;
    
   
    

    public Etiqueta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }
    
    public Etiqueta() {
       
    }
    @Override
     public String toString(){
        return " Nombre:"+nombre+" Descripcion:"+descripcion+"\n";
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

   
    
      
}
