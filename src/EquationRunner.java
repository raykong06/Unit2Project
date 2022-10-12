import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        // Instance Variables
        Scanner s = new Scanner(System.in);

        int x1;
        int y1;
        int x2;
        int y2;

        String coord1;
        String coord2;

        String stringX1;
        String stringY1;
        String stringX2;
        String stringY2;

        int indexComma1;
        int indexComma2;

        int lengthCoord1;
        int lengthCoord2;

        double x3;

        // User Input
        System.out.println("Enter the first (x,y) coordinate point: ");
        coord1 = s.nextLine();

        System.out.println("Enter the second (x,y) coordinate point: ");
        coord2 = s.nextLine();

        // Parse Out Values
            // parse x1 value
        indexComma1 = coord1.indexOf(",");
        stringX1 = coord1.substring(1,indexComma1);
        x1 = Integer.parseInt(stringX1);

            // parse y1 value
        lengthCoord1 = coord1.length();
        stringY1 = coord1.substring((indexComma1 + 1),lengthCoord1);
        y1 = Integer.parseInt(stringY1);

            // parse x2 value
        indexComma2 = coord2.indexOf(",");
        stringX2 = coord2.substring(1,indexComma2);
        x2 = Integer.parseInt(stringX2);

        // parse y1 value
        lengthCoord2 = coord2.length();
        stringY2 = coord2.substring((indexComma2 + 1),lengthCoord2);
        y2 = Integer.parseInt(stringY2);

        LinearEquation one = new LinearEquation(7,5,2,2);
        System.out.println(one.toString());
    }
}
