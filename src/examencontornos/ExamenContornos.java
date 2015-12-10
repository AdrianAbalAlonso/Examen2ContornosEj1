/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examencontornos;

import java.util.Scanner;

/**
 *
 * @author aabalalonso
 */
public class ExamenContornos {

    /**
     * @param args the command line arguments
     */
//Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean SiEsPrimo = false;

    public static void main(String[] args) {
        {
            int dig = 3;
            int numDigitos = 0;
            numDigitos = pedirPorPantalla(); //llamo al metodo que me pide por 

            for (int numeroDivisores = 1; numeroDivisores <= 99999; numeroDivisores++) {
                int aux = numeroDivisores;

                int contador = 0;

                while (aux != 0) {
                    aux = aux / 10;
                    contador++;
                }
                numDigitos = contador;

                if (numDigitos == dig) {
                    if (numeroDivisores < 4) {
                        SiEsPrimo = true;
                    } else {
                        if (numeroDivisores % 2 == 0) {
                            SiEsPrimo = false;
                        } else {
                            int cuentaDivisores = 0;
                            int i1 = 1;
                            int finalDigitos = (numeroDivisores - 1) / 2;
                            if (finalDigitos % 2 == 0) {
                                finalDigitos--;
                            }

                            while (i1 <= finalDigitos) {
                                if (numeroDivisores % i1 == 0) {
                                    cuentaDivisores++;
                                }
                                i1 += 2;
                                if (cuentaDivisores == 2) {
                                    i1 = finalDigitos + 1;
                                }
                            }

                            if (cuentaDivisores == 1) {
                                SiEsPrimo = true;
                            }
                        }
                    }

                    if (SiEsPrimo == true) {
                        System.out.println(numeroDivisores);
                    }
                }
            }
        }

    }

    public static int pedirPorPantalla() {
        Scanner obx = new Scanner(System.in);
        System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        int numDigitos = obx.nextInt();
        while (numDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            numDigitos = obx.nextInt();
        }
        return numDigitos;
    }
}
