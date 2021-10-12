public class Kontrakt{
    private String contractProvider;
    private boolean contractGOT;
    //Her indgår vi 2 Classer som en slags extend for dem. Vi får et object fra både Arrangement og Band
    //som vi bare kalder arrangement og band.
    private Arrangement arrangement;
    private Band band;

    public Kontrakt(String contractProvider, boolean contractGOT,Arrangement arrangement, Band band) {
        this.contractProvider = contractProvider;
        this.contractGOT = contractGOT;
        this.arrangement = arrangement;
        this.band= band;
    }

    @Override
    public String toString() {
        return "Kontrakt{" +
                "contractProvider='" + contractProvider + '\'' +
                ", contractGOT=" + contractGOT +
                ", arrangement=" + arrangement +
                ", band=" + band +
                '}';
    }
}
