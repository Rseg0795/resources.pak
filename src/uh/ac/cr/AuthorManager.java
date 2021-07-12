package uh.ac.cr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AuthorManager {
    Scanner Datos = new Scanner(System.in);

    private ArrayList<Author> listaAutores;

    //add elements to array


    public AuthorManager(ArrayList<Author> listaAutores) {
        this.listaAutores = listaAutores;
    }

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

    public void AuthorCreator(){
        Scanner scanner = new Scanner(System.in);
        int AutorId;
        System.out.println("Create a new author.");
        System.out.println("Insert the ID of the author.");
        AutorId = scanner.nextInt();


        String nombreAutor;
        System.out.println("Insert the name of the author.");
        scanner.nextLine();
        nombreAutor = scanner.nextLine();

        System.out.println("Insert the first lastname of the author.");
        String primerApellidoAutor = scanner.nextLine();

        System.out.println("Insert the second lastname of the author.");
        String segundoApellidoAutor = scanner.nextLine();
        //scanner.nextLine();

        System.out.println("Insert the DOB of the Author. 'dia/mes/año'");
        String fechaDeNacimiento = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(fechaDeNacimiento);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean autorcreado = this.AuthorCreate(AutorId, nombreAutor, primerApellidoAutor, segundoApellidoAutor, date);
        if (autorcreado) {
            System.out.println("\nNew Autor created with Id: " + AutorId);
        } else {
            System.out.println("\nWe cannot create this Autor since there is other Autor" +
                    " with the specified id: " + AutorId);
        }
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
    public void AuthorFinder(){
        Scanner scanner = new Scanner(System.in);
        int AutorId;
        System.out.println("Insert the ID of the author.");
        AutorId = scanner.nextInt();
        scanner.nextLine();
        Author autor = this.FindAutor(AutorId);
        if (autor != null)
            System.out.println(autor.toString());
        else
            System.out.println("Author doesn't exist");
    }

    public Boolean updateAuthor(int id, String nombreAutor, String primerApellidoAutor, String segundoApellidoAutor, Date fechaDeNacimiento) {
        Author author = FindAutor(id);
        if (author == null)
            return Boolean.FALSE;
        DeleteAuthor(id);
        AuthorCreate(id, nombreAutor, primerApellidoAutor, segundoApellidoAutor, fechaDeNacimiento);
        return Boolean.TRUE;
    }
    public void AuthorUpdater(){
        Scanner scanner = new Scanner(System.in);
        int AutorId;
        System.out.println("update a new author.");
        System.out.println("Insert the identification of the author.");
        AutorId = scanner.nextInt();

        System.out.println("Insert the name of the author.");
        scanner.nextLine();
        String nombreAutor1 = scanner.nextLine();

        System.out.println("Insert el firts lastname of author.");
        String primerApellidoAutor1 = scanner.nextLine();

        System.out.println("Insert el second Last name of author.");
        String segundoApellidoAutor1 = scanner.nextLine();

        System.out.println("Insert the DOB of the Author.");
        String fechaDeNacimiento1 = scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(fechaDeNacimiento1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean Autorupdate = this.updateAuthor(AutorId, nombreAutor1, primerApellidoAutor1, segundoApellidoAutor1, date);
        if (Autorupdate) {
            System.out.println("\nAutor updated with Id: " + AutorId);
        } else {
            System.out.println("\nWe cannot update the Author since there is other Author" +
                    " with the specified id: " + AutorId);
        }
    }

    public void DeleteAuthor(int id) {
        for (int i = 0; i < listaAutores.size(); i++) {
            if (listaAutores.get(i).getId() == id) {
                listaAutores.remove(i);
            }
        }
    }

    public void AuthorDeleter(){
        Scanner scanner = new Scanner(System.in);
        int AutorId;
        System.out.println("Insert the ID of the author to delete.");
        AutorId = scanner.nextInt();
        this.DeleteAuthor(AutorId);
    }

    public ArrayList<Author> getListaAutores() {
        return listaAutores;
    }

    public void setListaAutores(ArrayList<Author> listaAutores) {
        this.listaAutores = listaAutores;
    }
};







