package com.example.iem.volkswagenapp.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by iem on 19/10/2016.
 */

public  class Groupe {

    String nom,urlLogo;
    int CA2015,nbEmployees;
    Date dateDeRachat;

   ArrayList<Moto> lesMotos;ArrayList<Voiture> lesVoitures;


    public Groupe() {

    }

    public Groupe(String nom, String urlLogo, int CA2015, int nbEmployees, Date dateDeRachat) {
        this.nom = nom;
        this.urlLogo = urlLogo;
        this.CA2015 = CA2015;
        this.nbEmployees = nbEmployees;
        this.dateDeRachat = dateDeRachat;

    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public int getCA2015() {
        return CA2015;
    }

    public void setCA2015(int CA2015) {
        this.CA2015 = CA2015;
    }

    public int getNbEmployees() {
        return nbEmployees;
    }

    public void setNbEmployees(int nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    public Date getDateDeRachat() {
        return dateDeRachat;
    }

    public void setDateDeRachat(Date dateDeRachat) {
        this.dateDeRachat = dateDeRachat;
    }
}
