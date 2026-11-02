package uprom;

public class Cviko06_Bonus1
{
    public static void main(String[] args)
    {
        String s1="AHOJ";
        String s2="HEJ";
        String s3="AHA";

        if(s1.length() < s2.length() && s1.length() < s3.length() ){
            System.out.println(s1);
        }
        else {
            if (s2.length() < s3.length()) {
                System.out.println(s2);
            } else {
                System.out.println(s3);
            }
        }
    }
}
