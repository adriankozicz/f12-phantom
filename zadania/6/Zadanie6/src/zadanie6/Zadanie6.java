/*
 * Blah Blah Blah
 * 
 * Zadanie 6
 */
package zadanie6;
import java.util.Scanner;

/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie6 {

    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);
        int liczba = wczyt.nextInt();
        int i = 0;
        
        for (i=0; i<=liczba; i++){ //tutaj robię coś dziwnego, bo od liczby odejmuję kolejne liczniki, spełnia robotę, ale nie jest najlepszą opcją
            System.out.println("Paka wybuchnie za "+(liczba-i));
        }
        
        i=liczba; //przypisuję wartość i wartości liczby, by nie psuć zmiennej, która jest tak ważna dla mnie
        
        while(i>=0){
            System.out.println("Bomba wybuchnie za " +i);
            i--; //zmniejszam i samodzielnie, bo while nie ma własnej funkcji modyfikującej licznik
        }
        
         i=liczba;
         
         do{
             System.out.println("Bombka wybuchnie za " +(i));
            i--;
         }
         while(i>=0); //tutaj tego nie widać niestety, ale do while to +1 krok, bo pierwszy robi się niezależnie od sytuacji
         
         i=0;
         
         do{
             System.out.println("Bombka wybuchnie za " +(liczba-i));
            i--;
         }
         while(i>0); //tutaj już to widać, choć nie spełniamy warunku, do pętli weszliśmy, czyli mieliśmy darmowy przejazd
    }
    
}
