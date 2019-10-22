package zadanie11;
import java.util.Scanner;
import static java.lang.Math.*;
/**
 *
 * @author Adrian Kozicz
 */
public class Zadanie11 {

    public static void main(String[] args) {
        Scanner wczyt = new Scanner(System.in);
        int limit = wczyt.nextInt();
        double s = 0;
        double podst= 0;
        while(podst<=limit){
            podst = pow(2,s);
            {
                if(podst>limit){ //kiedy przekroczymy limit, czyli przykładowo 77, a wynikiem dla podst będzie 128, przerwij i nie pokazuj 128
                    break;
                }
            }
            s++;
            System.out.println(podst); //pokaż obecną potęgę
        }
    }
    
}
