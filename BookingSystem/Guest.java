//Ignorer Fil
//Denne Classe bliver ikke brugt til noget og var bare ekstra til noget andet jeg ville tilføje.
public class Guest {
    private String guestID;
    private boolean guestTicket;

    public Guest(String guestID, boolean guestTicket) {
        this.guestID = guestID;
        this.guestTicket = guestTicket;
    }
    public void setGuestID(String guestID){
        this.guestID = guestID;
    }
}
