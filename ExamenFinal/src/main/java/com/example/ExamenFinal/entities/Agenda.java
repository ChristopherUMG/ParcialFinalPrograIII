package com.example.ExamenFinal.entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "agenda")
public class Agenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tituloTarea;
    private String agregarTarea;
    private String opcional;
    @Column(name ="created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getAgregarTarea() {
        return agregarTarea;
    }

    public void setAgregarTarea(String agregarTarea) {
        this.agregarTarea = agregarTarea;
    }

    public String getOpcional() {
        return opcional;
    }

    public void setOpcional(String opcional) {
        this.opcional = opcional;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Date getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {

        this.createdAt = createdAt;
    }
}
