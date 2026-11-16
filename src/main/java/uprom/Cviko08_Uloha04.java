package uprom;

public class Cviko08_Uloha04
{
    public static void main(String[] args)
    {
        /*
        Vytvoř a využij metodu, která
        zjistí, zda číslo A je méně než setinou čísla B
        */
        System.out.println(isMuchSmaller(45,48999));
        System.out.println(isMuchSmaller(450,444999));
    }

    public static boolean isMuchSmaller( float a, float b ){
        if(a < b/100){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isMuchSmaller2( float a, float b ){
        return a < b / 100;
    }
}
