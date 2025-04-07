/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1_ejercicio5;
import java.util.Scanner;
/**
 *
 * @author GLORIA PAULINA MORENO SALDIVAR
 */
public class Act1_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        int NumEst;
        
        System.out.println("Ingrese el numero de la estacion: ");
        NumEst = asignar.nextInt();
        
        switch (NumEst)
        {
            case 1:
                System.out.println("EL MES ES ENERO");
                break;
            case 2:
                System.out.println("EL MES ES FEBRERO");
                break;
            case 3:
                System.out.println("EL MES ES MARZO");
                break;
            case 4:
                System.out.println("EL MES ES ABRIL");
                break;
            case 5:
                System.out.println("EL MES ES MAYO");
                break;
            case 6:
                System.out.println("EL MES ES JUNIO");
                break;
            case 7:
                System.out.println("EL MES ES JULIO");
                break;
            case 8:
                System.out.println("EL MES ES AGOSTO");
                break;
            case 9:
                System.out.println("EL MES ES SEPTIEMBRE");
                break;
            case 10:
                System.out.println("EL MES ES OCTUBRE");
                break;
            case 11:
                System.out.println("EL MES ES NOVIEMBRE");
                break;
            case 12:
                System.out.println("EL MES ES DICIEMBRE");
                break;
        }
    }
    
}
