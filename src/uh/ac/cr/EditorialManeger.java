package uh.ac.cr;

import java.util.ArrayList;
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

    public void DeleteAuthor(int id) {
        for (int i = 0; i < listaEditorial.size(); i++) {
            if (listaEditorial.get(i).getId() == id) {
                listaEditorial.remove(i);
            }
        }
    }





}
