package uh.ac.cr;
//Andres Chaves Soley, Ricardo Arias Segnini
import uh.ac.cr.Author;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Arreglos
        ArrayList<Author> listaAutores = new ArrayList<>();
        ArrayList<Book> listaLibros = new ArrayList<>();
        ArrayList<Editorial> listaEditorial = new ArrayList<>();

        //Managers
        AuthorManager administradorAutor = new AuthorManager(listaAutores);
        BookManager administradorLibros = new BookManager(listaLibros);
        EditorialManeger administradorEditorial = new EditorialManeger(listaEditorial);


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
                    System.out.println("1 = Administrar catalogos autores.");
                    System.out.println("2 = Administrar catalogos editoriales.");
                    System.out.println("3 = Administrar catalogos libros.");
                    System.out.println("4 = Administrar catalogos usuarios.");

                    Option = scanner.nextInt();

                    switch (Option) {
                        case 1:

                            System.out.println("\n---------------------------------------------------------------------\n");
                            System.out.println("\nCatàlogo de autor.");
                            System.out.println("1-Ingresar un nuevo autor.");
                            System.out.println("2-Consultar datos de un autor.");
                            System.out.println("3-Actualizar datos de un autor.");
                            System.out.println("4-Eliminar un autor.");

                            Option = scanner.nextInt();

                            switch (Option) {
                                case 1: {
                                    administradorAutor.AuthorCreator();
                                    break;
                                }
                                case 2: {
                                    //Get data from a specific Autor.
                                    administradorAutor.AuthorFinder();
                                    break;
                                }
                                case 3: {
                                    //Update data related to a specific patient.
                                    administradorAutor.AuthorUpdater();
                                    break;
                                }
                                case 4: {
                                    administradorAutor.AuthorDeleter();
                                    break;
                                }
                            }
                            break;
                        case 3: {
                            System.out.println("\n---------------------------------------------------------------------\n");
                            System.out.println("\nCatàlogo de libro.");
                            System.out.println("1-Ingresar un nuevo libro.");
                            System.out.println("2-Consultar datos de un libro.");
                            System.out.println("3-Eliminar un libro.");
                            Option = scanner.nextInt();
                            switch (Option) {
                                case 1: {
                                    administradorLibros.BookCreator(administradorAutor);
                                    break;
                                }

                            }
                            break;


                        }
                        //System.out.println("Option selected: " + Option);

/*

                    System.out.println("\nCatàlogo de editorial.");
                    System.out.println("5-Ingresar una nueva editorial.");
                    System.out.println("6-Consultar datos de una editorial.");
                    System.out.println("7-Eliminar una editorial.");



                System.out.println("\nCatàlogo de usuario.");
                System.out.println("11-Ingresar un nuevo usuario.");
                System.out.println("12-Consultar datos de un usuario");
                System.out.println("13-Actualizar datos de un usuario.");
                System.out.println("14-Eliminar un usuario.");

                System.out.println("\nVolver al menù principal");
                System.out.println("15-Salir del administrador de catálogos.");



*/

                    }
            }
        }
    }
}
