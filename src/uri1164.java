
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1164 Número Perfeito
*/
import java.util.Scanner;

public class uri1164 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] saida = new String[n];

        for (int x = 1; x <= n; x++) {
            int soma = 0;
            int lido = input.nextInt();

            for (int i = 1; i < lido; i++) {
                if ((lido % i) == 0) {
                    soma += i;
                }
            }
            if (soma > 2) {
                saida[x - 1] = lido + " eh perfeito";
            } else {
                saida[x - 1] = lido + " nao eh perfeito";
            }
        }
        for (int y = 0; y < n; y++) {
            System.out.println(saida[y]);
        }
        input.close();
    }
}
