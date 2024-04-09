package com.orlandofrancesco;

import java.util.ArrayList;
import java.util.Date;

public class Prenotazione {
    private Cliente cliente;
    private Camera camera;
    private Date dataPrenotazione;
    private int numero;
    private Date anno;
    private Date dal;
    private Date al;
    private float caparraConfirmatoria;
    private float tariffaApplicata;
    private ArrayList<Servizio> servizi = new ArrayList<>();

    public Prenotazione(Cliente cliente, Camera camera, Date data, int numero, Date anno, Date dal, Date al,
                        float caparraConfirmatoria, float tariffaApplicata, ArrayList<Servizio> servizi) {
        this.cliente = cliente;
        this.camera = camera;
        this.dataPrenotazione = data;
        this.numero = numero;
        this.anno = anno;
        this.dal = dal;
        this.al = al;
        this.caparraConfirmatoria = caparraConfirmatoria;
        this.tariffaApplicata = tariffaApplicata;
        this.servizi = servizi;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Date getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(Date dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getAnno() {
        return anno;
    }

    public void setAnno(Date anno) {
        this.anno = anno;
    }

    public Date getDal() {
        return dal;
    }

    public void setDal(Date dal) {
        this.dal = dal;
    }

    public Date getAl() {
        return al;
    }

    public void setAl(Date al) {
        this.al = al;
    }

    public float getCaparraConfirmatoria() {
        return caparraConfirmatoria;
    }

    public void setCaparraConfirmatoria(float caparraConfirmatoria) {
        this.caparraConfirmatoria = caparraConfirmatoria;
    }

    public float getTariffaApplicata() {
        return tariffaApplicata;
    }

    public void setTariffaApplicata(float tariffaApplicata) {
        this.tariffaApplicata = tariffaApplicata;
    }

    public ArrayList<Servizio> getServizi() {
        return servizi;
    }

    public void setServizi(ArrayList<Servizio> servizi) {
        this.servizi = servizi;
    }

    @Override
    public String toString() {
        String riassuntoDatiSignificativi =
                "Il cliente " + getCliente().getNome() + " " +  getCliente().getCognome() +
                        " ha prenotato la camera " + getCamera().getNumero() +
                        " il giorno " + DateToString.convert(getDataPrenotazione()) +
                        " per il periodo che va dal " + DateToString.convert(getDal()) +
                        " al " + DateToString.convert(getAl()) + ".";
        String riassuntoCostiTotaleCaparraSaldo = "";
        Float totale = 0f;

        for (Servizio servizio : servizi){
            riassuntoCostiTotaleCaparraSaldo += servizio.getDescrizione() + " " + (servizio.getPrezzo() * servizio.getQuantita()) + "€\n";
        }

        for (Servizio servizio : servizi){
            totale += (servizio.getPrezzo() * servizio.getQuantita());
        }

        Float caparra = (totale * tariffaApplicata) / 100;
        Float saldoFinale = totale - caparra;

        return "Dati significativi\n" + riassuntoDatiSignificativi +
                "\nFattura\n" + riassuntoCostiTotaleCaparraSaldo + "Totale: " + totale  + "€\nCaparra " + caparra + "€\nSaldo finale " + saldoFinale + "€";
    }
}
