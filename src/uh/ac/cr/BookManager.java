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
    public void BookCreator(AuthorManager authorManager){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de autores");
        if (authorManager.getListaAutores().size() != 0){
            for (Author a: authorManager.getListaAutores())
                System.out.println("ID: "+ a.getId() + " Nombre autor: "+ a.getNombreAutor() + " " + a.getPrimerApellidoAutor());
            System.out.println("Seleccione el ID de un autor: ");
            int idAutor = scanner.nextInt();
            scanner.nextLine();
            Author autor = authorManager.FindAutor(idAutor);
            if (autor != null)
                System.out.println("Autor seleccionado" + autor.toString());
        }
        else
            System.out.println("No hay autores disponibles");

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

    public Boolean updateBook(int id, Author author, int edicion, String title, Editorial editorial, int copias) {
        Book book = FindBook(id);
        if (book == null)
            return Boolean.FALSE;
        DeleteBook(id);
        BookCreate(id, author, edicion, title, editorial, copias);
        return Boolean.TRUE;
    }

    public void DeleteBook(int id) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == id) {
                listaLibros.remove(i);
            }
        }
    }
}
