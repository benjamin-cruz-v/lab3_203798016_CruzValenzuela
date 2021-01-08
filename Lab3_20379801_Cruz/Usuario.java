
package Lab3_20379801_Cruz;


public class Usuario {
    public String nombre;
    private int pass;
    private boolean sesion;
    private int reputacion;
    
   public Usuario(){
       
   }

   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public boolean isSesion() {
        return sesion;
    }

    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }

    public int getReputacion() {
        return reputacion;
    }

    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }
    
     

    @Override
    public String toString() {
        return "Usuario:"+nombre+"         Sesion:"+sesion+"        Reputacion: "+reputacion+"\n";
    }
    
    
    
}
