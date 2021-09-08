
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1005 Média 1
 */
import java.util.Scanner;

public class uri1005 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double x = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %,.5f\n", x);
        input.close();
    }
}
