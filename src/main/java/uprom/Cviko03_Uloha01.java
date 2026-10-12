package uprom;

import java.util.Scanner;

public class Cviko03_Uloha01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uveďte hrubou mzdu v uplynulém měsíci: ");
        double hrubaMzda = scanner.nextDouble();

        // Doplň program tak, aby z hrubé mzdy a dalších informací vypočetl základ daně z příjmu.
        // Základ daně je hrubá mzda po odečtení těchto (nezdanitelných) výdajů:
        // - Zaplacené úroky z hypoték a pojistné na životním pojištění
        // - Náklady na darování krve (3000 Kč za každý odběr)
        System.out.println("Uveďte zaplacené úroky: ");
        double uroky = scanner.nextDouble();
        System.out.println("Uveďte kolikrát jste daroval krev: ");
        int krev = scanner.nextInt();

        System.out.println("Základ daně z příjmu je: ");
        System.out.println( hrubaMzda - uroky - krev*3000 );
        System.out.println( hrubaMzda - (uroky + krev*3000) );
    }
}
