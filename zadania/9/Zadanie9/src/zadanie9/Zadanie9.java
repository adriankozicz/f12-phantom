/*
 * Zadanie 9
 * 
 * 
 */
package zadanie9;
import java.util.Scanner;
/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie9 {

    public static void main(String[] args) {
       Scanner wczyt = new Scanner(System.in);
       int a = wczyt.nextInt();
       int b = wczyt.nextInt();
       int c = wczyt.nextInt();
       int delta = (b*b)- (4*a*c);
       
       if (a==0){
           System.out.println("To nie jest miłe");
       }
       else{
           if (delta>0){
               System.out.println("Dodatnia delta cieszy");
               System.out.println("Żołnierzy Trzeciej Rzeszy");
               
               System.out.println("X1: "+(-b-delta)/(2*a));
               System.out.println("X2: "+(-b+delta)/(2*a));
           }
           if(delta==0){
               System.out.println("X: "+(-b/(2*a)));
           }
           if (delta<0){
               System.out.println("Fuhrer jest zawiedziony");
           }
       }
    }
    
}
