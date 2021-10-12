public class Kontrakt{
    private String contractProvider;
    private boolean contractGOT;
    //private String contractReciever;
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
