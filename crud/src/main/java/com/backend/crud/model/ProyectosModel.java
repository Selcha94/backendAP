package com.backend.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_projects")
public class ProyectosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProjects;
    @Column(length = 250,nullable = false)
    private String photoProject;
    @Column(unique = true,length = 250,nullable = false)
    private String urlProject;
    @Column(length = 80,nullable = false)
    private String tituloProject;

    public ProyectosModel() {
    }

    public ProyectosModel(long idProjects, String photoProject, String urlProject, String tituloProject) {
        this.idProjects = idProjects;
        this.photoProject = photoProject;
        this.urlProject = urlProject;
        this.tituloProject = tituloProject;
    }

    public ProyectosModel(String photoProject, String urlProject, String tituloProject) {
        this.photoProject = photoProject;
        this.urlProject = urlProject;
        this.tituloProject = tituloProject;
    }

    public long getIdProjects() {
        return idProjects;
    }

    public void setIdProjects(long idProjects) {
        this.idProjects = idProjects;
    }

    public String getPhotoProject() {
        return photoProject;
    }

    public void setPhotoProject(String photoProject) {
        this.photoProject = photoProject;
    }

    public String getUrlProject() {
        return urlProject;
    }

    public void setUrlProject(String urlProject) {
        this.urlProject = urlProject;
    }

    public String getTituloProject() {
        return tituloProject;
    }

    public void setTituloProject(String tituloProject) {
        this.tituloProject = tituloProject;
    }
}
