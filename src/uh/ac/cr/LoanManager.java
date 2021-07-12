package uh.ac.cr;


 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoanManager {

    private ArrayList<Loan> ArrayLoan = new ArrayList<>();
    ArrayList<Author> listaAutores = new ArrayList<>();
    ArrayList<Book> listaLibros = new ArrayList<>();
    ArrayList<Editorial> listaEditorial = new ArrayList<>();
    ArrayList<User> UserList = new ArrayList<>();

    UserManager User = new UserManager(UserList);
    BookManager Book = new BookManager(listaLibros);

    private void addlistaLibros(Loan loan) {
        ArrayLoan.add(loan);
    }

    Scanner leer = new Scanner(System.in);
    ArrayList <Prestamo> libros = new ArrayList <>();
    String [] menu = {"1 - Alta Libro", "2 - Baixa libro (buscando por ISBN)", "3 - Modificacion libro (buscando por ISBN)", "4 - Lista de libros por numero de paxinas", "5 - Lista de libros por autor", "6 - Salir"};
    String [] menuModificar = {"¿Que deseas modificar?", "1 - Título", "2 - Autor", "3 - Numero de páginas", "4 - Terminar modificación"};
    int respuesta = 0;
    int respuesta1;
    int isbn;
    int paxinas;
    String autor;
    String titulo;
    int contadorComprobante;

    //Iniciamos el menu
        while (respuesta != 6) {

        //Imprimimos menu
        for ( int contador = 0; contador < menu.length; contador++ ) {
            System.out.print("\n"+menu[contador]);
        }

        System.out.print("\n¿Opcion?    ");
        respuesta = leer.nextInt();

        switch (respuesta) {

            case 1:
                System.out.print("\nISBN:  ");
                isbn = leer.nextInt();
                leer.nextLine();
                System.out.print("\nTítulo:  ");
                titulo = leer.nextLine();
                System.out.print("\nAutor:  ");
                autor = leer.nextLine();
                System.out.print("\nNúmero de páginas:  ");
                paxinas = leer.nextInt();

                libros.add(new Prestamo(isbn, titulo, autor, paxinas));
                break;

            case 2:
                System.out.print("\nIntroduce codigo ISBN a eliminar: ");
                isbn = leer.nextInt();
                contadorComprobante = 1;
                for ( int contador = 0; contador < libros.size(); contador++ ) {
                    if (isbn == libros.get(contador).getISBN()) {
                        libros.remove(contador);
                        System.out.print("\nLibro borrado.");
                        contadorComprobante = 0;
                    }
                    else {
                        contadorComprobante++;
                    }
                }
                if ( contadorComprobante == libros.size() ) {
                    System.out.print("\nNo se encuentra el código ISBN en la base de datos.");
                }
                break;

            case 3:
                leer.nextLine();
                System.out.print("\nIntroduce codigo ISBN para modificar datos: ");
                isbn = leer.nextInt();
                respuesta1 = 0;
                contadorComprobante = 1;
                for ( int contador = 0; contador < libros.size(); contador++ ) {
                    if (isbn == libros.get(contador).getISBN()) {
                        contadorComprobante = 0;
                        while ( respuesta1 != 4 ) {
                            for (int contador1 = 0; contador1 < menuModificar.length; contador1++ ) {
                                System.out.print("\n"+menuModificar[contador1]);
                            }
                            System.out.print("\n¿Opcion?    ");
                            respuesta1 = leer.nextInt();

                            switch (respuesta1) {
                                case 1:
                                    System.out.print("\nIntroduce nuevo título: ");
                                    titulo = leer.nextLine();
                                    libros.get(contador).setTitulo(titulo);
                                    System.out.print("\nTítulo modificado.");
                                    break;

                                case 2:
                                    System.out.print("\nIntroduce nuevo autor: ");
                                    autor = leer.nextLine();
                                    libros.get(contador).setAutor(autor);
                                    System.out.print("\nAutor modificado.");
                                    break;

                                case 3:
                                    System.out.print("\nIntroduce nuevo número de páginas: ");
                                    paxinas = leer.nextInt();
                                    libros.get(contador).setPaxinas(paxinas);
                                    System.out.print("\nTítulo modificado.");
                                    break;
                            }
                        }
                    }
                    else {
                        contadorComprobante++;
                    }
                }
                if ( contadorComprobante == libros.size() ) {
                    System.out.print("\nNo se encuentra el código ISBN en la base de datos.");
                }
                break;

            case 4:
                Collections.sort(libros);

                for ( int contador = 0; contador < libros.size(); contador++ ) {
                    System.out.print("\n"+libros.get(contador).getPaxinas()+", "+libros.get(contador).getAutor()+" - "+libros.get(contador).getTitulo());
                }
                break;

            case 5:
                leer.nextLine();
                System.out.print("\nAutor a buscar: ");
                autor = leer.nextLine();

                for ( int contador = 0; contador < libros.size(); contador++ ) {
                    if ( libros.get(contador).getAutor().equalsIgnoreCase(autor) ) {
                        System.out.print("\n"+libros.get(contador).getAutor()+", "+libros.get(contador).getTitulo()+" y "+libros.get(contador).getPaxinas()+" páginas.");
                    }
                }
                break;

        }
    }
}
}

