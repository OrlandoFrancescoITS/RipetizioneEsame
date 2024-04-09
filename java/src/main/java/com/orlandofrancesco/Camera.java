package com.orlandofrancesco;

public class Camera {
    private final Camera.tipologia tipologia;
    //numero, una descrizione e la tipologia (singola, doppia)
    private Integer numero;
    private String descrizione;
    static enum tipologia {singola, doppia}

    public Camera(Integer numero, String descrizione, tipologia t) {
        this.numero = numero;
        this.descrizione = descrizione;
        this.tipologia = t;
    }

    public Camera.tipologia getTipologia() {
        return tipologia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
