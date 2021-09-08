
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1116 Dividindo X por Y
 */
import java.util.Scanner;

public class uri1116 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] saida = new String[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                saida[i] = "divisao impossivel";
            } else if (a == 0) {
                saida[i] = "0.0";
            } else {
                double c = (double) a / (double) b;
                saida[i] = String.format("%.1f", c);
            }

        }
        for (int x = 0; x < n; x++) {
            System.out.println(saida[x]);
        }

        sc.close();
    }
}
