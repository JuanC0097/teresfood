package com.back.model;

public class Usuario {
   /*
        Atributos de la clase
    */
    private int id_usuario;
    private String nombre;
    private String apellido;
    private String documento;
    private String cargo;
    private String password;
    
    private Horario horario;

    /*
        Constructores
    */
    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre, String apellido, String documento, String cargo, String password, Horario horario) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.cargo = cargo;
        this.password = password;
        this.horario = horario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
}
