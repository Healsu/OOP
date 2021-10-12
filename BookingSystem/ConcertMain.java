import java.util.Scanner;
public class ConcertMain {
    public static void main(String[] args) {

        Band killers = new Band("Killers","RockAndRoll",3);
        Arrangement KillerPerformance = new Arrangement("November","December","Nørreport",300);
        Kontrakt contractKillers = new Kontrakt("Nordic INC",true,KillerPerformance,killers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What date would you like the band to start playing in? ");
        KillerPerformance.setStartDate(scanner.nextLine());

        System.out.println("What date would you like the band to end on? ");
        KillerPerformance.setEndDate(scanner.nextLine());

        System.out.println("Where would you like them to play at? ");
        KillerPerformance.setLocation(scanner.nextLine());

        System.out.println("How much do you want to pay the band per song? ");
        KillerPerformance.setPerSongSalary(scanner.nextInt());

        System.out.println("The Current Band Information Is: ");
        System.out.println(KillerPerformance);


    }
}
