/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto07;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Proyecto07 {
  
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        int dias;
        double costo_dia;
        double valor_cancelar;
        int contador = 1;

        String mensaje_final = "";

        while (contador <= 5) {

            System.out.println("Ingrese nombre de empleado");
            nombre = entrada.nextLine();    

            System.out.println("Ingrese días trabajados");
            dias = entrada.nextInt();    

            System.out.println("Ingrese valor de costo día");
            costo_dia = entrada.nextDouble(); 
            entrada.nextLine();

            valor_cancelar = dias * costo_dia;
            
            mensaje_final = String.format("%sNombre %s: dias %d , "
                    + "costo por dia $%.2f, total $%.2f\n"
                    ,mensaje_final, nombre, valor_cancelar);
          
          
            contador = contador + 1;
        }

        System.out.println("\n REPORTE FINAL ");
        System.out.println(mensaje_final);
    }
}

    


    
    

