package com.example.rwh;

import java.util.ArrayList;

public class Pvm {
        private String paivamaara;
        private double aamupala;
        private double lounas;
        private double valipala;
        private double paivallinen;
        private double illallinen;
        private int paivanPituus;
        private int paivanPaino;
        private int paivanIka;
        private String sukupuoli;
        private double aktiivisuustaso;

    public Pvm(String paivamaara, int pituus, int paino, int ika, String sukupuoli) {
        this.paivamaara = paivamaara;
        this.aamupala = 0;
        this.lounas = 0;
        this.lounas = 0;
        this.illallinen = 0;
        this.paivanPituus = pituus;
        this.paivanPaino = paino;
        this.paivanIka = ika;
        this.sukupuoli = sukupuoli;
        this.aktiivisuustaso = 0;
    }

    public String toString(){
        return this.paivamaara;
    }

    public String getPaivamaara() {
        return paivamaara;
    }

    public void setPaivamaara(String paivamaara) {
        this.paivamaara = paivamaara;
    }

    public double getAamupala() {
        return aamupala;
    }

    public void setAamupala(double aamupala) {
        this.aamupala = aamupala;
    }

    public double getLounas() {
        return lounas;
    }

    public void setLounas(double lounas) {
        this.lounas = lounas;
    }

    public double getValipala() {
        return valipala;
    }

    public void setValipala(double valipala) {
        this.valipala = valipala;
    }

    public double getPaivallinen() {
        return paivallinen;
    }

    public void setPaivallinen(double paivallinen) {
        this.paivallinen = paivallinen;
    }

    public double getIllallinen() {
        return illallinen;
    }

    public void setIllallinen(double illallinen) {
        this.illallinen = illallinen;
    }

    public int getPaivanPituus() {
        return paivanPituus;
    }

    public void setPaivanPituus(int paivanPituus) {
        this.paivanPituus = paivanPituus;
    }

    public int getPaivanPaino() {
        return paivanPaino;
    }

    public void setPaivanPaino(int paivanPaino) {
        this.paivanPaino = paivanPaino;
    }

    public int getPaivanIka() {
        return paivanIka;
    }

    public void setPaivanIka(int paivanIka) {
        this.paivanIka = paivanIka;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public double getAktiivisuustaso() {
        return aktiivisuustaso;
    }

    public void setAktiivisuustaso(double aktiivisuustaso) {
        this.aktiivisuustaso = aktiivisuustaso;
    }

    //public double paivaTarvittavaEnergia(int paino, int pituus, int )
}
