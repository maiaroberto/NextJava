
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1005 Média 2
 */
import java.util.Scanner;

public class uri1006 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf("MEDIA = %,.1f\n", x);
        input.close();
    }
}
