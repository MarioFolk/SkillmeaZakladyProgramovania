import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String Mario;



    public static void main(String[] args) {
        /*
        TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
         to see how IntelliJ IDEA suggests fixing it.
        String pozdrav = "Ahoj svet";
         String meno = "praje Mario";
         meno = pozdrav;
         pozdrav = "Toto je novy text";
         String pozdrav;
         pozdrav = "Ahoj svet";
         System.out.println(pozdrav + " " + meno);
         System.out.println(pozdrav);
         System.out.println(pozdrav);
        */


        /* Kalkulacka
        int prveCislo = 10;
        int druheCislo = 5;

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);

        boolean pravdaNepravda = false;
        float prveDesCislo = 0.1f;
        float druheDesCislo = 0.2f;

        System.out.println(prveDesCislo + druheDesCislo);

        /* final konstanta sa uz nemoze dalej prepisovat
        double prveCislo = 5;
        final double druheCislo = 10;
        druheCislo = 40;

        //boolean pravdaNepravda = false;

        float prveDesCislo = 0.1f;
        String druheCislo = "2";
        System.out.println(prveDesCislo + druheCislo); */


        /* Scanner
        System.out.println("Ahoj, zadaj meno:");
        Scanner mojScanner = new Scanner(System.in);
        String meno = mojScanner.nextLine();
        System.out.println("Prajem pekny den " + meno); */


        /* Vylepsena kalkulacka
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj prve cislo:");
        int prveCislo = mojScanner.nextInt();
        System.out.println("Zadaj druhe cislo:");
        int druheCislo = mojScanner.nextInt();

        System.out.println(prveCislo + druheCislo);
        System.out.println(prveCislo - druheCislo);
        System.out.println(prveCislo * druheCislo);
        System.out.println(prveCislo / druheCislo);
        System.out.println(prveCislo % druheCislo); */


        /* String metody
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj text:");
        String mojText = mojScanner.nextLine();

        System.out.println(mojText.length()); */


        // Parsovanie
        String textCislo = "55";
        int prevedeneCislo = Integer.parseInt(textCislo);
        System.out.println(prevedeneCislo + 5);

        /* Operatory - Logicke
        int x = 10;
        int y = 9;
        int z = 12;
        System.out.println(x == y);
        System.out.println(x > y);
        System.out.println(x < y);

        //&& - AND vsetky podmienky pravda
        System.out.println(x > y && z > x);
        System.out.println(x > y && z > x && z > y);

        //|| - OR aspon jedna podmienka pravda
        System.out.println(x > y || z > x);
        System.out.println(x > y || z > x || z > y);
        System.out.println(x > y || z < x || z > y && z > y);

        // ! - NOT
        System.out.println(!(x > y || z < x));
        System.out.println(!(x > y || z < x) && y > z); */
    }
}


