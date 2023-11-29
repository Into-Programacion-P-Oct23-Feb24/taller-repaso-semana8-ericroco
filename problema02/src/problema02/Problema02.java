/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.*;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int valor;

        System.out.println("Ingrese un valor que sea positivo y par");
        valor = entrada.nextInt();

        if (valor > 0 && valor % 2 == 0) {
            for (int num = 1; num <= valor; num++) {
                System.out.println(num);
            }
        } else {
            System.out.println("El numero ingresado debe ser positivo y par");
        }
    }
}
