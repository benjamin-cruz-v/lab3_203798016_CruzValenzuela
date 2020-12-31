
package Lab3_20379801_Cruz;

public class Main {

    
    public static void main(String[] args) {
       
     ListaUsuario listaUsuario= new ListaUsuario();
    ListaPregunta listaPregunta= new ListaPregunta();
    ListaRespuesta listaRespuesta= new ListaRespuesta();
    
    
    Stack stack=new Stack(listaUsuario,listaPregunta,listaRespuesta);
    
   
    
    System.out.println("### STACKORVERFLOW  ### ");   
    boolean salir =false;
    Scanner Entrada=new Scanner(System.in); 
    Scanner Entrada2=new Scanner(System.in);
    
    while(!salir){
    boolean n=true;
    boolean n2=true;
    
        while(n==true){
            System.out.println("1.Registrarse");
            System.out.println("2.Login");
            System.out.println("3.Salir del Programa "); 
            System.out.println("Ingrese una opcion: ");
            int num2 =Entrada2.nextInt();
            switch(num2){
                case 1:
                    System.out.println("Ingrese nuevo Usuario");
                    Scanner name=new Scanner(System.in);
                    String nombre=name.nextLine();
                    System.out.println("Ingrese nueva contraseña");
                    Scanner contraseña=new Scanner(System.in);
                    int pass =contraseña.nextInt();
                    
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
                    int pass2 =contraseña2.nextInt();
                    if(stack.login(nombre2, pass2)==true){
                        System.out.println("#Sesion Iniciada#");
                        n=false;
                        break;
                    }
                    else{
                        System.out.println("#Contraseña Incorrecta#");       
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
            System.out.println("1.Agregar nueva pregunta");
            System.out.println("2.Responder pregunta ");
            System.out.println("3.Dar recompensa");
            System.out.println("4.Aceptar respuesta");
            System.out.println("5.Cerrar sesion");
            System.out.println("6.Salir del programa");
            System.out.println("Introdusca la opcion: ");
            System.out.println("Ingrese una opcion: ");
            int num =Entrada.nextInt();
            switch(num){
                case 1:
                    System.out.println("Ingrese Titulo");
                    Scanner entradatitulo=new Scanner(System.in);
                    String titulo=entradatitulo.nextLine();
                    
                    System.out.println("Ingrese Contenido");
                    Scanner entradaContenido=new Scanner(System.in);
                    String contenido=entradaContenido.nextLine();
                 
                    stack.ask(titulo,contenido);
                    stack.mostrarP();
                    break;
                    
                case 2:
                    System.out.println("Ingrese la Respuesta");
                    Scanner textoRespuesta=new Scanner(System.in);
                    String respuesta=textoRespuesta.nextLine();
                    stack.answer(respuesta,0,1,"ww");
                    stack.mostrarR(1);
                    break;
                case 3:
                    System.out.println("opcion 3");
                    stack.getListaUsuario().mostrarUsuario();
                case 4:
                    System.out.println("opcion 4");    
                    
                case 5:
                    System.out.println("opcion 5");
                    stack.logout(nombre);
                    n2=false;
                    break;
                
                case 6:
                    System.out.println("El Programa ha Finalizado");
                    salir=true;
                    n2=false;
                    break;
                    default:
                    System.out.println("Opcion No Valida\n");
                    break;
            }
                
        
        }
        } 
    
    
    
    
    }
}
        