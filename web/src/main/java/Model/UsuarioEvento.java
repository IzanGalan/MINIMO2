package Model;

public class UsuarioEvento {

    private String name;
    private String surname;
    private String avatar;

    public UsuarioEvento() {}

    public UsuarioEvento(String name, String surname, String avatar) {
        this.name = name;
        this.surname = surname;
        this.avatar = avatar;
    }

    public String getName()    { return name; }
    public String getSurname() { return surname; }
    public String getAvatar()  { return avatar; }

    public void setName(String name)       { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setAvatar(String avatar)   { this.avatar = avatar; }
}
