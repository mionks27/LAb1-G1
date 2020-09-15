package pe.pucp.edu.telecom.main;

import pe.pucp.edu.telecom.entity.*;
import pe.pucp.edu.telecom.manager.DirectorioTelefonico;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Usuario> list = new ArrayList<>();
        DirectorioTelefonico directorioTelefonico = new DirectorioTelefonico();
        directorioTelefonico.setListaUsuarios(list);
        Scanner sc = new Scanner(System.in);
        inicio:
        while (true){

            System.out.println("1. Leer Datos");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Escribir Directorio");
            System.out.print("Elige una opción: ");
            String opc = sc.nextLine();

            if(!opc.equalsIgnoreCase("1") ||!opc.equalsIgnoreCase("2") || !opc.equalsIgnoreCase("3") || !opc.equalsIgnoreCase("4") ){
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

                           String[] parametros = line.split(",");

                           if(parametros[0].equalsIgnoreCase("Docente")){
                               Docente docente = new Docente();
                               docente.setCodigo(parametros[1]);
                               docente.setNombre(parametros[2]);
                               docente.setApellido(parametros[3]);
                               docente.setTelefono(parametros[4]);
                               docente.setAnexo(parametros[5]);
                               docente.setDepartamento(parametros[6]);
                               docente.setAñoDeInicio(parametros[7]);
                               docente.setCantidadCursos(parametros[8]);

                               directorioTelefonico.getListaUsuarios().add(docente);
                           }else if(parametros[0].equalsIgnoreCase("pa")){
                               PersonalAdministrativo pa = new PersonalAdministrativo();
                               pa.setCodigo(parametros[1]);
                               pa.setNombre(parametros[2]);
                               pa.setApellido(parametros[3]);
                               pa.setTelefono(parametros[4]);
                               pa.setAnexo(parametros[5]);
                               pa.setDepartamento(parametros[6]);
                               pa.setCargo(parametros[7]);
                               directorioTelefonico.getListaUsuarios().add(pa);
                            }else if(parametros[0].equalsIgnoreCase("jp")){
                               Jp jp = new Jp();
                               jp.setCodigo(parametros[1]);
                               jp.setNombre(parametros[2]);
                               jp.setApellido(parametros[3]);
                               jp.setTelefono(parametros[4]);
                               jp.setAnexo(parametros[5]);
                               jp.setDepartamento(parametros[6]);
                               jp.setAñoDeEgreso(parametros[7]);
                               directorioTelefonico.getListaUsuarios().add(jp);
                           }else if(parametros[0].equalsIgnoreCase("profesor")){
                               Profesor pro = new Profesor();
                               pro.setCodigo(parametros[1]);
                               pro.setNombre(parametros[2]);
                               pro.setApellido(parametros[3]);
                               pro.setTelefono(parametros[4]);
                               pro.setAnexo(parametros[5]);
                               pro.setDepartamento(parametros[6]);
                               pro.setFacultad(parametros[7]);
                               directorioTelefonico.getListaUsuarios().add(pro);
                           }else if(parametros[0].equalsIgnoreCase("instructor")){
                               Instructor in = new Instructor();
                               in.setCodigo(parametros[1]);
                               in.setNombre(parametros[2]);
                               in.setApellido(parametros[3]);
                               in.setTelefono(parametros[4]);
                               in.setAnexo(parametros[5]);
                               in.setDepartamento(parametros[6]);
                               in.setCicloActual(parametros[7]);
                               directorioTelefonico.getListaUsuarios().add(in);
                           }else{
                               System.out.println( " Usuario no válido");
                           }


                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case "2":
                    directorioTelefonico.agregar();
                    break;
                case "3":
                    System.out.print("ingrese el nombre");
                    String nombre = sc.nextLine();
                    System.out.print("ingrese el apellido");
                    String apelli = sc.nextLine();
                    break;
                case "4":
                    try {
                        FileWriter writer = new FileWriter("DirectorioTelefonico.csv");
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);

                        int index = 0;
                        for (Usuario u : directorioTelefonico.getListaUsuarios()) {
                                if(u instanceof Docente){
                                    Docente doc = (Docente) u;
                                    bufferedWriter.write( "Docente" +"," + doc.getNombre() + "," + doc.getApellido()+ "," + doc.getTelefono()+ ","+ doc.getAnexo()+ ","+ doc.getDepartamento()+ "," + doc.getAñoDeInicio()+ "," + doc.getCantidadCursos() );
                                    if (++index < directorioTelefonico.getListaUsuarios().size()) bufferedWriter.newLine();
                                } else if (u instanceof Jp){
                                    Jp jp = (Jp) u;
                                    bufferedWriter.write( "JP" +"," + jp.getNombre() + "," + jp.getApellido()+ "," + jp.getTelefono()+ ","+ jp.getAnexo()+ ","+ jp.getDepartamento()+ "," + jp.getAñoDeEgreso() );
                                    if (++index < directorioTelefonico.getListaUsuarios().size()) bufferedWriter.newLine();
                                }else if (u instanceof Instructor){
                                    Instructor in = (Instructor) u;
                                    bufferedWriter.write( "Instructor" +"," + in.getNombre() + "," + in.getApellido()+ "," + in.getTelefono()+ ","+ in.getAnexo()+ ","+ in.getDepartamento()+ "," + in.getCicloActual() );
                                    if (++index < directorioTelefonico.getListaUsuarios().size()) bufferedWriter.newLine();
                                }else if (u instanceof PersonalAdministrativo){
                                    PersonalAdministrativo pa = (PersonalAdministrativo) u;
                                    bufferedWriter.write( "PA" +"," + pa.getNombre() + "," + pa.getApellido()+ "," + pa.getTelefono()+ ","+ pa.getAnexo()+ ","+ pa.getDepartamento()+ "," + pa.getCargo());
                                    if (++index < directorioTelefonico.getListaUsuarios().size()) bufferedWriter.newLine();
                                }else if (u instanceof Profesor){
                                    Profesor pro = (Profesor) u;
                                    bufferedWriter.write( "Profesor" +"," + pro.getNombre() + "," + pro.getApellido()+ "," + pro.getTelefono()+ ","+ pro.getAnexo()+ ","+ pro.getDepartamento()+ "," + pro.getFacultad() );
                                    if (++index < directorioTelefonico.getListaUsuarios().size()) bufferedWriter.newLine();
                                }

                        }

                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                default:
                    break;
            }


        }

    }
}
