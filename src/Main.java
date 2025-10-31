import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

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


        /* Parsovanie
        String textCislo = "55";
        int prevedeneCislo = Integer.parseInt(textCislo);
        System.out.println(prevedeneCislo + 5); */


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


        /* //Podmienky
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Zadaj vek:");
        int vek = mojScanner.nextInt();
        //Toto rozhoduje o tom ci je uzivatel dospely/neplnolety/senior
        if(vek >= 18) {
            System.out.println("Uzivatel je dospely");
            if(vek >= 65) {
                System.out.println("Uzivatel je senior");
            }
        }
        else if(vek < 18 && vek >= 0){
            System.out.println("Uzivatel je neplnolety");
        }
        else {
            System.out.println("Nemozes zadat zaporny vek"); */


        /* Vypocet BMI hmotnost(kg)/vyska(m) na druhu
        // (<18.5) - podvaha
        // (>=18.5 && <25) - optimalna vaha
        // (>=25) - nadvaha
        float vyska;
        float hmotnost;
        float bmi;
        Scanner mojScanner = new Scanner(System.in);

        System.out.println("Zadaj vysku(m):");
        vyska = mojScanner.nextFloat();
        System.out.println("Zadaj hmotnost(kg):");
        hmotnost = mojScanner.nextFloat();

        bmi = hmotnost/(vyska * vyska);

        if(bmi >= 0 && bmi < 18.5f){
            System.out.println("Utivatel ma podvahu");
        }
        else if(bmi >= 18.5f && bmi < 25){
            System.out.println("Uzivatel ma optimalnu vahu");
        }
        else if(bmi >= 25){
            System.out.println("Uzivatel ma nadvahu");
        }
        else {
            System.out.println("Nemoze sa zadat zaporna hmotnost");
        }
        System.out.println("Vypocitane BMI: " + bmi);*/


        /*Hra kostky licha = vyhravas, suda=prohravas
        int hozeneCislo;
        Random nahodnyGenerator = new Random();
        int origin;
        hozeneCislo = nahodnyGenerator.nextInt(1,7);
        System.out.println("Hozene cislo: " + hozeneCislo);
        if(hozeneCislo % 2 == 1){
            System.out.println("Licha vyhravas");
        }
        else {
            System.out.println("Suda prohravas");*/


        /*Vyber dna
        Scanner mojScanner = new Scanner(System.in);
        int cisloDna;

        System.out.println("Zadaj cislo dna:");
        cisloDna = mojScanner.nextInt();

        switch(cisloDna) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Je pracovny den");
                break;
            case 6:
            case 7:
                System.out.println("Je vikend");
                break;
                default:
                    System.out.println("Neplatne cislo dna");*/


        /*Pole
        int[] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 5;
        znamky[2] = 2;
        znamky[3] = 3;
        znamky[4] = 1;
        int[] znamky = new int[] {3, 5, 2, 3, 1};   //skrateny zapis
        System.out.println(znamky[4]);

        /*String[] menaStudentov = new String[] {"Honza", "Lenka", "Petr", "Katka", "Petra"};
        menaStudentov[3] = "Tereza";
        menaStudentov[3] = menaStudentov[0];

        System.out.println(menaStudentov[2].length());

        int[][] viacDimPole = new int[2][2];
        viacDimPole[0][0] = 83;*/


        /*Smycky
        For
        for(int i = 0; i < 1000; i++) {
            System.out.println(i + "Ahoj svet");*/


        /*Smycky- prechadzanie pola
        String[] menaStudentov = new String[] {"Honza", "Lenka","Petr","Katka","Petra"};
        for(int i = 0; i < 5; i++){
            System.out.println(menaStudentov[i]);*/


        /*String[] menaStudentov = new String[]{"Honza", "Lenka", "Petr", "Katka", "Petra"};
        for (int i = 0; i < menaStudentov.length; i++) {
            System.out.println(menaStudentov[i]);*/


            /*foreach
            String[] menaStudentov = new String[]{"Honza", "Lenka", "Petr", "Katka", "Petra"};
            for (String jednoMeno : menaStudentov) {
                System.out.println(jednoMeno);*/


        /*int[] nasobky = new int[10];
//Naplnenie pola nasobkami 10
        for(int i=0; i<nasobky.length; i++){
            nasobky[i] = 10 * i;

/*Vypis pola nasobkov
        for(int jedenNasobok: nasobky){
            System.out.println(jedenNasobok);*/

/*Smycka while
        int riadiacaPremenna = 0;
        while (riadiacaPremenna < 5) {
            System.out.println(riadiacaPremenna);
            riadiacaPremenna++;*/

/*Smycka while a dowhile
        int riadiacaPremenna = 0;

        while(riadiacaPremenna !=0){
            System.out.println(riadiacaPremenna);
            riadiacaPremenna++;
        }
        do{
            System.out.println(riadiacaPremenna);
            //riadiacaPremenna++;
        }while(riadiacaPremenna!= 0);*/
    }
}
