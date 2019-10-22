/*
 * 
 * <B>apież
 * 
 */
package zadanie10;
import java.util.Scanner;
/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie10 {

    public static void main(String[] args) {
       Scanner wczyt = new Scanner(System.in);
       int a = wczyt.nextInt();
       int b = wczyt.nextInt();
       int kopia = a;
       int suma = 0;
       while(a<=b){
           suma+=a;
           a++;
       }
       System.out.println(suma);
       suma = 0;
       a = kopia;
       
       do{
           suma+=a;
           a++;
       }while(a<=b);
       
       System.out.println(suma);
       suma = 0; //tym razem nie przypisuję a wartości z kopii, bo przypiszę w instrukcjach pętli
       
       for (a=kopia; a<=b; a++){
           suma+=a;
       }
       System.out.println(suma);
    }
    
}
