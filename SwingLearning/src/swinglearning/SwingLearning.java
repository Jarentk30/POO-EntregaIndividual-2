
package swinglearning;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class SwingLearning {
    public static void main(String[] args){
        Scanner Entrada = new Scanner(System.in);
        List<Integer> Lista = Arrays.asList(10,19,22,23,40,41,7,18);
        System.out.println(Lista);
        System.out.println("Por favor escoja el ejercicio que desea visualizar de la lista previamente mostrada");
        int Opcion = Integer.parseInt(Entrada.nextLine());
        if(Opcion == 18){
                Ventana Ejercicio18 = new Ventana();
                Ejercicio18.setVisible(true);
        }else if(Opcion == 19){
                Ej19 Ejercicio19 = new Ej19();
                Ejercicio19.setVisible(true); 
        }else if(Opcion ==10){
            Ej10 Ejercicio10 = new Ej10();
            Ejercicio10.setVisible(true);
        }else if(Opcion == 7){
            Ej7 Ejercicio7 = new Ej7();
            Ejercicio7.setVisible(true);
        }else if(Opcion == 22){
            Ej22 Ejercicio22 = new Ej22();
            Ejercicio22.setVisible(true);
        }else if(Opcion == 23){
            Ej23 Ejercicio23 = new Ej23();
            Ejercicio23.setVisible(true);        
        }else if(Opcion ==40){
            Ej40 Ejercicio40 = new Ej40();
            Ejercicio40.setVisible(true);
        }else if(Opcion ==41){
            Ej41 Ejercicio41 = new Ej41();
            Ejercicio41.setVisible(true);
        }
    
 



 


    
    }  
    
}
