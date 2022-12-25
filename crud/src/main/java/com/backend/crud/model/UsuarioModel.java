package com.backend.crud.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_usuario")
public class UsuarioModel {
    private long idUsuario;
    private String nombreCompleto;
    private String descUsuario;
}
