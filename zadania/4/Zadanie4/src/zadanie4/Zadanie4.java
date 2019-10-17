/*
 * Blah Blah Blah
 * 
 * Zadanie 4
 */
package zadanie4;

import java.util.Scanner;

/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie4 {

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        int a = odczyt.nextInt();
        int b = odczyt.nextInt();
        
        boolean c = a>b; //od razu pytam o sprawdzeniie jednej wielkosci, wtedy jeden if i jeden else wystarczy, w innej sytuacji, musze sprawdzic wiecej informacji
        
        if (c==true)
            System.out.println("A wieksze");
         else
            System.out.println("B wieksze");
    }
    
}
