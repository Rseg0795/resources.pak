package uh.ac.cr;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EditorialManeger {
    Scanner Datos=new Scanner(System.in);
    private ArrayList<Editorial> listaEditorial;


    public EditorialManeger(){
        listaEditorial  = new ArrayList<>();
    }

    public EditorialManeger(ArrayList<Editorial> listaEditorial) {
        this.listaEditorial = listaEditorial;
    }

    public ArrayList<Editorial> getListaEditorial() {
        return listaEditorial;
    }

    public void setListaEditorial(ArrayList<Editorial> listaEditorial) {
        this.listaEditorial = listaEditorial;
    }

    private void addlistEditorial(Editorial editorial) {
        listaEditorial.add(editorial);
    }


    private boolean EditorialInList(int id) {
        boolean found = false;
        int autorIterator = 0;
        while (!found && autorIterator < listaEditorial.size()) {
            if (listaEditorial.get(autorIterator).getId() == id) {
                found = true;
            }
            autorIterator++;
        }
        return found;
    }
    public boolean GenerateEditorial(int id, String name, String Location, String phone) {
        boolean EditorialCreada = false;
        if (!EditorialInList(id)) {
            Editorial EditorialNueva = new Editorial(id, name, Location,phone);
            this.addlistEditorial(EditorialNueva);
            EditorialCreada = true;
        }
        return EditorialCreada;
    }

    public void EditorialGenerator(){
        Scanner scanner = new Scanner(System.in);
        int Id;
        String Name;
        String Location;
        String phone;

        System.out.println("add editorial");

        System.out.println("Insert editorial ID");
        Id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert editorial name");
        Name = scanner.nextLine();

        System.out.println("Insert editorial Location");
        Location = scanner.nextLine();

        System.out.println("Insert editorial phone");
        phone = scanner.nextLine();

        if (GenerateEditorial(Id, Name, Location, phone))
            System.out.println("Editorial ID: " + Id + "add successfully");
        else
            System.out.println("Editorial ID: " + Id + " ID already exists try another one");
    }


    public Editorial ShowEditorial(int EditorialId) {
        Editorial Ed = null;
        boolean found = false;
        int EditorialIterator = 0;
        while (!found && EditorialIterator < listaEditorial.size()) {
            if (listaEditorial.get(EditorialIterator).getId() == EditorialId) {
                found = true;
                Ed = listaEditorial.get(EditorialIterator);
            }
            EditorialIterator++;
        }
        return Ed;
    }

    public void EditorialShower(){
        Scanner scanner = new Scanner(System.in);
        int EditorialId;
        System.out.println("Insert the ID of the editorial.");
        EditorialId = scanner.nextInt();
        scanner.nextLine();
        Editorial editorial = this.FindEditorial(EditorialId);
        if (editorial != null)
            System.out.println(editorial.toString());
        else
            System.out.println("Editorial doesn't exist");
    }



    public Editorial FindEditorial(int EditorialId) {
        Editorial editorial = null;
        boolean found = false;
        int editorialIterator = 0;
        while (!found && editorialIterator < listaEditorial.size()) {
            if (listaEditorial.get(editorialIterator).getId() == EditorialId) {
                found = true;
                editorial = listaEditorial.get(editorialIterator);
            }
            editorialIterator++;
        }
        return editorial;
    }

    public Boolean DeleteEditorial(int id) {
        for (int i = 0; i < listaEditorial.size(); i++) {
            if (listaEditorial.get(i).getId() == id) {
                listaEditorial.remove(i);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void EditorialDeleter(){
        Scanner scanner = new Scanner(System.in);
        int EditorialID;
        System.out.println("Insert ID of editorial to delete.");
        EditorialID = scanner.nextInt();
        scanner.nextLine();
        if (this.DeleteEditorial(EditorialID))
            System.out.println("Deleted successfully.");
        else
            System.out.println("Editorial ID does not exist .");
    }





}
