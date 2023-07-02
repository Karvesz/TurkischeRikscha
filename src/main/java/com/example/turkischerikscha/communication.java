package com.example.turkischerikscha;
public class communication {
    public Spielfeld Feld;

    public communication() {
        Feld = new Spielfeld();
    }


    //selected Card ist die Nummer der Karte, beginnend bei 0 links oben und erhöhend im Uhrzeigersinn
    //guess ist entweder 1(höher/innerhalb) bzw. 2(niedriger/außerhalb)

    public String frontendEingabe(String eingabe) {
        String[] parts = eingabe.split(",");
        String a;

        String selectedCard = parts[0];
        String guess = parts[1];
        int schluecke = 0;

        int number = Integer.parseInt(selectedCard);
        boolean istRichtig = Feld.vergleichen(guess, number);

        if (istRichtig) {
            Feld.kartenFelder[number].umdrehen();
        }
        else{
            schluecke = Feld.anliegendeZaehlen(number);
            Feld.anliegendeAustauschen(number);
        }

        StringBuilder ausgabe = new StringBuilder();

        for (int i = 0; i < Feld.kartenFelder.length; i++) {
            Spielkarte karte = Feld.kartenFelder[i];
            ausgabe.append(karte.getId());
            ausgabe.append(",");
            ausgabe.append(karte.getOffen());
            ausgabe.append(",");

        }

        if (istRichtig) {
            ausgabe.append("Richtig,0");
            a = "Richtig";

        }
        else{
            ausgabe.append("Falsch,");
            a = String.valueOf(schluecke);
            ausgabe.append(schluecke);
        }

        System.out.println(ausgabe.toString());
        if (CONsettings.getSpielerAlter1() > 18 || CONsettings.getSpielerAlter2() > 18 || CONsettings.getSpielerAlter3() > 18 || CONsettings.getSpielerAlter4() > 18 || CONsettings.getSpielerAlter5() > 18 || CONsettings.getSpielerAlter6() > 18) {
            if (schluecke > 1) return a + " Schlücke leeren";
            if (schluecke == 0) return a;
            else return a + " Schluck leeren";
        }
        else {
            if (schluecke > 1) return a + " Liegestütze machen";
            if (schluecke == 0) return a;
            else return a + " Liegestütz machen";
        }
    }

    public String getGültige() {
        Feld.istGueltig();

        StringBuilder optionenZeile = new StringBuilder();
        boolean ersteOption = true;
        for (int i = 0; i < Feld.kartenFelder.length; i++) {
            if (Feld.getKarte(i).isGueltig()) {
                if (!ersteOption) {
                    optionenZeile.append(",");
                }
                optionenZeile.append(i);
                ersteOption = false;
            }
        }

        return optionenZeile.toString();
    }

    public static void main(String[] args) {
        communication spiel = new communication();
        spiel.Feld.printSpielfeld();
        spiel.frontendEingabe("1,1");

    }


}