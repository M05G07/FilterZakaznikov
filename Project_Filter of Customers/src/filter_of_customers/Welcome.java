package filter_of_customers;

public interface Welcome {
    static void zobrazUvitacieMenu () {
        System.out.println("\n" + "*************************" + "\n" +
                "Vitajte; nacitajte si vybrany Zoznam Zakaznikov:" + "\n"
        );

        System.out.println( " -> Zoznam zakaznikov sluzby Hlasovy Pausal [pouzi volbu 1]");
        System.out.println( " -> Zoznam zakaznikov sluzby Internet [pouzi volbu 2]");
        System.out.println( " -> Zoznam zakaznikov na fakturu [pouzi volbu 3]");
        System.out.println( " -> Zoznam zakaznikov s mobilnym cislom [pouzi volbu 4]");
        System.out.println( " -> Ukonci Aplikaciu [pouzi volbu 5]" + "\n");
        System.out.println("Vasa Volba: ");
    }
}
