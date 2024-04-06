package com.orlandofrancesco.javaEnterprice.Models;

public class Auto {
    private String produttore;
    private String modello;
    private int cilindrata;

    public Auto(String produttore, String modello, int cilindrata) {
        this.produttore = produttore;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
