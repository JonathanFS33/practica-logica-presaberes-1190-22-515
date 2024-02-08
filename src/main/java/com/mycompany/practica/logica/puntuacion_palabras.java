package com.mycompany.practica.logica;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class puntuacion_palabras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int puntaje = 0;
        
        System.out.print("Ingrese la palabra a puntuar: ");
        String palabra = scan.nextLine();
        
        palabra = palabra.toUpperCase();
        String[] arreglo = palabra.split("");
        
        for(String letra: arreglo){
            switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                case "L":
                case "N":
                case "R":
                case "S":
                case "T":
                    puntaje += 1;
                    System.out.println(letra + " = 1");
                    break;
                case "D":
                case "G":
                    puntaje += 2;
                    System.out.println(letra + " = 2");
                    break;
                case "B":
                case "C":
                case "M":
                case "P":
                    puntaje += 3;
                    System.out.println(letra + " = 3");
                    break;
                case "F":
                case "H":
                case "V":
                case "W":
                case "Y":
                    puntaje += 4;
                    System.out.println(letra + " = 4");
                    break;
                case "K":
                    puntaje += 5;
                    System.out.println(letra + " = 5");
                    break;
                case "J":
                case "X":
                    puntaje += 8;
                    System.out.println(letra + " = 8");
                    break;
                case "Q":
                case "Z":
                    puntaje += 10;
                    System.out.println(letra + " = 10");
                    break;
                default:
                    break;
            }
        }
        System.out.println("La puntuación de la palabra " +palabra+ " es: " + puntaje);
    }
    
}
