package uh.ac.cr;

public class Book {

    private int Id;
    private Author Author;
    private int Edicion;
    private String Title;
    private Editorial Editorial;
    private int copias;

    public Book(int id, Author author, int edicion, String title, Editorial editorial, int copias) {
        Id = id;
        Author = author;
        Edicion = edicion;
        Title = title;
        Editorial = editorial;
        this.copias = copias;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", Author=" + Author +
                ", Edicion=" + Edicion +
                ", Title='" + Title + '\'' +
                ", Editorial=" + Editorial +
                ", copias=" + copias +
                '}';
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
