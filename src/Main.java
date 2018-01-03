import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sideAB, sideBC, sideCA;

        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        sideAB = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)); //length of sideAB
        sideBC = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y3-y2), 2)); //length of sideBC
        sideCA = Math.sqrt(Math.pow((x1-x3), 2) + Math.pow((y1-y3), 2)); //length of sideCA

        if (Math.pow(sideAB, 2) == Math.pow(sideBC + sideCA, 2) ||
                Math.pow(sideBC, 2) == Math.pow(sideAB + sideCA, 2) ||
                Math.pow(sideCA, 2) == Math.pow(sideAB + sideBC, 2)) {
            System.out.println("This one is a right apex triangle");
        }
        else {
            System.out.println("Not a rigth angle triangle");
        }

        //System.out.println(sideAB +""+ sideBC +""+ sideCA);
        System.out.println("Length of side AB is: " + sideAB);
        System.out.println("Length of side BC is: " + sideBC);
        System.out.println("Length of side CA is: " + sideCA);
    }
}
