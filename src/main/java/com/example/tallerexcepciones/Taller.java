package com.example.tallerexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Taller de excepciones
 * Autor: Isabella Bermúdez, Julieta Arteta y Angie Quenan
 * Curso: Fundamentos de programación orientado a eventos.
 */

public class Taller {

    public void Taller() {
    }

    /**
     * Ejercicio 1 - Detectando una excepción no controlada
     * ¿Que tipo de excepción se lanza?
     * R/ Se lanza una excepción de tipo ArithmeticException
     * ¿Qué mensaje muestra la consola?
     *
     * R/  Exception in thread "main" java.lang.ArithmeticException: / by zero
     * 	at org.example.tallerexcepciones/org.example.tallerexcepciones.TestDivision.main(TestDivision.java:8)

     Código del ejercicio 1:

     public class TestDivision {
     public static void main(String[] args) {
     int a = 10;
     int b = 0;
     System.out.println("Resultado: " + (a / b));
     }
     }
     */

    /**
     * Ejercicio 2 - Manejando la excepción con try-catch
     */

    // 1. Reescribe el código anterior utilizando try-catch

    public  void TestDivision() {
        int a = 10;
        int b = 0;

        try {
            System.out.println("Resultado: " + (a / b));
        } catch (ArithmeticException e) {
            String msg = e.getMessage();
            // Mostrando un mensaje personalizado cuando ocurre la excepción
            System.out.println("Ha ocurrido el sgt error: " + msg);
        }
        System.out.println("Final del programa");
    }

    // Ejercicio 3
    public  void ejercicio3() {
        Scanner entrada = new Scanner(System.in);
        int a, b;


        try{
            // Solicitando dos números por consola
            System.out.println("Digite el primer número: ");
            a = entrada.nextInt();
            System.out.println("Digite el segundo número: ");
            b = entrada.nextInt();
            System.out.println("Resultado: " + (a / b));
        } catch (InputMismatchException o) {

            String msg = o.getMessage();
            System.out.println("Debe de digitar un número.");
        }

        catch (ArithmeticException e) {
            String msg = e.getMessage();
            // Mostrando un mensaje personalizado cuando ocurre la excepción
            System.out.println("Ha ocurrido el sgt error: " + msg);
        }
        System.out.println("Final del programa");
    }

    //ejercicio 4

    public static void ejercicio4() {

        Scanner entrada = new Scanner(System.in);
        int a, b;
        try {
            // Solicitando dos números por consola
            System.out.println("Digite el primer número: ");
            a = entrada.nextInt();
            System.out.println("Digite el segundo número: ");
            b = entrada.nextInt();
            System.out.println("Resultado: " + (a / b));
        } catch (InputMismatchException o) {
            String msg = o.getMessage();
            System.out.println("Debe de digitar un número.");
        } catch (ArithmeticException e) {
            String msg = e.getMessage();
            // Mostrando un mensaje personalizado cuando ocurre la excepción
            System.out.println("Ha ocurrido el sgt error: " + msg);
        } finally {
            System.out.println("Operación finalizada");
        }
    }
}





