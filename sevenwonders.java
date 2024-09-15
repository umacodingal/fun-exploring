import java.util.Scanner;

public class sevenwonders {
    public static void main(String args[]) {

        String wonders[] = { "CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL",
                "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM" };

        String locations[] = { "MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN",
                "ITALY" };

        Scanner in = new Scanner(System.in);
        System.out.print("Enter country: ");
        String c = in.nextLine();
        int i;

        for (i = 0; i < locations.length; i++) {
            if (locations[i].equals(c)) {
                System.out.println(locations[i] + " - " + wonders[i]);
                break;
            }
        }

        if (i == locations.length)
            System.out.println("Sorry Not Found!");
    }
}