
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case
* uri1050 DDD
*/
import java.util.Scanner;

public class uri1050 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] ddd = { 61, 71, 11, 21, 32, 19, 27, 31 };
        String[] dest = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria",
                "Belo Horizonte" };

        int num = input.nextInt();
        boolean naoEncontrado = true;
        for (int i = 0; i < ddd.length; i++) {

            if (ddd[i] == num) {
                System.out.println(dest[i]);
                naoEncontrado = false;
                break;
            }
        }
        if (naoEncontrado) {
            System.out.println("DDD nao cadastrado");
        }
        input.close();
    }
}
