package com.orlandofrancesco;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prenotazione> prenotazioniOstelloDelBarbone = new ArrayList<>();
        Albergo ostelloDelBarbone = new Albergo("Ostello del Barbone", prenotazioniOstelloDelBarbone);

        Cliente Mario = new Cliente(
                "abc123",
                "Rossi",
                "Mario",
                "Monteiasi",
                "TA",
                "m.rossi@paesedimerda.ro",
                "3331345555",
                null);

        Camera suite1 = new Camera(104,"Suite super lussuosa", Camera.tipologia.doppia);

        ArrayList<Servizio> servizioCompleto = new ArrayList<>();
        servizioCompleto.add(new Servizio(new Date(2024,04,03), 15, 50, "Colazione in camera"));
        servizioCompleto.add(new Servizio(new Date(2024,04,03), 15,50, "bevande e cibo nel mini bar"));
        servizioCompleto.add(new Servizio(new Date(2024,04,03), 15,50, "internet"));

        prenotazioniOstelloDelBarbone.add(new Prenotazione(
                Mario,
                suite1,
                new Date(2024,04,03),
                420,
                new Date(2024),
                new Date(2024,04,10),
                new Date(2024,04,25),
                2000,
                20,
                servizioCompleto ));

//        ostelloDelBarbone.cercaPrenotazioneNomeCliente("Mario");

        for (Prenotazione prenotazione : prenotazioniOstelloDelBarbone){
            System.out.println(prenotazione.toString());
        }
    }
}