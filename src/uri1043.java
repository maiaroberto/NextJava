
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case
* uri1043 Triângulo
 */
import java.util.Scanner;

public class uri1043 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Double a = input.nextDouble();
        Double b = input.nextDouble();
        Double c = input.nextDouble();

        Double perimetro = 0.0;
        Double area = 0.0;

        if ( (a + b) > c && (a + c) > b && (c + b) > a) {
            perimetro = a + b + c;
            System.out.println("Perimetro = " + String.format("%.1f", perimetro).replaceAll(",", "."));
        } else {
            area = (((a+b) * c) / 2);
            System.out.println("Area = " + String.format("%.1f", area).replaceAll(",", "."));               
        } 
        input.close();
    }
}
