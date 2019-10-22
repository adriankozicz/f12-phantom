/*
 * To change this license header, choose License Headers in Project Properties.Blah Blah Blah
 * 
 * Zadanie 8
 */
package zadanie8;
import java.util.Scanner;

/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie8 {

    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);
        int a = wczyt.nextInt();
        int dzielniki = 0;
        int licznik = 1;
        int ilosc = 0;
        while(ilosc<a){
            for (int j=1; j<=licznik;j++){
                if (licznik%j==0){
                    dzielniki++;
                }
            }
            if(dzielniki==2){
                ilosc++;
                System.out.print(licznik);
                }
            licznik++;
            dzielniki = 0;
        }
        System.out.println("");
        licznik = 1;
        ilosc = 0;
        dzielniki = 0;
        
        do{
            for (int j=1; j<=licznik;j++){
                if (licznik%j==0){
                    dzielniki++;
                }
            }
            if(dzielniki==2){
                ilosc++;
                System.out.print(licznik);
                }
            licznik++;
            dzielniki = 0;
        }while(ilosc<a);
    }
}
