package uprom;

import java.util.Random;
import java.util.Scanner;

public class Cviko05_Uloha01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Random randomGenerator = new Random();
        for (int i=0;i<count;i++){
            System.out.println(randomGenerator.nextInt(1001));
        }
        //	Vypiš "count" náhodných čísel mezi 0 a 1000
    }
}
