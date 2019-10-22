package zadanie12;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie12 {

    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);
        int liczba = wczyt.nextInt();
        Random r = new Random();
        int zgad = r.nextInt(100)+1;
        System.out.println(zgad);
        while (liczba != zgad){  //użyjemy pętli while, bo jest najlepszą opcją na ciągłe działanie
            if (liczba > zgad){
                System.out.println("Za wysoko, niżej");
            }
            if (liczba < zgad){
                System.out.println("Jeszcze wyżej, jeszcze musisz");
            }
            liczba = wczyt.nextInt();
        } //ponieważ i tka liczbę trzeba trafić, po co łapać warunek dla złapanej wartości tutaj? przecież sam while to rozwiąże i wyjdzie z pętli
        System.out.println("Nie za wysoko, nie za nisko, pryma sort"); //a skoro wyszedł z pętli, to jest dobrą wartością
         }
        }
   
    
