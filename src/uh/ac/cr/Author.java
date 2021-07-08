package uh.ac.cr;

public class Author {
    private int id;
    private String nombreAutor;
    private String primerApellidoAutor;
    private String segundoApellidoAutor;
    private String fechaDeNacimiento;

    public Author(int id, String nombreAutor, String primerApellidoAutor, String segundoApellidoAutor, String fechaDeNacimiento) {
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}

