
package Lab3_20379801_Cruz;

/**
 * Una clase para representar un usuario en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */
public class Usuario {
    public String nombre;
    private int pass;
    private boolean sesion;
    private int reputacion;
    
    /** 
     * Crea un usuario como constructor por defecto.
     */
    public Usuario(){}
       
    
/** 
     * Permite obtener el nombre del usuario.
     * @return nombre.
     */ 
    public String getNombre() {
        return nombre;
    }
/** 
     * Permite modificar el nombre del usuario.
     * @param  nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/** 
     * Permite obtener el pass del usuario.
     * @return nombre.
     */ 
    public int getPass() {
        return pass;
    }
/** 
     * Permite modificar el pass del usuario.
     * @param  pass.
     */
    public void setPass(int pass) {
        this.pass = pass;
    }
/** 
     * Permite obtener la sesion del usuario.
     * @return nombre.
     */ 
    public boolean isSesion() {
        return sesion;
    }
/** 
     * Permite modificar la sesion del usuario.
     * @param  sesion.
     */
    public void setSesion(boolean sesion) {
        this.sesion = sesion;
    }
/** 
     * Permite obtener la reputacion del usuario.
     * @return nombre.
     */ 
    public int getReputacion() {
        return reputacion;
    }
/** 
     * Permite modificar la reputacion del usuario.
     * @param  reputacion.
     */
    public void setReputacion(int reputacion) {
        this.reputacion = reputacion;
    }
    
     
  /**
     * Metodo que entrega un string de Respuesta de forma entendible para el usuario.
     * @return string.
     */
    @Override
    public String toString() {
        return "Usuario:"+nombre+"         Sesion:"+sesion+"        Reputacion: "+reputacion+"\n";
    }
    
    
    
}
