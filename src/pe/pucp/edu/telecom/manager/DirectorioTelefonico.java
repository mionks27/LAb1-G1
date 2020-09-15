package pe.pucp.edu.telecom.manager;

import pe.pucp.edu.telecom.entity.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DirectorioTelefonico {

    private ArrayList<Usuario> listaUsuarios;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;

    }
        Scanner sc = new Scanner(System.in);
    public void agregar() {

        boolean tt = true;
        while (tt) {
            System.out.println("TIPOS DE USUARIOS");
            System.out.println("1. Docente");
            System.out.println("2. Personal Administrativo");

            System.out.print("Ingrese el tipo de usuario que desea agregar : ");
            String usuarioTipo = sc.nextLine();

            if (usuarioTipo.equalsIgnoreCase("1") || usuarioTipo.equalsIgnoreCase("2")) {


                if (usuarioTipo.equalsIgnoreCase("1")) {
                    ///docente
                    boolean pp = true;
                    while (pp) {
                        System.out.println("TIPOS DE DOCENTES");
                        System.out.println("1. Instructor");
                        System.out.println("2. Jefe de Practica");
                        System.out.println("3. Profesor");

                        System.out.print("Ingrese el tipo de docente que desea agregar : ");
                        String docenteTipo = sc.nextLine();
                        if (docenteTipo.equalsIgnoreCase("1") || docenteTipo.equalsIgnoreCase("2") || docenteTipo.equalsIgnoreCase("3")) {

                            if (docenteTipo.equalsIgnoreCase("1")) {
                                //instructor
                                Instructor instructor = new Instructor();
                                System.out.print("Ingrese el codigo :");
                                String codigo = sc.nextLine();
                                System.out.print("Ingrese el nombre");
                                String nombre = sc.nextLine();
                                System.out.print("Ingrese el apellido");
                                String apellido = sc.nextLine();
                                System.out.print("Ingrese el telefono");
                                String telefono = sc.nextLine();
                                System.out.print("Ingrese el anexo");
                                String anexo = sc.nextLine();
                                System.out.print("Ingrese el departamento");
                                String departamento = sc.nextLine();
                                System.out.print("Ingrese el añoDeInicio");
                                String añoDeInicio = sc.nextLine();
                                System.out.print("Ingrese el cantidadCursos");
                                String cantidadCursos = sc.nextLine();

                                System.out.print("Ingrese el cicloActual");
                                String cicloActual = sc.nextLine();

                                instructor.setNombre(nombre);
                                instructor.setApellido(apellido);
                                instructor.setCodigo(codigo);
                                instructor.setTelefono(telefono);
                                instructor.setAnexo(anexo);
                                instructor.setDepartamento(departamento);


                            } else if (docenteTipo.equalsIgnoreCase("2")) {
                                Jp jp = new Jp();
                                Instructor instructor = new Instructor();
                                System.out.print("Ingrese el codigo :");
                                String codigo = sc.nextLine();
                                System.out.print("Ingrese el nombre");
                                String nombre = sc.nextLine();
                                System.out.print("Ingrese el apellido");
                                String apellido = sc.nextLine();
                                System.out.print("Ingrese el telefono");
                                String telefono = sc.nextLine();
                                System.out.print("Ingrese el anexo");
                                String anexo = sc.nextLine();
                                System.out.print("Ingrese el departamento");
                                String departamento = sc.nextLine();
                                System.out.print("Ingrese el añoDeInicio");
                                String añoDeInicio = sc.nextLine();
                                System.out.print("Ingrese el cantidadCursos");
                                String cantidadCursos = sc.nextLine();

                                System.out.print("Ingrese el anho egreso");
                                String egreso = sc.nextLine();

                            } else if (docenteTipo.equalsIgnoreCase("3")) {
                                Profesor profesor = new Profesor();
                                Instructor instructor = new Instructor();
                                System.out.print("Ingrese el codigo :");
                                String codigo = sc.nextLine();
                                System.out.print("Ingrese el nombre");
                                String nombre = sc.nextLine();
                                System.out.print("Ingrese el apellido");
                                String apellido = sc.nextLine();
                                System.out.print("Ingrese el telefono");
                                String telefono = sc.nextLine();
                                System.out.print("Ingrese el anexo");
                                String anexo = sc.nextLine();
                                System.out.print("Ingrese el departamento");
                                String departamento = sc.nextLine();
                                System.out.print("Ingrese el añoDeInicio");
                                String añoDeInicio = sc.nextLine();
                                System.out.print("Ingrese el cantidadCursos");
                                String cantidadCursos = sc.nextLine();


                                System.out.print("Ingrese el facultad");
                                String facultad = sc.nextLine();

                            }
                        } else {
                            System.out.println("Opción errónea");
                            System.out.println(" ");

                        }
                    }

                } else if (usuarioTipo.equalsIgnoreCase("2")) {
                    ///personal administrativo
                    PersonalAdministrativo personalAdministrativo = new PersonalAdministrativo();
                    Instructor instructor = new Instructor();
                    System.out.print("Ingrese el codigo :");
                    String codigo = sc.nextLine();
                    System.out.print("Ingrese el nombre");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el apellido");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese el telefono");
                    String telefono = sc.nextLine();
                    System.out.print("Ingrese el anexo");
                    String anexo = sc.nextLine();
                    System.out.print("Ingrese el departamento");
                    String departamento = sc.nextLine();
                    System.out.print("Ingrese el cargo");
                    String cargo = sc.nextLine();

                    personalAdministrativo.setNombre(nombre);
                    personalAdministrativo.setApellido(apellido);
                    personalAdministrativo.setCodigo(codigo);
                    personalAdministrativo.setTelefono(telefono);
                    personalAdministrativo.setAnexo(anexo);
                    personalAdministrativo.setDepartamento(departamento);
                    personalAdministrativo.setCargo(cargo);


                }


            } else {
                System.out.println("Opción errónea");
                System.out.println(" ");
            }


        }


    }

}
