
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1008 Salário
 */
import java.util.Scanner;

public class uri1008 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();
        int horas = input.nextInt();
        double valHora = input.nextDouble();
        double salary = horas * valHora;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary));

        input.close();
    }
}
