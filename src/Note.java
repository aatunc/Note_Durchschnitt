import java.util.Scanner;

public class Note {

    public static void(String[] args) {
        int Turkisch, Mathe, Naturwiessenschaften, sport;
        double durchschnitt=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Turkisch Note geben Sie  ein : ");
        Turkisch = scan.nextInt();
        System.out.print("\n Mathe Note geben Sie ein : ");
        Mathe = scan.nextInt();
        System.out.print("\n Naturwiessenschaften Note geben Sie ein : ");
        Naturwiessenschaften = scan.nextInt();
        System.out.print("\n Sport Note geben Sie ein : ");
        sport= scan.nextInt();
        durchschnitt = (Turkisch+Mathe+Naturwiessenschaften+sport) /4;
        if(durchschnitt < 50) {
            System.out.print("Sie sind nicht Erfolgreich");
        }else {
            System.out.println("Gratuliert!");

        }
        System.out.println("Classe Durchschnitt : " + durchschnitt);
    }
}

