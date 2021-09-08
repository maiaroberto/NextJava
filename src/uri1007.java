/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1007 Diferença
 */
import java.util.Scanner;

public class uri1007 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        int x = (a * b) - (c * d);
        
        System.out.println("DIFERENCA = " + x);

        input.close();
    }
}
