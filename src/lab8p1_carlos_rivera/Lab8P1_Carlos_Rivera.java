/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_carlos_rivera;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Lab8P1_Carlos_Rivera {

    static Scanner e = new Scanner(System.in);
    static Random random = new Random();

    public static int[] llenar(int arreglos) {
        int[] C = new int[arreglos];
        for (int i = 0; i < arreglos; i++) {
            System.out.print(" ELEMENTO [" + i + "]:");
            C[i] = e.nextInt();

        }
        return C;
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("|||MENU|||");
            System.out.println("1. CONJUNTOS ");
            System.out.println("2. SUPERMERCADO ");
            System.out.println("3. SALIR ");
            System.out.println(" INGRESE UNA OPCION: ");
            opcion = e.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("|||MENU|||");
                    System.out.println("1. UNION");
                    System.out.println("2. INTERSECCION");
                    System.out.println("3. DIFERENCIA A - B");
                    System.out.println("4. DIFERENCIA B B - A");
                    System.out.println("5. SUBCONJUNTO A C B ");
                    System.out.println("6. SALIR");
                    int o = e.nextInt();
                    switch (o) {
                        case 1:
                            
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;

                    }

                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println(" OPCION INVALIDA ");
            }
        } while (opcion != 3);

    }

}
