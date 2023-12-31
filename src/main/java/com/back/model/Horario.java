package com.back.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Horario implements Serializable {
    
    /*
        Atributos
    */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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
