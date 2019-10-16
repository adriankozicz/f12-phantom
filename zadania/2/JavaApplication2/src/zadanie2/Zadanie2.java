/*
 * Blah Blah Blah
 * Zadanie 3 z prezentacji
 * 
 */
package zadanie2;
import java.util.Scanner;
/**
 *
 * @author adex1
 */
public class Zadanie2 {

    public static void main(String[] args) {
         
        double a,b,c;
        Scanner wczyt = new Scanner (System.in); //tworzymy nowy Scanner i nazywamy go wczytem, korzysta on z systemowego odczytu rzeczy(System.in)
        a = wczyt.nextDouble();
        b = wczyt.nextDouble();
        c = wczyt.nextDouble();
        
        System.out.println((a+b)*c);
        System.out.println(a-b/c);
        
        a++;
        b++;
        c++;
        
        boolean d = (a +b) > c;
        System.out.println(d);
        d = a==b;
        System.out.println(d);
    }
    
}
