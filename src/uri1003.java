
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1003 Soma Simples
 */
import java.util.Scanner;

public class uri1003 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;
        System.out.println("SOMA = " + x);
        input.close();
    }
}
