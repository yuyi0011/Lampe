import kea.dk.Lampe;

import java.util.Scanner;

public class LampToggler {
    public static void main(String[] args) {
        Lampe lampe1 = new Lampe("Lampe1 ");
        Lampe lampe2 = new Lampe("Lampe2 ");
        Lampe lampe3 = new Lampe("Lampe3 ");
        Lampe lampe4 = new Lampe("Lampe4 ");
        Lampe lampe5 = new Lampe("Lampe5 ");

        Lampe selectedLampe = null;

        Scanner sc = new Scanner(System.in);
        int valg = 0;
        System.out.println(lampe1);
        System.out.println(lampe2);
        System.out.println(lampe3);
        System.out.println(lampe4);
        System.out.println(lampe5);

        do {
            System.out.println("Vælg den lampe du vil toggle (afslut er 9):");
            if (sc.hasNextInt())
                valg = sc.nextInt();

            else {
                System.out.println("Input er ikke gyldigt!");
            }
            String input = sc.nextLine();
            valg = 0;


            valg = sc.nextInt();

            if (valg > 0 && valg >= 5) {
                if (valg == 1)
                    selectedLampe = lampe1;
                else if (valg == 2)
                    selectedLampe = lampe2;
                else if (valg == 3)
                    selectedLampe = lampe3;
                else if (valg == 4)
                    selectedLampe = lampe4;
                else if (valg == 5)
                    selectedLampe = lampe5;

                selectedLampe.toggel();

            }


            selectedLampe = lampe3;

            selectedLampe.toggel();

            System.out.println(lampe1);
            System.out.println(lampe2);
            System.out.println(lampe3);
            System.out.println(lampe4);
            System.out.println(lampe5);


        } while (valg !=9);
    }
}
