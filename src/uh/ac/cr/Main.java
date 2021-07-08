package uh.ac.cr;
//Andres Chaves Soley, Ricardo Arias Segnini
import uh.ac.cr.Author;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        AuthorManager administradorAutor = new AuthorManager();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        int Option;
        int Option1;
        while (!exit) {
            System.out.println("\n---------------------------------------------------------------------\n");

            System.out.println("1 = Administrar catalogos de datos.");
            System.out.println("2 = Solicitar nuevo prestamo.");
            System.out.println("3 = Ver todos los prestamos solicitados por un usuario.");
            System.out.println("4 = Consultar todos los perstamos realizados de un libro");
            System.out.println("5 = Salir del sistema.");

            Option = scanner.nextInt();
            switch (Option) {
                case 1:
                    System.out.println("\n---------------------------------------------------------------------\n");
                    //System.out.println("Option selected: " + Option);
                    int AutorId;
                    System.out.println("\nCatàlogo de autor.");
                    System.out.println("1-Ingresar un nuevo autor.");
                    System.out.println("2-Consultar datos de un autor.");
                    System.out.println("3-Actualizar datos de un autor.");
                    System.out.println("4-Eliminar un autor.");

                    Option1=scanner.nextInt();
                    switch (Option1) {
                        case 1:
                            System.out.println("Create a new autor.");
                            System.out.println("Insert the identification of the autor.");
                            AutorId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Insert the name of the autor.");
                            String nombreAutor = scanner.nextLine();
                            System.out.println("Inserte el primer apellido del autor.");
                            String primerApellidoAutor = scanner.nextLine();

                            System.out.println("Inserte el segundo apellido del autor.");
                            String segundoApellidoAutor = scanner.nextLine();
                            //scanner.nextLine();

                            System.out.println("Inserte fecha de nacimiento del Autor.");
                            String fechaDeNacimiento = scanner.nextLine();

                            boolean autorcreado = administradorAutor.AuthorCreate(AutorId, nombreAutor, primerApellidoAutor, segundoApellidoAutor, fechaDeNacimiento);
                            if (autorcreado) {
                                System.out.println("\nNew Autor created with Id: " + AutorId);
                            } else {
                                System.out.println("\nWe cannot create the patient since there is other Autor" +
                                        " with the specified id: " + AutorId);
                            }
                            break;
                        case 2:
                            //Get data from a specific Autor.
                            System.out.println("Insert the identification of the autor.");
                            AutorId = scanner.nextInt();
                            scanner.nextLine();
                            Author autor = administradorAutor.FindAutor(AutorId);
                            System.out.println(autor.toString());
                            break;

                        case 3:
                            //Update data related to a specific patient.
                            System.out.println("update a new autor.");
                            System.out.println("Insert the identification of the autor.");
                            AutorId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Insert the name of the autor.");
                            String nombreAutor1 = scanner.nextLine();
                            System.out.println("Inserte el primer apellido del autor.");
                            String primerApellidoAutor1 = scanner.nextLine();

                            System.out.println("Inserte el segundo apellido del autor.");
                            String segundoApellidoAutor1 = scanner.nextLine();
                            //scanner.nextLine();

                            System.out.println("Inserte fecha de nacimiento del Autor.");
                            String fechaDeNacimiento1 = scanner.nextLine();

                            boolean Autorupdate = administradorAutor.AuthorCreate(AutorId, nombreAutor1, primerApellidoAutor1, segundoApellidoAutor1, fechaDeNacimiento1);
                            if (Autorupdate) {
                                System.out.println("\nNew Autor created with Id: " + AutorId);
                            } else {
                                System.out.println("\nWe cannot create the patient since there is other Autor" +
                                        " with the specified id: " + AutorId);
                            }
                            break;




                    }
                    break;


                    System.out.println("\nCatàlogo de editorial.");
                    System.out.println("5-Ingresar una nueva editorial.");
                    System.out.println("6-Consultar datos de una editorial.");
                    System.out.println("7-Eliminar una editorial.");

                System.out.println("\nCatàlogo de libro.");
                System.out.println("8-Ingresar un nuevo libro.");
                System.out.println("9-Consultar datos de un libro.");
                System.out.println("10-Eliminar un libro.");

                System.out.println("\nCatàlogo de usuario.");
                System.out.println("11-Ingresar un nuevo usuario.");
                System.out.println("12-Consultar datos de un usuario");
                System.out.println("13-Actualizar datos de un usuario.");
                System.out.println("14-Eliminar un usuario.");

                System.out.println("\nVolver al menù principal");
                System.out.println("15-Salir del administrador de catálogos.");





            }

        }}}
