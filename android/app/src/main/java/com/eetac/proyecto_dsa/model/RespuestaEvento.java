package com.eetac.proyecto_dsa.model;

import java.util.List;

public class RespuestaEvento {

    private String evento;
    private List<UsuarioEvento> users;

    public String getEvento()             { return evento; }
    public List<UsuarioEvento> getUsers() { return users; }
}