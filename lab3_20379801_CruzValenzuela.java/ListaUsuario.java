
package Lab3_20379801_Cruz;

import java.util.ArrayList;
/**
 * Una clase para representar una lista de usuarios en StackoOverflow.
 * @version 1
 * @author Benjamin Cruz V.
 */

public class ListaUsuario {
    
  
     private ArrayList<Usuario> listaUsuario=new ArrayList ();
    
    /** 
     * Añade una usuario a lista de usuarios.
     * @param usuario
     * @param nombre.
     * @param pass..
     */
    public void addUsuario(Usuario usuario,String nombre,String pass){
       
       usuario.setNombre(nombre);
       usuario.setPass(pass);
       usuario.setReputacion(0);
       usuario.setSesion(true);
       listaUsuario.add(0,usuario);
    }
    /** 
     * Permite buscar a un Usuario con sesion activa.
     * @return String.
     */ 
    public String buscarUsuario(){
        String string ="";
            for(int i=0;i<listaUsuario.size();i++){ 
                if(listaUsuario.get(i).isSesion()==true)
                    string=string+ listaUsuario.get(i).getNombre();
                }
        return string;
    }
    /** 
     * Permite buscar a un Usuario a a partir de su nombre.
     * @param nombre.
     * @return boolean.
     */ 
    public boolean buscarUsuario(String nombre){
        for(int i=0;i<listaUsuario.size();i++){ 
            if(listaUsuario.get(i).getNombre().equals(nombre)){
                return true;
            }
                
        }
      return false;
    }
 
    /**
     * Metodo que entrega un string de los Usuarios de forma entendible.
     * @param nombre.
     */
    public void mostrarUsuario(String nombre){
        String string ="";
        for(int i=0;i<listaUsuario.size();i++){
            if(listaUsuario.get(i).getNombre().equals(nombre)){
                string=string+ listaUsuario.get(i).toString(); 
            }
           
        }
          System.out.println(string); 
    }
   /**
     * Metodo que entrega un string de los Usuarios de forma entendible.
     */
    public void mostrarUsuario(){
        String string ="";
        for(int i=0;i<listaUsuario.size();i++){
            string=string+ listaUsuario.get(i).toString();
        }
        System.out.println(string); 
          
    }
 /** 
     * Permite obtener la lista de usuarios.
     * @return listaUsuario.
     */   
    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }
/** 
     * Permite modificar la lista de usuarios.
     * @param  listaUsuario.
     */
    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
   
    
}


