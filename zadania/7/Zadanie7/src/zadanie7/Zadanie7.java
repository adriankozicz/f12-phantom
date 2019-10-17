/*
 * Blah Blah Blah
 * 
 * Zadanie 7 - silnia
 */
package zadanie7;
import java.util.Scanner;

/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie7 {

    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);
        int a = wczyt.nextInt();
        int i = 0;
        int wynik = 1; //daje 1, bo 0*cokolwiek to 0
        
        //czym jest silnia? silnia to wynik mnozenia poprzednich cyfr, niezaleznie czy od 1 czy od końcowej liczby
        
        for (i=1; i<=a; i++){
            wynik *= i; //od razu mnożę wynik o i, tak jak dodajemy albo odejmujemy
         }
        System.out.println(wynik);
        
        i = 1;
        wynik = 1;
        
        while(i<=a){
            wynik *= i;
            i++;
        }
        System.out.println(wynik);
        
         i = 1;
        wynik = 1;
        
        do{
            wynik *= i;
            i++;
        }
        while(i<=a);
        System.out.println(wynik);
        
        wynik = 1;
        
        for (i=a; i>1; i--){ //tym razem będziemy schodzili do tyłu, w końcu silnia(3) to albo 1*2*3 albo 3*2*1, możemy nawet pokusić się o ścięcie o ostatni stopień, w końcu po co zawsze *1
            //ale co, jeżeli silnia(1)?
            wynik *= i; //od razu mnożę wynik o i, tak jak dodajemy albo odejmujemy
         }
        System.out.println(wynik);
    }
    
}
