package uh.ac.cr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Author {
    private int id;
    private String nombreAutor;
    private String primerApellidoAutor;
    private String segundoApellidoAutor;
    private Date fechaDeNacimiento;

    public Author(int id, String nombreAutor, String primerApellidoAutor, String segundoApellidoAutor, Date fechaDeNacimiento) {
        this.id = id;
        this.nombreAutor = nombreAutor;
        this.primerApellidoAutor = primerApellidoAutor;
        this.segundoApellidoAutor = segundoApellidoAutor;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getPrimerApellidoAutor() {
        return primerApellidoAutor;
    }

    public void setPrimerApellidoAutor(String primerApellidoAutor) {
        this.primerApellidoAutor = primerApellidoAutor;
    }

    public String getSegundoApellidoAutor() {
        return segundoApellidoAutor;
    }

    public void setSegundoApellidoAutor(String segundoApellidoAutor) {
        this.segundoApellidoAutor = segundoApellidoAutor;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = format.format(fechaDeNacimiento);
        return "Author{" +
                "id=" + id +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", primerApellidoAutor='" + primerApellidoAutor + '\'' +
                ", segundoApellidoAutor='" + segundoApellidoAutor + '\'' +
                ", fechaDeNacimiento='" + fecha + '\'' +
                '}';
    }
}

