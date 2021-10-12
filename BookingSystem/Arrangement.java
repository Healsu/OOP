public class Arrangement {
    private String startDate;
    private String endDate;
    private String location;
    private int perSongSalary;

    public Arrangement(String startDate, String endDate, String location, int perSongSalary ) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.perSongSalary = perSongSalary;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public int getPerSongSalary() {
        return perSongSalary;
    }

    public void setPerSongSalary(int perSongSalary) {
        this.perSongSalary = perSongSalary;
    }

    @Override
    public String toString() {
        return "Arrangement{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", location='" + location + '\'' +
                ", perSongSalary=" + perSongSalary +
                '}';
    }
}
