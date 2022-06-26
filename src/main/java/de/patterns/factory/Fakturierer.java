package de.patterns.factory;

public abstract class Fakturierer {
   
    public abstract Dokument createDocument();

    public void fakturiereDokument() {
        Dokument dokument = createDocument();

        if (dokument.isDokumentValide()) {
            verarbeiteDokument(dokument);
        }
    }
    
    private void verarbeiteDokument(Dokument dokument) {
            //.. Mach irgendwas
    }
}
