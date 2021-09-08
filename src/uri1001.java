/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case / Fundamentos - for e while
* uri1001 Extremamente Básico 
 */
import java.util.Scanner;

public class uri1001 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;
        System.out.println("X = " + x);
        input.close();
    }
}
