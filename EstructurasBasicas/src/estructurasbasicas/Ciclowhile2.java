/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;
import java.util.Scanner;
/**
 *
 * @author juanyanza11
 */
public class Ciclowhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        String mensaje_final = "";
        String nombre = "";
        String apellido = "";
        String profesion = "";
        int contador = 1;
        boolean bandera = true;
        String opcion;
       

        
        // CICLO REPETITIVO 2
        
                while (bandera == true){ 
                    
            System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión");
            profesion = entrada.nextLine();
            
            
           mensaje_final = String.format("\n%sPersona %d: %s %s - %s\n"
                   , mensaje_final, contador, nombre, apellido, profesion);
           
            contador = contador + 1;
            
            System.out.println("Digite (s) para seguir o (n) para salir");
            opcion = entrada.nextLine();
            
            if (opcion.equals("s")){
                bandera = true;
            
            }else{
                bandera = false;
            }
            
        }
                System.out.printf("%s",mensaje_final);
                
    }
    
}
