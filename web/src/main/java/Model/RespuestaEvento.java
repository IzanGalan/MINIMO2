package Model;

import java.util.List;

public class RespuestaEvento {

    private String evento;
    private List<UsuarioEvento> users;

    public RespuestaEvento() {}

    public RespuestaEvento(String evento, List<UsuarioEvento> users) {
        this.evento = evento;
        this.users = users;
    }

    public String getEvento()             { return evento; }
    public List<UsuarioEvento> getUsers() { return users; }

    public void setEvento(String evento)            { this.evento = evento; }
    public void setUsers(List<UsuarioEvento> users) { this.users = users; }
}