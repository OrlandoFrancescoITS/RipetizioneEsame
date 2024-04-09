package com.orlandofrancesco;

import java.util.ArrayList;
import java.util.Date;

public class Albergo {
    private String name;
    private ArrayList<Prenotazione> prenotazioni = new ArrayList<>();

    public Albergo(String name, ArrayList<Prenotazione> prenotazioni) {
        this.name = name;
        this.prenotazioni = prenotazioni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public Prenotazione cercaPrenotazione(int numero, Date anno){
        for (Prenotazione prenotazione : prenotazioni){
            if (prenotazione.getNumero() == numero && prenotazione.getAnno() == anno){
                return prenotazione;
            }
        }
        return null;
    }

    public Prenotazione cercaPrenotazione(String cognome, String nome){
        for (Prenotazione prenotazione : prenotazioni){
            if (prenotazione.getCliente().getCognome() == cognome && prenotazione.getCliente().getNome() == nome){
                return prenotazione;
            }
        }
        return null;
    }

    public Prenotazione cercaPrenotazioneNomeCliente(String nome){
        for (Prenotazione prenotazione : prenotazioni){
            if (prenotazione.getCliente().getNome() == nome){
                return prenotazione;
            }
        }
        return null;
    }

    public Prenotazione cercaPrenotazioneCognomeCliente(String cognome){
        for (Prenotazione prenotazione : prenotazioni){
            if (prenotazione.getCliente().getCognome() == cognome){
                return prenotazione;
            }
        }
        return null;
    }

    public ArrayList<Prenotazione> cercaPrenotazione(Date data){
        ArrayList<Prenotazione> _prenotazioni = new ArrayList<>();
        for (Prenotazione prenotazione : prenotazioni){
            if (prenotazione.getDataPrenotazione() == data){
                _prenotazioni.add(prenotazione);
            }
        }
        return _prenotazioni;
    }
}
