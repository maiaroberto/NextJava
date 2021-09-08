
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1165 Número Primo
*/
import java.util.Scanner;

public class uri1165 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] saida = new String[n];

        for (int x = 1; x <= n; x++) {
            int soma = 0;
            int lido = input.nextInt();

            for (int i = 2; i < lido; i++) {
                if ((lido % i) == 0) {
                    soma++;
                }
            }
            if (soma > 0) {
                saida[x-1] = lido + " nao eh primo";
            }
            else {
                saida[x-1] = lido + " eh primo";   
            }
        }
        for (int y = 0; y < n; y++) {
            System.out.println(saida[y]);
        }
        input.close();
    }
}
