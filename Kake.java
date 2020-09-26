import java.time.LocalDate;
import java.time.LocalDateTime;

class Kake {
    private Kunde kunde;
    private String typeKake;
    private LocalDateTime tidspunktBestilt;

    public Kake(Kunde kunde, String typeKake, LocalDateTime tidspunktBestilt) {
        this.kunde = kunde;
        this.typeKake = typeKake;
        this.tidspunktBestilt = tidspunktBestilt;
    }

    public Kunde getKunde() {
        return this.kunde;
    }

    public String getTypeKake() {
        return this.typeKake;
    }

    public LocalDateTime getTidspunktBestilt() {
        return this.tidspunktBestilt;
    }
}