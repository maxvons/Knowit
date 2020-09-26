import java.util.ArrayList;

public class Kunde implements Comparable {
    private int id;
    private String navn;
    private ArrayList<BestiltKake> bestilteKaker = new ArrayList<>();
    private ArrayList<LevertKake> leverteKaker = new ArrayList<>();

    public Kunde(int id, String navn) {
                    this.id = id;
                    this.navn = navn;
    }

    public int getId() {
        return this.id;
    }

    public String getNavn() {
        return this.navn;
    }

    public ArrayList<BestiltKake> getBestilteKaker() {
        return this.bestilteKaker;
    }

    public ArrayList<LevertKake> getLeverteKaker() {
        return this.leverteKaker;
    }

    public void leggTilBestiltKake(BestiltKake kake) {
        this.bestilteKaker.add(kake);
    }

    public void leggTilLevertKake(LevertKake kake) {
        this.leverteKaker.add(kake);
    }

    @Override
    public int compareTo(Kunde k) {
        return this.getNavn().compareTo(k.getNavn());
    }
}