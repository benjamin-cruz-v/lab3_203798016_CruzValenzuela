
package Opcion2;

public class Etiqueta {
    private String nombre;
    private String descripcion;
    
    private int id;
    

    public Etiqueta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        
    }
    
    public Etiqueta() {
       
    }
    @Override
     public String toString(){
        return id+" Nombre:"+nombre+" Descripcion:"+descripcion+"\n";
        
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
      
}
