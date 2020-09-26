import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.time.Duration;

class Kakesystem {
    static int kundeId = 0;
    private ArrayList<Kunde> kunder = new ArrayList<>();

    public Kunde registrerKunde(String navn) {
        Kunde nyKunde = new Kunde(kundeId++, navn);

        return nyKunde;
    }

    public void bestillKake(int kundeId, String typeKake, LocalDateTime bestillingsTidspunkt) {
        Kunde aktuellKunde = getKundeMedId(kundeId);

        if (aktuellKunde == null) {
            System.out.println("Kunde finnes ikke");
            return;
        }
        
        BestiltKake nyBestiltKake = new BestiltKake(aktuellKunde, typeKake, 
                                                bestillingsTidspunkt);

        aktuellKunde.leggTilBestiltKake(nyBestiltKake);
        
    }

    public void leverKake(int kundeId, String typeKake, LocalDateTime tidspunktLevert) {
        Kunde aktuellKunde = getKundeMedId(kundeId);

        if (aktuellKunde == null) {
            System.out.println("Kunde finnes ikke");
            return;
        }

        BestiltKake aktuellKake = getTypeKake(kundeId, typeKake);
        LevertKake nyLevertKake = new LevertKake(getKundeMedId(kundeId), typeKake, aktuellKake.getTidspunktBestilt(), tidspunktLevert);

        aktuellKunde.leggTilLevertKake(nyLevertKake);
    }

    public Kunde getKundeMedId(int kundeId) {
        Kunde aktuellKunde = null;

        for (Kunde k : kunder) {
            if (kundeId == k.getId()) {
                aktuellKunde = k;
            }
        }
        
        return aktuellKunde;
    }

    public BestiltKake getTypeKake(int kundeId, String typeKake) {
        Kunde aktuellKunde = getKundeMedId(kundeId);
        BestiltKake aktuellKake = null;

        for (BestiltKake k : aktuellKunde.getBestilteKaker()) {
            if (k.getTypeKake().equals(typeKake)) {
                aktuellKake = k;
            }
        }

        return aktuellKake;
    }

    public ArrayList<Kunde> getSortertKundeListe() {
        ArrayList<Kunde> sortertKundeListe = (ArrayList<Kunde>)kunder.clone();

        Collections.sort(sortertKundeListe);

        return sortertKundeListe;
    }

    public long getLengsteLeveringsTid() {
        long lengsteLeveringsTid = 0;

        for (Kunde k : kunder) {
            for (LevertKake lk : k.getLeverteKaker()) {
                long leveringsTid = Duration.between(lk.getTidspunktBestilt(), lk.getTidspunktLevert()).toMillis();
                if (leveringsTid > lengsteLeveringsTid) {
                    lengsteLeveringsTid = leveringsTid;
                }
            }
        }

        return lengsteLeveringsTid;
    }
}