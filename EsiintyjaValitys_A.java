import java.util.ArrayList;

public class EsiintyjaValitys_A {
    
    private ArrayList<Asiakas> asiakkaat;
    private ArrayList<Esiintyja> esiintyjat;
    private ArrayList<Varaus> varaukset;

    public class Asiakas {
        private String asiakasnumero;
        private String nimi;
        private boolean rekisteroitynyt;
    }

    public class Esiintyja {
        private String tunniste;
        private String nimi;
        private String erityisala;
        private double palkkio;
    }

    public class Varaus {
        private Asiakas asiakas;
        private Esiintyja esiintyja;
        private String tilaisuus;
        private double hinta;    
    }

    public class Varausjarjestelma {

    }

    public class VarausjarjestelmaUI {

    }
}