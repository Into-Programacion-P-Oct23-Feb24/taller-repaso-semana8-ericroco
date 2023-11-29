/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.*;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double multiplicando;
        int multiplicador;
        double contador = 0;
        double resultado;
        double extra = 0;

        System.out.println("Ingrese su multiplicando");
        multiplicando = entrada.nextDouble();
        System.out.println("Ingrese su multiplicador");
        multiplicador = entrada.nextInt();
        while (multiplicador > 1) {
            if (multiplicador % 2 == 1) {
                extra = multiplicando;
                extra = extra * (Math.pow(2,contador));
            }
            contador = contador +1;
            multiplicador = multiplicador / 2;
        }
        multiplicando = multiplicando * (Math.pow(2,contador));
        resultado = multiplicando + extra;
        System.out.println(resultado);
    }
}
