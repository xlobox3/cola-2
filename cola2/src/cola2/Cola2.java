
package cola2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Cola2{
  
 int MAX;
     String[] cola;
     int FRENTE;
     int FIN;
Scanner lector=new Scanner(System.in);
    
    public Cola2(int MAX){
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FIN = 0;  
        this.cola = new String[this.MAX+1];
    }  
    public boolean ColaLlena()
    {
        if(this.FIN == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void InsertarCola(){
        
        System.out.println("ingresa un nombre:");
        String NOMBRE=lector.nextLine();
                if(this.ColaLlena()){
            System.out.println("¡la cola esta llena!");
        }
        if(NOMBRE.length() <4 || NOMBRE.length()>6){
            System.out.println("el nombre excede los caracteres validos");
        }
        else{
            System.out.println("nombre valido");
            this.cola[FIN]=NOMBRE;
            this.FIN++;
        }
    }
    public void EliminarCola(){
        {
        System.out.println("\n\n  ELIMINAR DATO ");
           if(FRENTE==-1) {
               System.out.println("Cola vacia !!!");
               return;
           }
           System.out.println("Dato eliminado = "+cola[FRENTE]);
           if(FRENTE==FIN) {
               FRENTE=-1; FIN=-1;
               return;
           }
           if(FRENTE==MAX) FRENTE=0; else FRENTE++;
       }
    }
public void MostrarCola(){
    int i=0;
            System.out.println("\n\n MOSTRAR COLA  ");
            if(FRENTE==-1) {
                System.out.println("\n Cola vacia !");
            }
            else{
                i=FRENTE;
                do{
                    System.out.println("posicion de cola["+i+"]=" +cola[i]);
                   i++;
                    if(i==MAX && FRENTE>FIN); 
               }
                while(i!=FIN+1);
           }
           System.out.println("frente="+FRENTE);
           System.out.println("fin="+FIN);
           System.out.println("max="+MAX);
       }   
  public  static  Cola2 Cola;
    public static void main(String[] args) {
         System.out.println("Bienvenido a la cola de XLOBOX3");
         int MAX;

        MAX = (int) Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESE EL TAMAÑO DE LA COLA"));   
     Cola = new Cola2(MAX);
        MenudeCola();
    }
    public static void MenudeCola()
    {   
        int opcion;
       do{
            
            System.out.println("1.- Ingresa el nombre");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Mostrar");
            System.out.println("4.- Salir \n");
            Scanner lector=new Scanner(System.in);
            opcion = lector.nextInt();
            switch(opcion){
                case 1: 
                    Cola.InsertarCola();
                break;
                case 2: 
                    Cola.EliminarCola();
                break;
                case 3: 
                    Cola.MostrarCola();
                break;
                case 4: 
                    System.exit(0);
                break;
                default: 
                    System.out.println("ingresa una opcion valida");
            }
        }
        while(opcion !=4); 
    }   
}
