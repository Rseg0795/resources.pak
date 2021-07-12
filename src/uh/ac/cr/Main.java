package uh.ac.cr;
//Andres Chaves Soley, Ricardo Arias Segnini
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Arreglos
        ArrayList<Author> listaAutores = new ArrayList<>();
        ArrayList<Book> listaLibros = new ArrayList<>();
        ArrayList<Editorial> listaEditorial = new ArrayList<>();
        ArrayList<User> UserList = new ArrayList<>();
        ArrayList<Loan> ArrayLoan = new ArrayList<>();
        //Managers
        AuthorManager administradorAutor = new AuthorManager(listaAutores);
        BookManager administradorLibros = new BookManager(listaLibros);
        EditorialManeger administradorEditorial = new EditorialManeger(listaEditorial);
        UserManager administradorUser = new UserManager(UserList);
        LoanManager LoanAdministrator = new LoanManager(ArrayLoan);

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        int Option;
        while (!exit) {
            System.out.println("\n---------------------------------------------------------------------\n");

            System.out.println("1 = Administrar catalogos de datos.");
            System.out.println("2 = Solicitar nuevo prestamo.");
            System.out.println("3 = Ver todos los prestamos solicitados por un usuario.");
            System.out.println("4 = Consultar todos los perstamos realizados de un libro");
            System.out.println("5 = Salir del sistema.");

            Option = scanner.nextInt();
            switch (Option) {
                case 1: {
                    System.out.println("\n---------------------------------------------------------------------");
                    System.out.println("Catàlogo de autor.");
                    System.out.println("1-Ingresar un nuevo autor.");
                    System.out.println("2-Consultar datos de un autor.");
                    System.out.println("3-Actualizar datos de un autor.");
                    System.out.println("4-Eliminar un autor.");

                    System.out.println("\n---------------------------------------------------------------------");
                    System.out.println("Catàlogo de editorial.");
                    System.out.println("5-Ingresar una nueva editorial.");
                    System.out.println("6-Consultar datos de una editorial.");
                    System.out.println("7-Eliminar una editorial.");

                    System.out.println("\n---------------------------------------------------------------------");
                    System.out.println("Catàlogo de libro.");
                    System.out.println("8-Ingresar un nuevo libro.");
                    System.out.println("9-Consultar datos de un libro.");
                    System.out.println("10-Eliminar un libro.");

                    System.out.println("\n---------------------------------------------------------------------");
                    System.out.println("Catàlogo de usuario.");
                    System.out.println("11-Ingresar un nuevo usuario.");
                    System.out.println("12-Consultar datos de un usuario");
                    System.out.println("13-Actualizar datos de un usuario.");
                    System.out.println("14-Eliminar un usuario.");

                    System.out.println("\n---------------------------------------------------------------------");
                    System.out.println("Volver al menù principal");
                    System.out.println("15-Salir del administrador de catálogos.");

                    Option = scanner.nextInt();

                    switch (Option) {


                        case 1: {
                            administradorAutor.AuthorCreator();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 2: {
                            //Get data from a specific Autor.
                            administradorAutor.AuthorFinder();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 3: {
                            //Update data related to a specific patient.
                            administradorAutor.AuthorUpdater();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 4: {
                            administradorAutor.AuthorDeleter();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 5: {
                            administradorEditorial.EditorialGenerator();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 6: {
                            administradorEditorial.EditorialShower();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 7: {
                            administradorEditorial.EditorialDeleter();
                            Utils.pressEnterToContinue();
                            break;
                        }
                        case 8:
                            administradorLibros.BookCreator(administradorAutor, administradorEditorial);
                            Utils.pressEnterToContinue();
                            break;
                        case 9:
                            administradorLibros.BookFinder();
                            Utils.pressEnterToContinue();
                            break;
                        case 10:
                            administradorLibros.BookDeleter();
                            Utils.pressEnterToContinue();
                            break;
                        case 11:
                            administradorUser.UserGenerator();
                            Utils.pressEnterToContinue();
                            break;
                        case 12:
                            administradorUser.UserShower();
                            Utils.pressEnterToContinue();
                            break;
                        case 13:
                            administradorUser.userUpdater();
                            Utils.pressEnterToContinue();
                            break;
                        case 14:
                            administradorUser.UserDeleter();
                            Utils.pressEnterToContinue();
                            break;


                            case 15: {
                            break;
                        }
                        

                    }
                    break;
                }
                case 5:{
                    exit = true;
                    break;
                }

            }
            switch (Option) {
             case 1 : {
                 LoanAdministrator.LoanAdministrator();
                 Utils.pressEnterToContinue();
                break;}

                 case 2: {

                     LoanAdministrator
                     Utils.pressEnterToContinue();
                     break;
                 }
                case 3:{

                    Utils.pressEnterToContinue();
                    break;
                }

                case 4:{

                    Utils.pressEnterToContinue();
                    break;
                }




                case 5:{
                    exit = true;
                    break;
                }

        }
    }
}
    }
