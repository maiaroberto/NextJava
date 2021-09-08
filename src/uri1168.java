
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1168 LED
*/
import java.util.Scanner;

public class uri1168 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String[] saida = new String[n];
        int[] leds = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

        for (int x = 1; x <= n; x++) {
            int soma = 0;
            String myString = input.next();

            char[] chars = myString.toCharArray();

            for (char ch : chars) {
                int myInt = Character.getNumericValue(ch);
                soma += leds[myInt];
            }

            saida[x - 1] = soma + " leds";

        }
        for (int y = 0; y < n; y++) {
            System.out.println(saida[y]);
        }
        input.close();
    }
}
