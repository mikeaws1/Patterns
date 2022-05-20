public class RechnungFakturierer extends Fakturierer {


    @Override
    public Dokument createDokument() {
        return new Rechnung();
    }
    
}
