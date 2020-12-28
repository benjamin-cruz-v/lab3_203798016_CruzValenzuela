
package Lab3_20379801_Cruz;


public class Usuario {
    public String nombre;
    public int pass;
    public boolean sesion;
    public int reputacion;
    


    public Usuario(String nombre,int pass,boolean sesion,int reputacion){

    this.nombre=nombre;
    this.pass=pass;
    this.sesion=sesion;
    this.reputacion=reputacion;

    }
    
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
    
    public String datosU(){
        return "Usuario:"+nombre+"         Sesion:"+sesion+"        Reputacion: "+reputacion+"\n";
        
    }
}
