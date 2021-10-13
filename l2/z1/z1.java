import java.util.Scanner;
import static java.lang.Math.*;
public class z1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scan.nextInt();
        float suma = 0;
        float n = 0;
        System.out.println("Ciag arytmetyczny");
        for(int i = 0; i < a; i++){
            System.out.println("Podaj wyraz ciągu" + "\n");
            n = scan.nextFloat();
            suma= suma+n;
            System.out.print("\n" + suma + "\n");
        }
        System.out.println("Ciag geometryczny");
        float geo = 0;
        float suma_geo = 1;
        for(int i = 0; i < a; i++){
            System.out.println("Podaj wyraz ciągu" + "\n");
            geo = scan.nextFloat();
            suma_geo = suma_geo*geo;
            System.out.println("\n" + suma_geo + "\n");
        }

        System.out.println("Wartość bezwględna");
        float wb = 0;
        float suma_wb = 0;
        for(int i = 0; i < n; i++){
            
        }

    }
}
