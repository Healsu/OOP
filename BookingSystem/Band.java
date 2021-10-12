public class Band{
private String bandName;
private String bandGenre;
private int members;


    public Band(String bandName, String bandGenre, int members) {
        this.bandName = bandName;
        this.bandGenre = bandGenre;
        this.members = members;

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandName='" + bandName + '\'' +
                ", bandGenre='" + bandGenre + '\'' +
                ", members=" + members;
    }
}
