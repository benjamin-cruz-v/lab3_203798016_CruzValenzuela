
package Lab3_20379801_Cruz;

import java.util.ArrayList;
import java.util.Date;

public class Stack {
    
  private ListaUsuario listaUsuario;
    private ListaPregunta listaPregunta;
    private  ListaRespuesta listaRespuesta;
   
    private   ListaEtiquetas listaEtiquetaP;
    
    
   
    public Stack(){
       this.listaPregunta=new ListaPregunta();
       this.listaRespuesta= new ListaRespuesta();
       this.listaUsuario= new ListaUsuario() ;
       this.listaEtiquetaP=new  ListaEtiquetas();
    }
     
    public boolean register(String nombre,int pass){     
        if(listaUsuario.getListaUsuario().isEmpty()==true){
            listaUsuario.addUsuario(nombre, pass);
            return true;
        }
        if(listaUsuario.buscarUsuario(nombre)){
            System.out.println("#Usuario ya Registrado#");
            return false;
        }
        else{
            listaUsuario.addUsuario(nombre, pass);
            return true;
        }
    }  
    
     public void logout(String name){
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
            if(listaUsuario.getListaUsuario().get(i).getNombre().equals(name)){
                listaUsuario.getListaUsuario().get(i).setSesion(false);
            } 
        }
    }
    
    public boolean login(String name,int pass){
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
           if((listaUsuario.getListaUsuario().get(i).getNombre().equals(name))&&(listaUsuario.getListaUsuario().get(i).getPass()==pass)){
               listaUsuario.getListaUsuario().get(i).setSesion(true);
                return true;
           } 
        }
        return false;
    }
    
    
    
    
    public void ask(String titulo, String contenido,ListaEtiquetas etiquetas){
        Date fecha = new Date();
        listaPregunta.addPregunta(titulo, contenido,fecha,etiquetas);
      
    }
    public void answer(String res,int IdPregunta){  
        listaRespuesta.addRespuesta(res, IdPregunta);
    }
     
     
    public void reward(int IdPregunta,int recompensa){
       int reputacion=0;
       String nombre="";
        for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
            if(listaPregunta.getListaPregunta().get(i).getIdPregunta()==IdPregunta){
               nombre= listaPregunta.getListaPregunta().get(i).getAutor();
            }
        }  
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){
            if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre)){
                if(listaUsuario.getListaUsuario().get(i).getReputacion()>recompensa){
                    reputacion=listaUsuario.getListaUsuario().get(i).getReputacion()-recompensa;
                    listaUsuario.getListaUsuario().get(i).setReputacion(reputacion);
                    for(int j=0;j<listaPregunta.getListaPregunta().size();j++){
                        if(listaPregunta.getListaPregunta().get(j).getIdPregunta()==IdPregunta){
                            listaPregunta.getListaPregunta().get(i).setRecompensa(recompensa);
                        }
                    }   
                }
                else{
                   System.out.println("#No se puede ofrecer recompensas mayores a la reputacion con la que cuenta el usuario#");  
                }
            }
        }
    }
    
    
    public void accept(int IdPregunta,int IdRespuesta){
       String nombre1=listaPregunta.buscarUsuario(IdPregunta);
        String nombre2=listaRespuesta.buscarUsuario(IdRespuesta);
        int num=0;
        int reputacion;
        int recompensa=0;
        for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
            if(listaPregunta.getListaPregunta().get(i).getIdPregunta()==IdPregunta){
                num=i;
                recompensa=listaPregunta.getListaPregunta().get(i).getRecompensa();
                listaPregunta.getListaPregunta().get(i).setRecompensa(0);
                listaPregunta.getListaPregunta().get(i).setEstado("cerrada");
            }
        }
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
            if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre1)){
                reputacion=listaUsuario.getListaUsuario().get(i).getReputacion();
                listaUsuario.getListaUsuario().get(i).setReputacion(reputacion+2);
            }
        }
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
            if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre2)){
                reputacion=listaUsuario.getListaUsuario().get(i).getReputacion();
                reputacion=reputacion+15+recompensa;
               
                listaUsuario.getListaUsuario().get(i).setReputacion(reputacion);
         
            }
        }
     }
     
     
    public void vote(ListaPregunta listaPregunta,int Id,String voto){
        String nombre="";
        if(voto.equals("true")){
        int reputacion;
            for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
                if(listaPregunta.getListaPregunta().get(i).getIdPregunta()==Id){
                nombre= listaPregunta.getListaPregunta().get(i).getAutor();
                listaPregunta.getListaPregunta().get(i).setVotoAfavor(+1);
                }
            }
            for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
                if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre)){
                    reputacion=listaUsuario.getListaUsuario().get(i).getReputacion();
                    listaUsuario.getListaUsuario().get(i).setReputacion(reputacion+10);
                }
            }
        }
        if(voto.equals("false")){
        int reputacion;
            for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
                if(listaPregunta.getListaPregunta().get(i).getIdPregunta()==Id){
                nombre= listaPregunta.getListaPregunta().get(i).getAutor();
                listaPregunta.getListaPregunta().get(i).setVotoAfavor(-1);
                }
            }
            for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
                if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre)){
                    reputacion=listaUsuario.getListaUsuario().get(i).getReputacion();
                    listaUsuario.getListaUsuario().get(i).setReputacion(reputacion-10);
                }
            }
        }
        
        
    }
    public void vote(ListaRespuesta listaRespuesta,int Id,String voto){
        String nombre="";
        if(voto.equals("true")){
        int reputacion;
            for(int i=0;i<listaRespuesta.getListaRespuesta().size();i++){
                if(listaRespuesta.getListaRespuesta().get(i).getIdPregunta()==Id){
                nombre= listaRespuesta.getListaRespuesta().get(i).getAutor();
                listaRespuesta.getListaRespuesta().get(i).setVotoAfavor(+1);
                }
            }
            for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
                if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre)){
                    reputacion=listaUsuario.getListaUsuario().get(i).getReputacion();
                    listaUsuario.getListaUsuario().get(i).setReputacion(reputacion+10);
                }
            }
        }
       if(voto.equals("false")){
        int reputacion;
            for(int i=0;i<listaRespuesta.getListaRespuesta().size();i++){
                if(listaRespuesta.getListaRespuesta().get(i).getIdPregunta()==Id){
                nombre= listaRespuesta.getListaRespuesta().get(i).getAutor();
                listaRespuesta.getListaRespuesta().get(i).setVotoAfavor(-1);
                }
            }
            for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
                if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre)){
                    reputacion=listaUsuario.getListaUsuario().get(i).getReputacion();
                    listaUsuario.getListaUsuario().get(i).setReputacion(reputacion-2);
                }
            }
        }
    }
     
    public void mostrarPregunta(){
        String string ="";
        for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
            if(listaPregunta.getListaPregunta().get(i).getEstado().equalsIgnoreCase("abierta")){
                int x=listaPregunta.getListaPregunta().get(i).getIdPregunta();
                string=string+ listaPregunta.getListaPregunta().get(i).toString();
          
                for(int j=0;j<listaRespuesta.getListaRespuesta().size();j++){
                    if(listaRespuesta.getListaRespuesta().get(j).getIdPregunta()==x){
              
                        string=string+listaRespuesta.getListaRespuesta().get(j).toString();
                    }
             
                }
            
            }
        }
          
          System.out.println(string); 
    }

    public void mostrarPregunta(String nombre){
        String string ="";
            for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
                if((listaPregunta.getListaPregunta().get(i).getAutor().equals(nombre))&&(listaPregunta.getListaPregunta().get(i).getEstado().equalsIgnoreCase("abierta"))){
                    int x=listaPregunta.getListaPregunta().get(i).getIdPregunta();
                    string=string+ listaPregunta.getListaPregunta().get(i).toString();
          
                    for(int j=0;j<listaRespuesta.getListaRespuesta().size();j++){
                        if(listaRespuesta.getListaRespuesta().get(j).getIdPregunta()==x){
                            string=string+listaRespuesta.getListaRespuesta().get(j).toString();
                        
                        }
                    }
            
                }
          }
          
        System.out.println(string); 
    }
    public void PreguntasNotUsuario(String nombre){
        String string ="";
            for(int i=0;i<listaPregunta.getListaPregunta().size();i++){
                if(!((listaPregunta.getListaPregunta().get(i).getAutor().equals(nombre)))&&(listaPregunta.getListaPregunta().get(i).getEstado().equalsIgnoreCase("abierta"))){
                    int x=listaPregunta.getListaPregunta().get(i).getIdPregunta();
                    string=string+ listaPregunta.getListaPregunta().get(i).toString();
          
                    for(int j=0;j<listaRespuesta.getListaRespuesta().size();j++){
                        if(listaRespuesta.getListaRespuesta().get(j).getIdPregunta()==x){
                            string=string+listaRespuesta.getListaRespuesta().get(j).toString();
                        
                        }
                    }
            
                }
          }
          
        System.out.println(string); 
    }

    
          
    

    public ListaUsuario getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(ListaUsuario listaUsuario) {
        this.listaUsuario = listaUsuario;
    }

    public ListaPregunta getListaPregunta() {
        return listaPregunta;
    }

    public void setListaPregunta(ListaPregunta listaPregunta) {
        this.listaPregunta = listaPregunta;
    }

    public ListaRespuesta getListaRespuesta() {
        return listaRespuesta;
    }

    public void setListaRespuesta(ListaRespuesta listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }

    public ListaEtiquetas getListaEtiquetaP() {
        return listaEtiquetaP;
    }

    public void setListaEtiquetaP(ListaEtiquetas listaEtiquetaP) {
        this.listaEtiquetaP = listaEtiquetaP;
    }
   
    
    
    
    
}