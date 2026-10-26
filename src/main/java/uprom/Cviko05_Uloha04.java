package uprom;

import java.util.Scanner;

public class Cviko05_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String vstup;
        do {
            vstup = scanner.nextLine();
            System.out.println( vstup.length() );
        } while (!vstup.equals("KONEC"));
        System.out.println("Cyklus skončil");


        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat na konzoli délku tohoto řetězce.
        //  Pokud bylo zadáno "KONEC", ukončit program.
        //  Zvolte způsob bez použití "break"
    }
}
