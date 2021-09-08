
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos if/else e switch/case
 * uri1051 Imposto de Renda 
 */
import java.util.Scanner;

public class uri1051 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario = input.nextDouble();
        double imposto = 0.0;
        if (salario <= 2000) {
            System.out.println("Isento");
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
            System.out.println("R$ " + String.format("%.2f", imposto).replaceAll(",", "."));
        } else if (salario <= 4500) {
            imposto = ((salario - 3000) * 0.18) + 80;
            System.out.println("R$ " + String.format("%.2f", imposto).replaceAll(",", "."));
        } else {
            imposto = ((salario - 4500) * 0.28) + 350;
            System.out.println("R$ " + String.format("%.2f", imposto).replaceAll(",", "."));
        }

        input.close();
    }
}
