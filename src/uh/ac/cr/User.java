package uh.ac.cr;

public class User {

    private int ID;
    private String nombreUsuario;
    private String primerApellidoUsuario;
    private String segundoApellidoUsuario;
    private String telefonoDeContacto;

    public User(int id, String nombreUsuario, String primerApellidoUsuario, String segundoApellidoUsuario, String telefonoDeContacto) {
        this.ID = id;
        this.nombreUsuario = nombreUsuario;
        this.primerApellidoUsuario = primerApellidoUsuario;
        this.segundoApellidoUsuario = segundoApellidoUsuario;
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPrimerApellidoUsuario() {
        return primerApellidoUsuario;
    }

    public void setPrimerApellidoUsuario(String primerApellidoUsuario) {
        this.primerApellidoUsuario = primerApellidoUsuario;
    }

    public String getSegundoApellidoUsuario() {
        return segundoApellidoUsuario;
    }

    public void setSegundoApellidoUsuario(String segundoApellidoUsuario) {
        this.segundoApellidoUsuario = segundoApellidoUsuario;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", primerApellidoUsuario='" + primerApellidoUsuario + '\'' +
                ", segundoApellidoUsuario='" + segundoApellidoUsuario + '\'' +
                ", telefonoDeContacto='" + telefonoDeContacto + '\'' +
                '}';
    }
}
