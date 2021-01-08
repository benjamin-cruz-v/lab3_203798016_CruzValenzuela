
package Lab3_20379801_Cruz;

import java.util.ArrayList;


public class ListaUsuario {
    
  
  ArrayList<Usuario> listaUsuario=new ArrayList ();

    public ListaUsuario() {
    }
  
  
  
    
  public void addUsuario(String nombre,int pass){
       Usuario usuario =new Usuario();
       usuario.setNombre(nombre);
       usuario.setPass(pass);
       usuario.setReputacion(10);
       usuario.setSesion(true);
       listaUsuario.add(0,usuario);
  }
    
 public String buscarUsuario(){
        String string ="";
        for(int i=0;i<listaUsuario.size();i++){ 
            if(listaUsuario.get(i).isSesion()==true)
                string=string+ listaUsuario.get(i).getNombre();
        }
       return string;
    }

 public boolean buscarUsuario(String nombre){
      
        for(int i=0;i<listaUsuario.size();i++){ 
            if(listaUsuario.get(i).getNombre().equals(nombre)){
                return true;
            }
                
        }
      return false;
    }
 
 
  
   public void mostrarUsuario(String name){
          String string ="";
          for(int i=0;i<listaUsuario.size();i++){
              if(listaUsuario.get(i).getNombre().equals(name)){
              string=string+ listaUsuario.get(i).toString(); 
              }
           
          }
          System.out.println(string); 
      }
    public void mostrarUsuario(){
          String string ="";
          for(int i=0;i<listaUsuario.size();i++){
            string=string+ listaUsuario.get(i).toString();
          }
          System.out.println(string); 
          
    }
    
    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ArrayList<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
   
    
}


