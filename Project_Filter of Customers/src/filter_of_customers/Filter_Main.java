package filter_of_customers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Filter_Main implements Welcome {
    public static  void main(String[] args) throws FileNotFoundException {

        /**
         * Nacitanie Zoznamu zakaznikov z csv suboru & spojenie s Objektom triedy Scanner
         * Priprava na Interakciu s uzivatelom
         */

        FileReader zdroj = new FileReader("Zoznam Zakaznikov.csv");

        Scanner citacka = new Scanner(zdroj);
        Scanner vstupodUzivatela = new Scanner(System.in);

        /**
         * Pripraveny csv subor si skonvertujeme na ArrayList a dalej budeme pracovat s nim
         */
        ArrayList<String> zoznamZakaznikov = new ArrayList<>();

        while (citacka.hasNextLine()) {
            String riadok = citacka.nextLine();
            zoznamZakaznikov.add(riadok);
        }

        /**
         * Zobrazime si Nefiltrovany zoznam zakaznikov & pocet zaznamov v nom
         */
        zoznamZakaznikov.forEach((String element) -> System.out.println(element));
        System.out.println("Pocet Zaznamov: " + zoznamZakaznikov.size());


        /**
         * HLAVNA FUNKCIONALITA PROGRAMU, po vybrati volby nam Appka vyfiltruje zelany zoznam zakaznikov,
         * aj s poradovym cislom zakaznika  vo vo vyfiltrovanom zozname|| ukonci aplikaciu ||
         * da echo o nespravnom uzivatelskom vstupe
         * Moznosti: 1 - zakaznici, ktori maju hlasovy pausal; 2 - zakaznici, ktori maju Internet;
         * 3 - zakaznici, ktori maju platbu na fakturu; 4 - zakaznici, ktori maju mobilne cislo;
         * 5 - ukoncenie aplikacie; ine ciselne volby ako 12345 - nespravny uzivatelsky vstup
         *
         */

        while (true) {
            int pocitadlo = 0;
            Welcome.zobrazUvitacieMenu();
            int volba = vstupodUzivatela.nextInt();



            if (volba == 1) {
                for (String zaznam : zoznamZakaznikov) {

                    if (zaznam.contains("hlas")) {
                        pocitadlo++;
                        System.out.println(zaznam);
                        System.out.println("Zakaznik c. " + pocitadlo);


                    }
                }
            }

            else if (volba == 2) {
                for (String zaznam : zoznamZakaznikov) {

                    if (zaznam.contains("internet")) {
                        pocitadlo++;
                        System.out.println(zaznam);
                        System.out.println("Zakaznik c. " + pocitadlo);


                    }
                }
            }
            else if (volba == 3) {
                for (String zaznam : zoznamZakaznikov) {

                    if (zaznam.contains("-")) {
                        pocitadlo++;
                        System.out.println(zaznam);
                        System.out.println("Zakaznik c. " + pocitadlo);


                    }
                }
            }

            else if (volba == 4) {
                for (String zaznam : zoznamZakaznikov) {

                    if (zaznam.contains("09")) {
                        pocitadlo++;
                        System.out.println(zaznam);
                        System.out.println("Zakaznik c. " + pocitadlo);


                    }
                }
            }

            else if (volba == 5) {
                System.out.println("-> Ukoncujem Aplikaciu <-");
                break;
            }

            else {
                System.out.println("-> Nespravny Uzivatelsky Vstup <-");
            }
        }








    }



}
