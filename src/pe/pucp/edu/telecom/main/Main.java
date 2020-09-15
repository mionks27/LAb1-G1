package pe.pucp.edu.telecom.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        inicio:
        while (true){

            System.out.println("1. Leer Datos");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Escribir Directorio");
            System.out.print("Elige una opción: ");
            String opc = sc.nextLine();

            if(opc.equalsIgnoreCase("1") ||opc.equalsIgnoreCase("2") || !opc.equalsIgnoreCase("3") || opc.equalsIgnoreCase("4") ){
                System.out.println("Opción errónea");
                System.out.println(" ");
            }


            switch (opc){
                case "1":
                    try {
                        FileReader fileReader = new FileReader("Directorio.csv");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);

                        String line = "";

                        while((line = bufferedReader.readLine()) != null){
                            System.out.println(line);
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

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
