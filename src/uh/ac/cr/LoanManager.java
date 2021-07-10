package uh.ac.cr;

import java.util.ArrayList;

public class LoanManager {

    private ArrayList<Loan> ArrayLoan = new ArrayList<>();
    ArrayList<Author> listaAutores = new ArrayList<>();
    ArrayList<Book> listaLibros = new ArrayList<>();
    ArrayList<Editorial> listaEditorial = new ArrayList<>();
    ArrayList<User> UserList = new ArrayList<>();





    private void addlistaLibros(Loan loan) {
        ArrayLoan.add(loan);
    }

    public void realizarPrestamo(int idPersona, String codigoLibro, int fecha){


        
}}

