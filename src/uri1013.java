
/**
 * @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case
* uri1013 O Maior
 */
import java.util.Scanner;

public class uri1013 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    int maior = Math.max(a, b); //(a + b + Math.abs(a-b)) / 2;
    maior = Math.max(c, maior); // + maior + Math.abs(c-maior)) / 2

    System.out.println(maior + " eh o maior");

    input.close();
  }
}

/*
 * import math
 

a, b, c = list(map(int, input().split()))

maior = int((a + b + abs(a-b)) / 2)
maior = int((c + maior + abs(c-maior)) / 2)
print(f'{maior} eh o maior')


 */