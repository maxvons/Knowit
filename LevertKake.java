import java.time.LocalDateTime;

public class LevertKake extends Kake {
    private LocalDateTime tidspunktLevert;

    public LevertKake(Kunde kunde, String typeKake, LocalDateTime tidspunktBestilt,
                        LocalDateTime tidspunktLevert) {
                            super(kunde, typeKake, tidspunktBestilt);
                            this.tidspunktLevert = tidspunktLevert;
    }

    public LocalDateTime getTidspunktLevert() {
        return this.tidspunktLevert;
    }
}
