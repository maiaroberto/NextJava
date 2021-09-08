/**
 * @author Roberto Maia
 * @category NExT - Imersão Java
 * @aula 01 de 30/08/2021 
 * @class fatorial
 */
import java.util.Scanner;

public class uri1002 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int x = a + b;
        System.out.println("SOMA = "+ x);
        input.close();
    }
}
