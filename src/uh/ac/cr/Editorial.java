package uh.ac.cr;

public class Editorial {

    private int Id;
    private String Name;
    private String Lacation;
    private String phone;

    public Editorial(int id, String name, String lacation, String phone) {
        Id = id;
        Name = name;
        Lacation = lacation;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Lacation='" + Lacation + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLacation() {
        return Lacation;
    }

    public void setLacation(String lacation) {
        Lacation = lacation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
