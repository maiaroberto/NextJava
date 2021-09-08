
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos - for e while
* uri1157 	Divisores I
*/
import java.util.Scanner;

public class uri1157 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
