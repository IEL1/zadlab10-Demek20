
import java.util.Random;

public class Zad4Wyjatki
{
    public static void main(String[] args)
    {
        int liczba1;
        int liczba2;
        int iloscWyjatkow = 0;
        double wynik = 0;
        boolean wylacz = false;
        Random losujLiczbe = new Random();
 
        //-10 do 10
        //(upperbound - lowerbound) + lowerbound;
        while(wylacz!=true)
        {
            if(iloscWyjatkow>=3)
            {
                wylacz=true;
            }
            else
            {
                liczba1 = losujLiczbe.nextInt(10-(-10))+-10;
                liczba2 = losujLiczbe.nextInt(10-(-10))+-10;
                System.out.print("\n"+liczba1 + " / " + liczba2 + " = ");
 
                try
                {
                    wynik = liczba1/liczba2;
                    System.out.print(wynik);
                }
                catch(ArithmeticException e)
                {
                    e.printStackTrace();
                    iloscWyjatkow++;
                }
            }
        }
    }
}