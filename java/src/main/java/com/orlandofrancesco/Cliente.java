package com.orlandofrancesco;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Cliente {
    private String codiceFiscale;
    private String cognome;
    private String nome;
    private String citta;
    private String provincia;
    private String email;
    private String telefono;
    private String cellulare;

    public Cliente(String codiceFiscale, String cognome, String nome, String citta, String provincia, String email, String telefono, String cellulare) {
        this.codiceFiscale = codiceFiscale;
        this.cognome = cognome;
        this.nome = nome;
        this.citta = citta;
        this.provincia = provincia;
        this.email = email;
        this.telefono = telefono;
        this.cellulare = cellulare;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }
}
