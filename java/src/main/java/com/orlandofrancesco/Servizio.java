package com.orlandofrancesco;

import java.util.Date;

public class Servizio {
//    prezzo (comprensivo di unità euro oppure euro/giorno), una descrizione.
    private Date data;
    private int quantita;
    private float prezzo;
    private String descrizione;

    public Servizio(Date data, int quantita, float prezzo, String descrizione) {
        this.data = data;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
