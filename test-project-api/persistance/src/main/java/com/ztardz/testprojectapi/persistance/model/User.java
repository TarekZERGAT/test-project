package com.ztardz.testprojectapi.persistance.model;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "users")
public class User implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="id_user", unique=true, nullable=false)
    private Integer idUser;

    @Column(name="id_params")
    private Integer idParams;

    @Column(name="id_fretagence")
    private Integer idFretagence;

    @Column(name="id_fretcentre")
    private Integer idFretcentre;

    @Column(name="login_user", unique=true, nullable=false, length=50)
    private String loginUser;

    @Column(name="password_user", nullable=false, length=50)
    private String passwordUser;

    @Column(name="function_user", length=50)
    private String functionUser;

    @Column(name="enabled", nullable=false)
    private boolean enabled;

    @Column(name="ip_user", length=50)
    private String ipUser;

    @Column(name="profil_user", length=50)
    private String profilUser;

    @Column(name="name_user", length=50)
    private String nameUser;

    @Column(name="first_user", length=50)
    private boolean firstUser;

    @Column(name="date_user", length=50)
    private Date dateUser;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdParams() {
        return idParams;
    }

    public void setIdParams(Integer idParams) {
        this.idParams = idParams;
    }

    public Integer getIdFretagence() {
        return idFretagence;
    }

    public void setIdFretagence(Integer idFretagence) {
        this.idFretagence = idFretagence;
    }

    public Integer getIdFretcentre() {
        return idFretcentre;
    }

    public void setIdFretcentre(Integer idFretcentre) {
        this.idFretcentre = idFretcentre;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getFunctionUser() {
        return functionUser;
    }

    public void setFunctionUser(String functionUser) {
        this.functionUser = functionUser;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getIpUser() {
        return ipUser;
    }

    public void setIpUser(String ipUser) {
        this.ipUser = ipUser;
    }

    public String getProfilUser() {
        return profilUser;
    }

    public void setProfilUser(String profilUser) {
        this.profilUser = profilUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public boolean isFirstUser() {
        return firstUser;
    }

    public void setFirstUser(boolean firstUser) {
        this.firstUser = firstUser;
    }

    public Date getDateUser() {
        return dateUser;
    }

    public void setDateUser(Date dateUser) {
        this.dateUser = dateUser;
    }
}
