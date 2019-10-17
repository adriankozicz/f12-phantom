/*
 * Blah Blah Blah
 * 
 * Zadanie 5
 */
package zadanie5;
import java.util.Scanner;

/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie5 {

    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);
        String imie = wczyt.nextLine();
        
        switch(imie){ //zmieniamy w zależności od imienia, jeżeli to Jan, to spoko, jak Paweł to też, ale Karola nie znamy
            case "Jan":
                System.out.println("Gitara siema");
                break;
            case "Pawel":
                System.out.println("xDDDDDD");
                break;
            default:
                System.out.println("A kim ty kurwa jesteś");
        }
    
    }
}