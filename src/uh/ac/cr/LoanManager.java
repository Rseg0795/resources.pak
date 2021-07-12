package uh.ac.cr;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LoanManager {

    private ArrayList<Loan> ArrayLoan = new ArrayList<>();
    ArrayList<Author> listaAutores = new ArrayList<>();
    ArrayList<Book> listaLibros = new ArrayList<>();
    ArrayList<Editorial> listaEditorial = new ArrayList<>();
    ArrayList<User> UserList = new ArrayList<>();

    UserManager User = new UserManager(UserList);
    BookManager Book = new BookManager(listaLibros);


    Scanner prestamo = new Scanner(System.in);

    public LoanManager(ArrayList<Loan> arrayLoan) {

    }

    public void addlistaLibros(Loan loan) {
        ArrayLoan.add(loan);
    }

    public void LoanAdministrator(){
        Scanner scanner = new Scanner(System.in);
        int Id ;
        Date withdrawal;


        System.out.print("Ingrese el Id del libro que desea busacar." );
        Id = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Favor ingrese la fecha de retiro del libro . 'dia/mes/año'");
        String withdrawalDate  = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = format.parse(withdrawalDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}

