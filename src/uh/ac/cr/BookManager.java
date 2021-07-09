package uh.ac.cr;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class BookManager {
    private ArrayList<Book> listaLibros;

    public BookManager() {
        ArrayList<Book> listaLibros = new ArrayList<>();
    }

    public BookManager(ArrayList<Book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public ArrayList<Book> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Book> listaLibros) {
        this.listaLibros = listaLibros;
    }

    private void addlistaLibros(Book book) {
        listaLibros.add(book);
    }

    //This method checks if there is any book with the same id as the one received as parameter.
    //Return true if found any.
    //Return false if not found any.
    private boolean existentesLibros(int id) {
        boolean found = false;
        int bookIterator = 0;
        while (!found && bookIterator < listaLibros.size()) {
            if (listaLibros.get(bookIterator).getId() == id) {
                found = true;
            }
            bookIterator++;
        }
        return found;
    }

    private boolean BookCreate(int id, Author author, int edicion, String title, Editorial editorial, int copias) {
        boolean librocreado = false;
        if (!existentesLibros(id)) {
            Book nuevoBook = new Book(id, author, edicion, title, editorial, copias);
            this.addlistaLibros(nuevoBook);
            librocreado = true;
        }
        return librocreado;
    }
    public void BookCreator(AuthorManager authorManager, EditorialManeger editorialManager){
        Scanner scanner = new Scanner(System.in);

        if (authorManager.getListaAutores().size() != 0 || editorialManager.getListaEditorial().size() != 0){//Verifica que tanto la lista de autores como editoriales tengan eleentos

            int idLibro;
            Author autor;
            int Edicion;
            String Title;
            Editorial editorial;
            int copias;

            System.out.println("Ingrese el ID del libro");
            idLibro = scanner.nextInt();
            scanner.nextLine();

            //Muestra autores
            System.out.println("Lista de autores");
            for (Author a: authorManager.getListaAutores())
                System.out.println("ID: "+ a.getId() + " Nombre autor: "+ a.getNombreAutor() + " " + a.getPrimerApellidoAutor());
            System.out.println("Seleccione el ID de un autor: ");
            int idAutor = scanner.nextInt();
            scanner.nextLine();
            autor = authorManager.FindAutor(idAutor);
            if (autor != null)
                System.out.println("Autor seleccionado" + autor.toString());
            System.out.println("\n-------------------\n");

            System.out.println("Ingrese la edicion del libro");
            Edicion = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el titulo del libro");
            Title = scanner.nextLine();

            //Muestra editoriales
            for (Editorial e: editorialManager.getListaEditorial())
                System.out.println("ID: "+ e.getId() +  " Nombre" + e.getName() + " Localizacion: "+ e.getLacation());
            int idEditorial = scanner.nextInt();
            scanner.nextLine();

            editorial = editorialManager.FindEditorial(idEditorial);
            if (editorial != null)
                System.out.println("Editorial seleccionada" + editorial.toString());

            System.out.println("Ingrese la cantidad de copias del libro");
            copias = scanner.nextInt();
            scanner.nextLine();

            if (this.BookCreate(idAutor, autor, Edicion, Title, editorial, copias))
                System.out.println("Libro agregado correctamente");
            else
                System.out.println("ID del libro agregado ya existe. Libro no fue agregado.");
        }
        else{
            System.out.println("No hay autores o editoriales disponibles");
        }
    }

    //this method is used to get an author from the list with the Author ID
    public Book FindBook(int BookId) {
        Book book = null;
        boolean found = false;
        int bookIterator = 0;
        while (!found && bookIterator < listaLibros.size()) {
            if (listaLibros.get(bookIterator).getId() == BookId) {
                found = true;
                book = listaLibros.get(bookIterator);
            }
            bookIterator++;
        }
        return book;
    }

    public void BookFinder(){
        Scanner scanner = new Scanner(System.in);
        int BookId;
        System.out.println("Insert the identification of the book.");
        BookId = scanner.nextInt();
        scanner.nextLine();
        Book book = this.FindBook(BookId);
        if (book != null)
            System.out.println(book.toString());
        else
            System.out.println("Book doesn't exist");
    }

    public Boolean DeleteBook(int id) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == id) {
                listaLibros.remove(i);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void BookDeleter(){
        Scanner scanner = new Scanner(System.in);
        int BookID;
        System.out.println("Insert the identification of the book to delete.");
        BookID = scanner.nextInt();
        if (this.DeleteBook(BookID))
            System.out.println("Libro eliminado exitosamente.");
        else
            System.out.println("ID del libro ingresado no existe.");
    }
}
