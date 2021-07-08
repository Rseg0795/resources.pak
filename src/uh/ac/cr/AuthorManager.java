package uh.ac.cr;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AuthorManager {
    Scanner Datos = new Scanner(System.in);

    private ArrayList<Author> listaAutores = new ArrayList<>();

    //add elements to array

    public AuthorManager() {
    }


    private void addlistaAutores(Author author) {
        listaAutores.add(author);
    }

    //This method checks if there is any author with the same id as the one received as parameter.
    //Return true if found any.
    //Return false if not found any.
    private boolean existentesAutores(int id) {
        boolean found = false;
        int autorIterator = 0;
        while (!found && autorIterator < listaAutores.size()) {
            if (listaAutores.get(autorIterator).getId() == id) {
                found = true;
            }
            autorIterator++;
        }
        return found;
    }

    public boolean AuthorCreate(int id, String nombreAutor, String primerApellidoAutor, String segundoApellidoAutor, Date fechaDeNacimiento) {
        boolean autorcreado = false;
        if (!existentesAutores(id)) {
            Author nuevoAutor = new Author(id, nombreAutor, primerApellidoAutor, segundoApellidoAutor, fechaDeNacimiento);
            this.addlistaAutores(nuevoAutor);
            autorcreado = true;
        }
        return autorcreado;
    }

    //this method is used to get an author from the list with the Author ID
    public Author FindAutor(int AuthorId) {
        Author author = null;
        boolean found = false;
        int autorIterator = 0;
        while (!found && autorIterator < listaAutores.size()) {
            if (listaAutores.get(autorIterator).getId() == AuthorId) {
                found = true;
                author = listaAutores.get(autorIterator);
            }
            autorIterator++;
        }
        return author;
    }

    public Boolean updateAuthor(int id, String nombreAutor, String primerApellidoAutor, String segundoApellidoAutor, Date fechaDeNacimiento) {
        Author author = FindAutor(id);
        if (author == null)
            return Boolean.FALSE;
        DeleteAuthor(id);
        AuthorCreate(id, nombreAutor, primerApellidoAutor, segundoApellidoAutor, fechaDeNacimiento);
        return Boolean.TRUE;
    }

    public void DeleteAuthor(int id) {
        for (int i = 0; i < listaAutores.size(); i++) {
            if (listaAutores.get(i).getId() == id) {
                listaAutores.remove(i);
            }
        }
    }
};







