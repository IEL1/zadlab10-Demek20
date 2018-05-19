package pl.edu.ur.oopl10;

//author Szymon Bronski

import java.util.Scanner;

public class Main extends java.lang.Exception{
    
    

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int dzielna = scanner.nextInt();
        int dzielnik = scanner.nextInt();
        
       
        try {
            
            int wynik = dzielna / dzielnik;
            System.out.println("Niemożliwe !!!");
        } 
        catch (ArithmeticException e) {
            System.out.print("Niepoprawna dzielna");
        
            
        }
        
    }
    }
    

