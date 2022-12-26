package com.backend.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUsuario;
    @Column(length = 50, nullable = false)
    private String nombreCompleto;
    @Column(length = 150, nullable = false)
    private String descUsuario;
    @Column(length = 250, nullable = false)
    private String photoUser;

    public UsuarioModel() {
    }

    public UsuarioModel(long idUsuario, String nombreCompleto, String descUsuario, String photoUser) {
        this.idUsuario = idUsuario;
        this.nombreCompleto = nombreCompleto;
        this.descUsuario = descUsuario;
        this.photoUser = photoUser;
    }

    public UsuarioModel(String nombreCompleto, String descUsuario, String photoUser) {
        this.nombreCompleto = nombreCompleto;
        this.descUsuario = descUsuario;
        this.photoUser = photoUser;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDescUsuario() {
        return descUsuario;
    }

    public void setDescUsuario(String descUsuario) {
        this.descUsuario = descUsuario;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }
}
