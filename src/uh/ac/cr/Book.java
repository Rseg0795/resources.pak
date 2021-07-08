package uh.ac.cr;

public class Book {

    private int Id;
    private Author Author;
    private int Edicion;
    private String Title;
    private Editorial Editorial;
    private int copias;

    public Book (int id, int edicion, String title, int copias) {
        Id = id;
        Edicion = edicion;
        Title = title;
        this.copias = copias;
    }

    public Book (String author, String editorial) {
        Author = author;
        Editorial = editorial;
    }

    public Book(int id, String author, int edicion, String title, String editorial, int copias) {
        Id = id;
        Author = author;
        Edicion = edicion;
        Title = title;
        Editorial = editorial;
        this.copias = copias;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int edicion) {
        Edicion = edicion;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }
}
