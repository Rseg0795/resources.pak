package uh.ac.cr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    private ArrayList<User> UserList = new ArrayList<>();

    public UserManager(ArrayList<User> userList) {
        UserList = userList;
    }

    private void addlistaLibros(User user) {
        UserList.add(user);
    }

    private boolean UserInList(int id) {
        boolean found = false;
        int autorIterator = 0;
        while (!found && autorIterator < UserList.size()) {
            if (UserList.get(autorIterator).getId() == id) {
                found = true;
            }
            autorIterator++;
        }
        return found;
    }
    public boolean GenerateUser(int id, String  NombreUsuario  , String  primerApellidoUsuario, String segundoApellidoUsuario, String telefonoDeContacto) {
        boolean UserGenerated = false;
        if (!UserInList(id)) {
            User UserGen = new User(id,  NombreUsuario, primerApellidoUsuario, segundoApellidoUsuario,telefonoDeContacto );
            this.addlistaLibros(UserGen);
            UserGenerated = true;
        }
        return UserGenerated;
    }
    public void UserGenerator(){
        Scanner scanner = new Scanner(System.in);
        int Id;
        String nombreUsuario;
        String primerApellidoUsuario;
        String segundoApellidoUsuario;
        String telefonoDeContacto;

        System.out.println("add user");

        System.out.println("Insert user`s ID");
        Id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insert user`s name ");
        nombreUsuario = scanner.nextLine();

        System.out.println("Insert user`s first lastname");
        primerApellidoUsuario = scanner.nextLine();

        System.out.println("Insert user`s second lastname");
        segundoApellidoUsuario = scanner.nextLine();

        System.out.println("Insert user`s phone");
        telefonoDeContacto = scanner.nextLine();

        if (GenerateUser(Id, nombreUsuario, primerApellidoUsuario, segundoApellidoUsuario,telefonoDeContacto))
            System.out.println("User with ID: " + Id + " add successfully");
        else
            System.out.println("User with ID: " + Id + " ID already exists try another one ");

    }
        public User ShowUser(int UserID) {
            User US = null;
            boolean found = false;
            int UserInterface = 0;
            while (!found && UserInterface < UserList.size()) {
                if (UserList.get(UserInterface).getId() == UserID) {
                    found = true;
                    US = UserList.get(UserInterface);
                }
                UserInterface++;
            }
            return US;
        }
    public void UserShower(){
        Scanner scanner = new Scanner(System.in);
        int UserId;
        System.out.println("Insert the identification of the user.");
        UserId = scanner.nextInt();
        scanner.nextLine();
        User user = this.UserFinder(UserId);
        if (user != null)
            System.out.println(user.toString());
        else
            System.out.println("user doesn't exist");
    }

    public User UserFinder(int UserID){
        User user = null;
        boolean found = false;
        int i = 0;
        while (!found && i < UserList.size()) {
            if (UserList.get(i).getId() == UserID) {
                found = true;
                user = UserList.get(i);
            }
            i++;
           } return user;

    }

    public Boolean DeleteUser(int id) {
        for (int i = 0; i < UserList.size(); i++) {
            if (UserList.get(i).getId() == id) {
                UserList.remove(i);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public void UserDeleter(){
        Scanner scanner = new Scanner(System.in);
        int EditorialID;
        System.out.println("Insert user ID to delete.");
        EditorialID = scanner.nextInt();
        scanner.nextLine();
        if (this.DeleteUser(EditorialID))
            System.out.println("user deleted successfully.");
        else
            System.out.println("User ID does not exist.");
    }


    public Boolean userUpdate(int id, String NombreUsuario, String primerApellidoUsuario, String segundoApellidoUsuario,String telefonoDeContacto) {
        User user = UserFinder(id);
        if (user == null)
            return Boolean.FALSE;
        DeleteUser(id);
        GenerateUser(id,NombreUsuario,primerApellidoUsuario, segundoApellidoUsuario,telefonoDeContacto);
        return Boolean.TRUE;
    }
    public void userUpdater(){
        Scanner scanner = new Scanner(System.in);
        int AutorId;
        System.out.println("update a new author.");
        System.out.println("Insert the identification of the author.");
        AutorId = scanner.nextInt();

        System.out.println("update name.");
        scanner.nextLine();
        String nombreAutor1 = scanner.nextLine();

        System.out.println("update first lastname.");
        String primerApellidoAutor1 = scanner.nextLine();

        System.out.println("update second lastname.");
        String segundoApellidoAutor1 = scanner.nextLine();

        System.out.println("Update phone.");
        String telefonoDeContacto = scanner.nextLine();




        boolean Autorupdate = this.userUpdate(AutorId, nombreAutor1, primerApellidoAutor1, segundoApellidoAutor1, telefonoDeContacto );
        if (Autorupdate) {
            System.out.println("\nAutor updated with Id: " + AutorId);
        } else {
            System.out.println("\nWe cannot update the Author since there is other Author" +
                    " with the specified id: " + AutorId);
        }
    }






}















