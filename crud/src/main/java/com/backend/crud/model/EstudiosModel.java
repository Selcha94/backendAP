package com.backend.crud.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_estudios")
public class EstudiosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50,nullable = false)
    private String instituto;
    @Column(length = 50,nullable = false)
    private String fecha;
    @Column(length = 50,nullable = false)
    private String titulo;
    @Column(length = 150,nullable = false)
    private String descripcion;

    public EstudiosModel() {
    }

    public EstudiosModel(long id, String instituto, String fecha, String titulo, String descripcion) {
        this.id = id;
        this.instituto = instituto;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public EstudiosModel(String instituto, String fecha, String titulo, String descripcion) {
        this.instituto = instituto;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
