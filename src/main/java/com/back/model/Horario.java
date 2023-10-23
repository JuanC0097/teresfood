package com.back.model;

public class Horario {
    
    /*
        Atributos
    */
    private long id_horario;
    private String jornada;
    private String horario;
    
    /*
        Constructores
    */
    public Horario() {
    }

    public Horario(long id_horario, String jornada, String horario) {
        this.id_horario = id_horario;
        this.jornada = jornada;
        this.horario = horario;
    }

    public long getId_horario() {
        return id_horario;
    }

    public void setId_horario(long id_horario) {
        this.id_horario = id_horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}
