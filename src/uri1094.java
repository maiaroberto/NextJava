
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1094 Experiências 
 */
import java.util.Scanner;

public class uri1094 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] cobaia = { 'S', 'R', 'C' };
        double[] total = new double[3];
        int nTotal = 0;
        for (int i = 0; i < n; i++) {
            double qtd = sc.nextInt();
            char cob = sc.next().charAt(0);
            nTotal += qtd;
            for (int j = 0; j < 3; j++) {
                if (cobaia[j] == cob)
                    total[j] += qtd;
            }
        }
        System.out.println("Total: " + nTotal + " cobaias");

        System.out.println("Total de coelhos: " + String.format("%.0f", total[2]));
        System.out.println("Total de ratos: " + String.format("%.0f", total[1]));
        System.out.println("Total de sapos: " + String.format("%.0f", total[0]));

        double pc = (total[2] * 100) / nTotal;
        double pr = (total[1] * 100) / nTotal;
        double ps = (total[0] * 100) / nTotal;

        System.out.println("Percentual de coelhos: " + String.format("%.2f", pc).replaceAll(",", ".") + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", pr).replaceAll(",", ".") + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", ps).replaceAll(",", ".") + " %");

        sc.close();
    }
}
