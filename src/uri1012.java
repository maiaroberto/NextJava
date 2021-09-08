
/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1012 Área
 */
import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        String asaida = "";
        asaida = String.format("%.3f", triangulo).replaceAll(",", ".");
        System.out.println("TRIANGULO: " + asaida);
        asaida = String.format("%.3f", circulo).replaceAll(",", ".");
        System.out.println("CIRCULO: " + asaida);
        asaida = String.format("%.3f", trapezio).replaceAll(",", ".");
        System.out.println("TRAPEZIO: " + asaida);
        asaida = String.format("%.3f", quadrado).replaceAll(",", ".");
        System.out.println("QUADRADO: " + asaida);
        asaida = String.format("%.3f", retangulo).replaceAll(",", ".");
        System.out.println("RETANGULO: " + asaida);

        sc.close();
    }
}
