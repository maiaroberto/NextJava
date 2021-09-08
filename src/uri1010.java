
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1010 Cálculo Simples
 */
import java.util.Scanner;

public class uri1010 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os valores:");
        double valor = 0;

        for (int x = 0; x < 2; x++) {
            sc.nextInt();
            int b = sc.nextInt();
            double c = sc.nextDouble();
            valor += b * c;
        }
        String asaida = String.format("%.2f", valor).replaceAll(",", ".");
        System.out.println("VALOR A PAGAR: R$ " + asaida);
        sc.close();
    }
}
