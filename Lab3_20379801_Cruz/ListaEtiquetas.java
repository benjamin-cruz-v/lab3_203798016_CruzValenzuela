
package Lab3_20379801_Cruz;

import java.util.ArrayList;


public class ListaEtiquetas {
    
ArrayList<Etiqueta> listaEtiqueta=new ArrayList ();
  
       
   
   
   public void addE (String nombre, String descripcion) {
      Etiqueta etiqueta= new Etiqueta();
      etiqueta.setNombre(nombre);
      etiqueta.setDescripcion(descripcion);
      listaEtiqueta.add(etiqueta);
   }
   public void addE (Etiqueta etiqueta){
      listaEtiqueta.add(etiqueta);
       
   }
   
   
     public String mostrarEtiqueta(){
          String string ="";
          for(int i=0;i<listaEtiqueta.size();i++){
            string=string+ listaEtiqueta.get(i).toString();
          }
          return string;
          
    }

    

    public ArrayList<Etiqueta> getListaEtiqueta() {
        return listaEtiqueta;
    }

    public void setListaEtiqueta(ArrayList<Etiqueta> listaEtiqueta) {
        this.listaEtiqueta = listaEtiqueta;
    }
   
}
