package uprom;

import java.util.Scanner;

public class Cviko04_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String vstup = scanner.nextLine();
            System.out.println( vstup.length() );
            if(vstup.equals("KONEC")){
                break;
            }
        }
        System.out.println("Cyklus skončil");
        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat na konzoli délku tohoto řetězce.
        //  Pokud bylo zadáno "KONEC", ukončit program
    }
}
