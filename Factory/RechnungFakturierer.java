public class RechnungFakturierer extends Fakturierer {


    @Override
    public Dokument creaDokument() {
        return new Rechnung();
    }
    
}
