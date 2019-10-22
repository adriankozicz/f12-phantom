package zadanie13;

import java.util.Scanner;
/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie13 {
    
    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);

        int x2 = wczyt.nextInt();
        int a = wczyt.nextInt();
        int y2 = wczyt.nextInt();
        int b = wczyt.nextInt();
        var zn = wczyt.nextLine();
        int y1 = 0;
        int b1 = x2 + b;
        int x1 = 0;
        
        while (a<(y2+a)){
            while(y1<y2){
                System.out.println("");
                y1++;
            }
            while(x1<x2){
                System.out.print("");
                x1++;
            }
            while(b<=b1){
                System.out.print(zn);
            }
            System.out.println("");
        }
        
    }
    
}
