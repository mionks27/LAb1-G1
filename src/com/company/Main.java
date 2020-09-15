package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("1. Leer Datos");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Escribir Directorio");
            System.out.print("Elige una opción: ");
            String opc = sc.nextLine();

            switch (opc){
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    break;
            }


        }

    }
}
