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
public class EstructurasBasicas {

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
        
       
        
        /** MENSAJE FINAL 
         * 
        mensaje_final = String.format("%s%s",mensaje_final,"Informe de la"
                + " ciudad de Loja\n\n");
                
        mensaje_final = String.format("%s%s",mensaje_final,+
        * " ciudad de Loja\n\n","Listado "
                + "de Personas\n\n");
        */
        
        /**
        mensaje_final = String.format("%s%s%s",mensaje_final,"Informe de la"
                + " ciudad de Loja\n\n","Listado "
                + "de Personas\n\n");
        
        // CICLO REPETITIVO 1
        
        while (contador < 5){
            
            System.out.printf("Persona %d: %s %s - %s\n",contador
                    , nombre, apellido, profesion);
            contador = contador + 1;
        }
        
        */
        
        contador =1;
        
        // CICLO REPETITIVO 2
        
                while (contador < 5){ 
                    
            System.out.println("Ingrese sus nombres");
            nombre = entrada.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión");
            profesion = entrada.nextLine();
            
            
           mensaje_final = String.format("\n%sPersona %d: %s %s - %s\n"
                   , mensaje_final, contador, nombre, apellido, profesion);
            contador = contador + 1;
        }
                System.out.printf("%s",mensaje_final);
    }
    
}
