
public class RueckzahlungFakturierer extends Fakturierer {



    @Override
    public Dokument createDokument() {
        return new Reckzahlung(100, 1);
    }


}