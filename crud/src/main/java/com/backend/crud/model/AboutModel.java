package com.backend.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_about")
public class AboutModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 50,nullable = false)
    private String tituloAbout;
    @Column(length = 150,nullable = false)
    private String descAbout;

    public AboutModel() {
    }

    public AboutModel(long id, String tituloAbout, String descAbout) {
        this.id = id;
        this.tituloAbout = tituloAbout;
        this.descAbout = descAbout;
    }

    public AboutModel(String tituloAbout, String descAbout) {
        this.tituloAbout = tituloAbout;
        this.descAbout = descAbout;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTituloAbout() {
        return tituloAbout;
    }

    public void setTituloAbout(String tituloAbout) {
        this.tituloAbout = tituloAbout;
    }

    public String getDescAbout() {
        return descAbout;
    }

    public void setDescAbout(String descAbout) {
        this.descAbout = descAbout;
    }
}
