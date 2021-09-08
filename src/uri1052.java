
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos if/else e switch/case
 * uri1052 Mês 
 */
import java.util.Scanner;

public class uri1052 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dddDigitado = input.nextInt();

        String[] cidades = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas",
                "Vitoria", "Belo Horizonte" };
        int[] ddds = { 61, 71, 11, 21, 32, 19, 27, 31 };
        Boolean naoEncontrado = true;
        for (int i = 0; i < ddds.length; i++) {
            if (ddds[i] == dddDigitado) {
                System.out.println(cidades[i]);
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
