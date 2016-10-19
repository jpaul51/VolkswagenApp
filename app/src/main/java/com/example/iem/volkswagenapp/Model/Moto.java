package com.example.iem.volkswagenapp.Model;

/**
 * Created by iem on 19/10/2016.
 */

public class Moto extends Vehicule {

    String adherenceMoto;

    public Moto() {
    }

    public Moto(String couleur, String nomModele, int nbplaces) {
        super(couleur, nomModele, nbplaces);
    }

    public Moto(String couleur, String nomModele, int nbplaces, String adherenceMoto) {
        super(couleur, nomModele, nbplaces);
        this.adherenceMoto = adherenceMoto;
    }

    @Override
    public String toString() {
        return super.toString()+"Moto{" +
                "adherenceMoto='" + adherenceMoto + '\'' +
                '}';
    }
}
