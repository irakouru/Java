import java.util.ArrayList;

public class EsiintyjaValitys_B {
    
    private ArrayList<Asiakas> asiakkaat;
    private ArrayList<Esiintyja> esiintyjat;
    private ArrayList<Varaus> varaukset;
    
    //ASIAKAS
    public class Asiakas {
        private String asiakasnumero;
        private String nimi;
        private boolean rekisteroitynyt;

        //Konstruktori Asiakkaalle
        public Asiakas (String asiakasnumero, String nimi, boolean rekisteroitynyt) {
            this.asiakasnumero = asiakasnumero;
            this.nimi = nimi;
            this.rekisteroitynyt = rekisteroitynyt;
        }

        public String getAsiakasnumero() {
            return asiakasnumero;
        }

        public void setAsiakasnumero(String asiakasnumero) {
            this.asiakasnumero = asiakasnumero;
        }

        public void setNimi(String nimi) {
            this.nimi = nimi;
        }

        public String getNimi() {
            return nimi;
        }

        public void setRekisteroitynyt(boolean flag) {
            if (flag == true) {
                this.rekisteroitynyt = true;
            } else {
                this.rekisteroitynyt = false; 
            }
        }

        public boolean getRekisteroitynyt() {
            return rekisteroitynyt;
        }
    }
    
    //ESIINTYJÄ
    public class Esiintyja {
        private String tunniste;
        private String nimi;
        private String erityisala;
        private double palkkio;
        
        //Konstruktori Esiintyjalle
        public Esiintyja (String tunniste, String nimi, String erityisala, double palkkio) {
            this.tunniste = tunniste;
            this.nimi = nimi;
            this.erityisala = erityisala;
            this.palkkio = palkkio;
        }

        public void setTunniste(String tunniste) {
            this.tunniste = tunniste; 
        }

        public String getTunniste() {
            return tunniste;
        }

        public void setNimi(String nimi) {
            this.nimi = nimi;
        }

        public String getNimi() {
            return nimi;
        }

        public void setErityisala(String erityisala) {
            this.erityisala = erityisala;
        }

        public String getErityisala() {
            return erityisala; 
        }

        public void setPalkkio(double palkkio) {
            if (palkkio >= 0) {
                this.palkkio = palkkio;
            }   
        }

        public double getPalkkio() {
            return palkkio;
        }
    }
    
    //VARAUS
    public class Varaus {
        private Asiakas asiakas;
        private Esiintyja esiintyja;
        private String tilaisuus;
        private double hinta;
         
        //Konstruktori Varaukselle
        public Varaus (Asiakas asiakas, Esiintyja esiintyja, String tilaisuus) {
        this.asiakas = asiakas;
        this.esiintyja = esiintyja;
        this.tilaisuus = tilaisuus;
        this.hinta = esiintyja.getPalkkio();
        }

        public Asiakas getAsiakas() {
            return asiakas;
        }

        public Esiintyja getEsiintyja() {
            return esiintyja;
        }

        public void setTilaisuus(String tilaisuus) {
            this.tilaisuus = tilaisuus;
        }

        public String getTilaisuus() {
            return tilaisuus;
        }

        public double getHinta() {
            return hinta;
        } 
    }
    
    public class Varausjarjestelma {
    
    }
    
    public class VarausjarjestelmaUI {
    
    }
}

