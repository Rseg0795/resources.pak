package uh.ac.cr;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookManager {
    private ArrayList<Book> listaLibros = new ArrayList<>();

    public BookManager() {
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

    public Boolean BookCreator(){
        Scanner scanner = new Scanner(System.in);
        /*
        Autores:
        ID Nombre
        12 Jose
        1234 Diego
        ...
        Seleccione el ID:
        12
        Author autor = find(ID);
        Editorial editorial = find(ID);
         */

        return Boolean.TRUE;
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
