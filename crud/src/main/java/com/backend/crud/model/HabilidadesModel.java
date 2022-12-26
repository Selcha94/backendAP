package com.backend.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_skills")
public class HabilidadesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSkill;
    private String nameSkill;
    private String porcentaje;

    public HabilidadesModel() {
    }

    public HabilidadesModel(long idSkill, String nameSkill, String porcentaje) {
        this.idSkill = idSkill;
        this.nameSkill = nameSkill;
        this.porcentaje = porcentaje;
    }

    public HabilidadesModel(String nameSkill, String porcentaje) {
        this.nameSkill = nameSkill;
        this.porcentaje = porcentaje;
    }

    public long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNameSkill() {
        return nameSkill;
    }

    public void setNameSkill(String nameSkill) {
        this.nameSkill = nameSkill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
