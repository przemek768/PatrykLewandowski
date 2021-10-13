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
        float suma_wb = 1;
        for(int i = 0; i < a; i++){
            System.out.println("Podaj wyraz ciągu" + "\n");
            wb = scan.nextFloat();
            suma_wb = suma_wb + Math.abs(wb);
            System.out.println("\n" + suma_wb + "\n");
        }

        System.out.println("Pierwiastki arytmetyczny" + "\n");
        double pierar = 0;
        double suma_pierar = 0;
        for(int i =0; i < a; i++){
            System.out.println("Podaj wyraz ciagu" + "\n");
            pierar = scan.nextFloat();
            suma_pierar = suma_pierar + Math.sqrt(pierar);
            System.out.println("\n" + suma_pierar + "\n");
        }

        System.out.println("Wartość bezwględna z mnozenia");
        float wb_razy = 0;
        float suma_wb_razy = 1;
        for(int i = 0; i < a; i++){
            System.out.println("Podaj wyraz ciągu" + "\n");
            wb_razy = scan.nextFloat();
            suma_wb_razy = suma_wb_razy * Math.abs(wb_razy);
            System.out.println("\n" + suma_wb_razy + "\n");
        }

        double suma_k = 0;
        double k = 0;
        System.out.println("Ciag arytmetyczny");
        for(int i = 0; i < a; i++){
            System.out.println("Podaj wyraz ciągu" + "\n");
            k = scan.nextFloat();
            suma_k= Math.pow(suma_k+k, 2);
            System.out.print("\n" + suma_k + "\n");
        }

    }
}
