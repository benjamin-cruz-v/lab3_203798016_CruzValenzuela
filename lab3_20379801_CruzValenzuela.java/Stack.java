
package Lab3_20379801_Cruz;

/**
 * Una clase para representar el stackOverflow.
 * Este stack esta compuesto por los elementos como Lista Usuario,Lista Pregunta,Lista Respuesta yLista Etiquetas
 * @version 1
 * @author Benjamin Cruz V.
 */

import java.util.Date;

public class Stack {
    
    private ListaUsuario listaUsuario; // Lista de Usuario que tiene el Stack.
    private ListaPregunta listaPregunta; // Lista de Preguntas que tiene el Stack
    private ListaRespuesta listaRespuesta; // Lista de Respuestas que tiene el Stack
    private ListaEtiquetas listaEtiqueta; // Lista de Etiquetas que tiene el Stack
    
     /** 
     * Crea un stack inicializando los construcotres de las clases que son los atributos.
     */
    public Stack(){
       this.listaPregunta=new ListaPregunta();
       this.listaRespuesta= new ListaRespuesta();
       this.listaUsuario= new ListaUsuario() ;
       this.listaEtiqueta=new  ListaEtiquetas();
    }
    /** 
     * Registra un Usuario en el stack, agregandolo en la lista de usuarios.
     * @param nombre, indica el nombre de Usuario.
     * @param pass, contraseña del Usuario.
     * @return boolean, true en caso que se registre un nuevo Usuario.
     */
    public boolean register(String nombre,String pass){     
        if(listaUsuario.getListaUsuario().isEmpty()==true){
            Usuario usuario =new Usuario();
            listaUsuario.addUsuario(usuario,nombre, pass);
            return true;
        }
        if(listaUsuario.buscarUsuario(nombre)){
            System.out.println("#Usuario ya Registrado#");
            return false;
        }
        else{
             Usuario usuario =new Usuario();
            listaUsuario.addUsuario(usuario,nombre, pass);
            return true;
        }
    }  
    
    /** 
     * Logout cierra la sesion de usuario actualmente iniciada.
     * @param nombre, indica el nombre de Usuario.
     */
    public void logout(String nombre){
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
            if(listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre)){
                listaUsuario.getListaUsuario().get(i).setSesion(false);
            } 
        }
    }
    
    /** 
     * Valida las credenciales del Usuario, para ingresar al Stack.
     * @param nombre, indica el nombre de Usuario.
     * @param pass, contraseña del Usuario.
     * @return boolean, true en caso de logueo de forma correcta.
     */
    public boolean login(String nombre,String pass){
        for(int i=0;i<listaUsuario.getListaUsuario().size();i++){ 
           if((listaUsuario.getListaUsuario().get(i).getNombre().equals(nombre))&&(listaUsuario.getListaUsuario().get(i).getPass().equals(pass))){
               listaUsuario.getListaUsuario().get(i).setSesion(true);
                return true;
           } 
        }
        return false;
    }

    /** 
     * Permite a un usuario (con sesión iniciada en el Stack) realizar una nueva pregunta
     * @param titulo, indica el nombre de Usuario.
     * @param contenido, Contenido de la Pregunta realizada.
     * @param etiquetas, lista de Etiquetas.
     */
    public void ask(String titulo, String contenido,ListaEtiquetas etiquetas){
        Date fecha = new Date();
        Preguntas pregunta =new Preguntas();
        listaPregunta.addPregunta(pregunta,titulo, contenido,fecha,etiquetas);
      
    }
    
    /** 
     *Permite añadir una respuesta a una pregunta dentro del Stack, dejándola almacenada en la estructura correspondiente.
     * @param contenido,Contenido de la respuesta.
     * @param IdPregunta, id de la pregunta que se realizo.
     */
    public void answer(String contenido,int IdPregunta){
        Respuesta respuesta =new Respuesta();
        listaRespuesta.addRespuesta(respuesta,contenido, IdPregunta);
    }
     
    /** 
     * Permite a un usuario (con sesión iniciada) en la plataforma ofrecer una recompensa para una determinada pregunta
     * @param IdPregunta,id de la pregunta que se realizo.
     * @param recompensa, entregada que se le da una pregunta.
     */
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
                            System.out.println("!!Recompensa dada de forma Exitosa!!");
                        }
                    }   
                }
                else{
                   System.out.println("#No se puede ofrecer recompensas mayores a la reputacion con la que cuenta el usuario#");  
                }
            }
        }
    }
    
    /** 
     * Permite a un usuario (con sesión iniciada en la plataforma) aceptar una respuesta a una de sus preguntas.
     * @param IdPregunta,id de la pregunta que se realizo.
     * @param IdRespuesta, id de la respuesta que se realizo.
     */
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
     
    /** 
     * Permite a un usuario votar por una pregunta o respuesta. El voto puede ser positivo o negativo
     * @param listaPregunta, del Stack.
     * @param Id, id de una pregunta.
     * @param voto, voto que puede ser positivo o negativo
     */ 
    public void vote(ListaPregunta listaPregunta,int Id,String voto){
        String nombre="";
        String nombre2=listaUsuario.buscarUsuario();
        String nombre3=listaPregunta.buscarUsuario(Id);
        if(!(nombre2.equals(nombre3))){
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
                System.out.println("!!Su voto se realizo de forma correcta!!");
            }
        
            if(voto.equals("false")&&nombre2.equalsIgnoreCase(nombre3)){
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
                System.out.println("!!Su voto se realizo de forma correcta!!");
            }
        
        }
        else{
            System.out.println("#No puede Votar por una Pregunta Propia#"); 
        } 
        
        
    }
    /** 
     * Permite a un usuario votar por una pregunta o respuesta. El voto puede ser positivo o negativo
     * @param listaRespuesta, del Stack.
     * @param Id, id de una pregunta.
     * @param voto, voto que puede ser positivo o negativo
     */ 
    public void vote(ListaRespuesta listaRespuesta,int Id,String voto){
        String nombre="";
        String nombre2=listaUsuario.buscarUsuario();
        String nombre3=listaRespuesta.buscarUsuario(Id);
        if(!(nombre2.equals(nombre3))){
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
                System.out.println("!!Su voto se realizo de forma correcta!!");
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
        else{
            System.out.println("#No puede Votar por una Pregunta Propia#"); 
        } 
    }
    
    /** 
     * Permite mostrar como String la lista de Preguntas del Stack
     */ 
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
     /** 
     * Permite mostrar como String la lista de Preguntas del Stack del Usuario selañado.
     * @param nombre, del usuario.
     */ 
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
    /** 
     * Permite mostrar como String la lista de Preguntas del Stack del que NO es Usuario selañado.
     * @param nombre, del usuario.
     */ 
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

    
    /** 
     * Permite obtener la lista de Usuarios del Stack.
     * @return ListaUsuario.
     */       
    public ListaUsuario getListaUsuario() {
        return listaUsuario;
    }
    /** 
     * Permite modificar la lista de Usuario.
     * @param listaUsuario.
     */ 
    public void setListaUsuario(ListaUsuario listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    /** 
     * Permite obtener la lista de Preguntas del Stack.
     * @return ListaPregunta.
     */  
    public ListaPregunta getListaPregunta() {
        return listaPregunta;
    }
    /** 
     * Permite modificar la lista de Pregunta.
     * @param listaPregunta.
     */ 
    public void setListaPregunta(ListaPregunta listaPregunta) {
        this.listaPregunta = listaPregunta;
    }
    /** 
     * Permite obtener la lista de Respuestas del Stack.
     * @return ListaRespuesta.
     */  
    public ListaRespuesta getListaRespuesta() {
        return listaRespuesta;
    }
    /** 
     * Permite modificar la lista de Respuesta.
     * @param listaRespuesta.
     */ 
    public void setListaRespuesta(ListaRespuesta listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }
    /** 
     * Permite obtener la lista de Etiquetas del Stack.
     * @return ListaEtiquetas.
     */  
    public ListaEtiquetas getListaEtiqueta() {
        return listaEtiqueta;
    }
     /** 
     * Permite modificar la lista de Etiqueta.
     * @param listaEtiquetaP.
     */ 
    public void setListaEtiqueta(ListaEtiquetas listaEtiquetaP) {
        this.listaEtiqueta = listaEtiquetaP;
    }
   
    
    
    
    
}