
package Lab3_20379801_Cruz;


import java.util.Scanner;


public class Main {
    
   public static void main(String[] args) {
   
   Stack stack=new Stack();
       
   
   //Se declara forma inicial 1 Stack, 4 usuarios registrados, 5 preguntas, 10 respuestas y 3 etiquetas.
   ListaEtiquetas listaEtiquetaP = new  ListaEtiquetas();
   Etiqueta etiqueta= new Etiqueta();
   stack.getListaEtiqueta().addEtiqueta(etiqueta,"C", "descripcion 1");
   Etiqueta etiqueta2= new Etiqueta();
   stack.getListaEtiqueta().addEtiqueta(etiqueta2,"Java", "descripcion 4");
   Etiqueta etiqueta3= new Etiqueta();
   stack.getListaEtiqueta().addEtiqueta(etiqueta3,"Lips", "descripcion 3");

   Etiqueta etiquetaEjemplo1= new Etiqueta();
   listaEtiquetaP.addEtiqueta(etiquetaEjemplo1,"P", "descripcion P 1");
   Etiqueta etiquetaEjemplo2= new Etiqueta();
   listaEtiquetaP.addEtiqueta(etiquetaEjemplo2,"C", "descripcion P 1");
   
   stack.register("benja", "pass1");
   stack.ask("titulo 1","Pregunta 1",stack.getListaEtiqueta());
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("benja");
   stack.ask("titulo 2","Pregunta 2",listaEtiquetaP);
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("benja");
   stack.logout("benja");
   
   stack.register("lucas", "pass2");
   stack.ask("titulo 3","Pregunta 3",listaEtiquetaP);
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("lucas");
   stack.answer("Respuesta 1",1);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("lucas");
   stack.answer("Respuesta 2",2);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("lucas");
   stack.logout("lucas");
   
   
   stack.register("Jon", "pass3");
   stack.ask("titulo 4","Pregunta 4",listaEtiquetaP);
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("Jon");
   stack.ask("titulo 5","Pregunta 5",listaEtiquetaP);
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("Jon");
   stack.answer("Respuesta 3",1);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("Jon");
   stack.answer("Respuesta 4",2);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("Jon");
   stack.answer("Respuesta 5",3);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("Jon");
   stack.logout("Jon");
   
   stack.register("peter", "pass4");
   stack.ask("titulo 6","Pregunta 6",listaEtiquetaP);
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("peter");
   stack.ask("titulo 7","Pregunta 7",listaEtiquetaP);
   stack.getListaPregunta().getListaPregunta().get(0).setAutor("peter");
   stack.answer("Respuesta 6",1);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("peter");
   stack.answer("Respuesta 7",5);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("peter");
   stack.logout("peter");
   
   stack.login("benja", "pass1");
   stack.answer("Respuesta 8",4);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("benja");
   stack.answer("Respuesta 9",6);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("benja");
   stack.logout("benja");
   
   stack.login("lucas", "pass2");
   stack.answer("Respuesta 10",7);
   stack.getListaRespuesta().getListaRespuesta().get(0).setAutor("lucas");
   stack.logout("lucas");
   
    //Menu interactivo
    System.out.println("### STACKORVERFLOW  ### ");   
    boolean salir =false;
    Scanner Entrada=new Scanner(System.in); 
    Scanner Entrada2=new Scanner(System.in);
    
    while(!salir){
    boolean n=true;
    boolean n2=true;
        //Primer ciclo, correspondiente al menu de inicio
        while(n==true){
            menuInicio();
            int num2 =Entrada2.nextInt();
            switch(num2){
                case 1:
                    System.out.println("Ingrese nuevo Usuario");
                    Scanner name=new Scanner(System.in);
                    String nombre=name.nextLine();
                    System.out.println("Ingrese nueva contraseña");
                    Scanner contraseña=new Scanner(System.in);
                    String pass=contraseña.nextLine();
                    if(stack.register(nombre, pass)==true){
                        n=false;
                        break;    
                    }
                    else{
                        break;           
                    }            
                case 2:
                    System.out.println("Ingrese Usuario");
                    Scanner name2=new Scanner(System.in);
                    String nombre2=name2.nextLine();
                    System.out.println("Ingrese contraseña");
                    Scanner contraseña2=new Scanner(System.in);
                    String pass2 =contraseña2.nextLine();
                    if(stack.login(nombre2, pass2)==true){ 
                        System.out.println("#Sesion Iniciada#");
                        n=false;
                        break;
                    }
                    else{
                        System.out.println("#La Contraseña o Usuario es Incorrecto#");       
                        break;
                    }
                case 3: 
                    System.out.println("#El Programa ha Finalizado#");
                    salir=true;
                    n=false;
                    n2=false;
                    break;
                    default:
                    System.out.println("#Opcion No Valida\n#");
                    break;
            }    
        }
        while(n2==true){
            System.out.println("### SISTEMA DE PREGUNTAS Y RESPUESTAS ### ");
            String nombre=stack.getListaUsuario().buscarUsuario();
            stack.getListaUsuario().mostrarUsuario(nombre);
            menuStack();
            int num =Entrada.nextInt();
            switch(num){
                case 1:
                    System.out.println("Ingrese Titulo");
                    Scanner entradatitulo=new Scanner(System.in);
                    String titulo=entradatitulo.nextLine();
                    System.out.println("Ingrese Contenido");
                    Scanner entradaContenido=new Scanner(System.in);
                    String contenido=entradaContenido.nextLine();
                    ListaEtiquetas listaEtiquetaP2 = new  ListaEtiquetas();
                    boolean e=true;
                    while(e==true){
                        System.out.println("Listado de Etiquetas ");
                        System.out.println(stack.getListaEtiqueta().mostrarEtiqueta());
                        System.out.println("Opcion 1: Añadir  Etiqueta ");
                        System.out.println("Opcion 2: Crear Etiqueta");
                        System.out.println("Opcion 3: Salir de Etiquetas");
                        Scanner entradaE1=new Scanner(System.in);
                        int opcionE=entradaE1.nextInt();  
                        if(opcionE==1){
                            System.out.println("Ingrese numero de la Etiqueta");
                            Scanner entradaEtiqueta2=new Scanner(System.in);
                            int numEtiqueta=entradaEtiqueta2.nextInt()-1;
                            listaEtiquetaP2.addEtiqueta(stack.getListaEtiqueta().getListaEtiqueta().get(numEtiqueta));   
                        }    
                        
                        if(opcionE==2){
                            Etiqueta etiquetaP= new Etiqueta();
                            System.out.println("Ingrese Contenido de la Etiqueta");
                            Scanner entradaEtiqueta=new Scanner(System.in);
                            String nombreEtiqueta=entradaEtiqueta.nextLine();
                            System.out.println("Ingrese Descripcion de la Etiqueta");
                            Scanner entradaEtiqueta2=new Scanner(System.in);
                            String descripcion=entradaEtiqueta2.nextLine(); 
                            listaEtiquetaP2.addEtiqueta(etiquetaP,nombreEtiqueta, descripcion);
                            stack.getListaEtiqueta().addEtiqueta(etiquetaP,nombreEtiqueta, descripcion);
                        }
                        if(opcionE==3){
                            n=false;
                            break;
                        }
                        if(opcionE!=1 && opcionE!=2 && opcionE!=3){
                           System.out.println("#Opcion no valida#");
                           e=true;
                        }
                    }
                    stack.ask(titulo,contenido,listaEtiquetaP2);
                    stack.getListaPregunta().getListaPregunta().get(0).setAutor(nombre);
                    System.out.println("#Pregunta agregada al Stack#");
                    //stack.mostrarPregunta();
                    break;
                    
                case 2:
                    System.out.println("Listado de Preguntas\n");
                    stack.mostrarPregunta();
                    System.out.println("Ingrese Id de la Pregunta");
                    Scanner idPregunta=new Scanner(System.in);
                    int id =idPregunta.nextInt();
                    System.out.println("Ingrese la Respuesta");
                    Scanner textoRespuesta=new Scanner(System.in);
                    String respuesta=textoRespuesta.nextLine();
                    stack.answer(respuesta,id);
                    stack.getListaRespuesta().getListaRespuesta().get(0).setAutor(nombre);
                    System.out.println("#Respuesta agregada al Stack#");
                    break;
                    
                case 3:
                    System.out.println("Listado de Preguntas\n");
                    stack.mostrarPregunta();
                    System.out.println("Ingrese Id de la Pregunta");
                    Scanner idPreguntar=new Scanner(System.in);
                    int idr =idPreguntar.nextInt();
                    System.out.println("Ingrese Recompensa");
                    Scanner recom=new Scanner(System.in);
                    int recompensa =recom.nextInt();
                    stack.reward(idr,recompensa);
                    break;
                    
                case 4:
                    System.out.println("Listado de Preguntas\n");
                    stack.mostrarPregunta(nombre);
                    System.out.println("Ingrese Id de la Pregunta");
                    Scanner idPreguntaA=new Scanner(System.in);
                    int IdpA =idPreguntaA.nextInt();
                    System.out.println("Ingrese Id de la Respuesta");
                    Scanner idRespuestaA=new Scanner(System.in);
                    int IdrA =idRespuestaA.nextInt();
                    stack.accept(IdpA, IdrA);
                    System.out.println("!!Respuesta Aceptada de forma Exitosa!!");
                    break;
                
                case 5:
                   
                    System.out.println("Listado de Preguntas\n");
                    stack.PreguntasNotUsuario(nombre);
                    boolean cicloV=true;
                    while(cicloV==true){
                    System.out.println("Seleccione Si es Pregunta o Respuesta a votar\n");
                    System.out.println("Pregunta Opcion 1: Pregunta\n");
                    System.out.println("Respuesta Opcion 2: Respuesta\n");
                    Scanner opcionV=new Scanner(System.in);
                    int opcionv =opcionV.nextInt();
                        if(opcionv==1){
                            System.out.println("Ingrese Id de la Pregunta");
                            Scanner idPreguntav=new Scanner(System.in);
                            int Id =idPreguntav.nextInt();
                            System.out.println("Ingrese true o false");
                            Scanner voto=new Scanner(System.in);
                            String vote=voto.nextLine();
                            stack.vote(stack.getListaPregunta(),Id,vote);
                            cicloV=false;
                        
                        }
                        if(opcionv==2){
                            System.out.println("Ingrese Id de la Respuesta");
                            Scanner idPreguntav=new Scanner(System.in);
                            int Id =idPreguntav.nextInt();
                            System.out.println("Ingrese true o false");
                            Scanner voto=new Scanner(System.in);
                            String vote=voto.nextLine();
                            stack.vote(stack.getListaRespuesta(),Id,vote);
                            cicloV=false;
                        }
                        if(opcionv!=1 && opcionv!=2){
                           System.out.println("#Opcion no valida#");
                           e=true;
                        }
                        
                    }
                    
                    break;
                    
                case 6:
                    System.out.println("#Sesion Cerrada con exito#");
                    stack.logout(nombre);
                    n2=false;
                    break;
                
                case 7:
                    System.out.println("!!El Programa ha Finalizado!!");
                    salir=true;
                    n2=false;
                    break;
                    default:
                    System.out.println("#Opcion No Valida#\n");
                    break;
            }
        }  
    } 
 
    }
    
    public static void menuInicio(){
        System.out.println("1.Registrarse");
        System.out.println("2.Login");
        System.out.println("3.Salir del Programa "); 
        System.out.println("Ingrese una opcion: ");
    }
   
    public static void menuStack(){
       System.out.println("1.Agregar nueva pregunta");
       System.out.println("2.Responder pregunta ");
       System.out.println("3.Dar recompensa");
       System.out.println("4.Aceptar respuesta");
       System.out.println("5.Votar");
       System.out.println("6.Cerrar sesion");
       System.out.println("7.Salir del programa");
       System.out.println("Ingrese una opcion: ");
    }
}