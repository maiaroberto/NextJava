
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case
* uri1035 Teste de Seleção
 */
import java.util.Scanner;

public class uri1035 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    int d = input.nextInt();

    if ((b > c) && (d > a) && ((c + d) > (a + b)) && ((c >= 0) && (d >= 0)) && (a % 2 == 0)) {
      System.out.println("Valores aceitos");
    } else {
      System.out.println("Valores nao aceitos");
    }

    input.close();
  }
}
