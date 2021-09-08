
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1170 Blobs
*/
import java.util.Scanner;

public class uri1170 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] saida = new String[n];

        for (int x = 1; x <= n; x++) {
            int somaDias = 0;
            double suprimentoDia = input.nextDouble();
            while (suprimentoDia > 1) {
                suprimentoDia -= suprimentoDia * 0.5;
                somaDias++;
            }
            saida[x - 1] = somaDias + " dias";
        }

        for (int y = 0; y < n; y++) {
            System.out.println(saida[y]);
        }
        input.close();
    }
}
