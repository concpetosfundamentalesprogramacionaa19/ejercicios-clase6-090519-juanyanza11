/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/** DESARROLLAR UNA APLICACIÓN QUE ME PERMITA INGRESAR PLACAS DE CARROS
 *  SE ASUME QUE LAS PLACAS INGRESADAS PERTENECEN A LA REGION COSTA DEL ECUADOR
 *  EN BASE A LA PLACA NUESTRO PROGRAMA DETERMINARÁ Y PRESENTARÁ LA PLACA CON LA
 * PROVINCIA A LA QUE PERTENECE
 * oro O
 * guayas G
 * esmeraldas E
 * manabí M
 * Los rios R
 * Santa elena Y
 * Santo Domingo J
 * 
 */
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su número de placas");
        String placa = entrada.nextLine();
        
        char valor = placa.charAt(0);
                
        switch(valor){
            case 'g':
            case'G':
                System.out.printf("Su placa %s pertenece a la provincia Guayas"
                        + " (%s)\n",placa,valor);
                break;
            
            case 'o':
            case 'O':
                System.out.printf("Su placa %s pertenece a la provincia El Oro"
                        + " (%s)\n",placa,valor);
                break;    
            case 'E':
            case 'e':
                System.out.printf("Su placa %s pertenece a la provincia Esmeraldas"
                        + " (%s)\n",placa,valor);
                break;
                
            case 'M':
            case 'm':
                System.out.printf("Su placa %s pertenece a la provincia Manabí"
                        + " (%s)\n",placa,valor);
                break;
            case 'R':
            case 'r':
                System.out.printf("Su placa %s pertenece a la provincia Los Rios"
                        + " (%s)\n",placa,valor);
                break;
            case 'Y':
            case 'y':
                System.out.printf("Su placa %s pertenece a la provincia Santa Elena"
                        + " (%s)\n",placa,valor);
                break;
            case 'J':
            case 'j':
                System.out.printf("Su placa %s pertenece a la provincia Manabí"
                        + " (%s)\n",placa,valor);         
                break;
                
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
