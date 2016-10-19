package com.example.iem.volkswagenapp.Model;

/**
 * Created by iem on 19/10/2016.
 */

public abstract class Vehicule {



String couleur,nomModele;
    int nbplaces;

    public Vehicule() {
    }

    public Vehicule(String couleur, String nomModele, int nbplaces) {
        this.couleur = couleur;
        this.nomModele = nomModele;
        this.nbplaces = nbplaces;
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getNomModele() {
        return nomModele;
    }

    public void setNomModele(String nomModele) {
        this.nomModele = nomModele;
    }

    public int getNbplaces() {
        return nbplaces;
    }

    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "couleur='" + couleur + '\'' +
                ", nomModele='" + nomModele + '\'' +
                ", nbplaces='" + nbplaces + '\'' +
                '}';
    }
}
