
/**
 * @author Roberto Maia
 * @category NExT - Imersão Java
 * @aula 01 de 30/08/2021 
 * @class 
 */
import java.util.Scanner;

public class uri1046 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Double a = input.nextDouble();
    Double b = input.nextDouble();
    Double c = input.nextDouble();

    Double delta = 0.0;
    Double raiz_delta = 0.0;
    Double x1 = 0.0;
    Double x2 = 0.0;

    delta = (Math.pow(b, 2)) - (4 * a * c);

    if ((delta < 0) || (a == 0)) {
      System.out.println("Impossivel calcular");
    } 
    else {
      raiz_delta = Math.sqrt(delta);
      x1 = ((b * -1) + raiz_delta) / (2 * a);
      x2 = ((b * -1) - raiz_delta) / (2 * a);
      System.out.println("R1 = " + String.format("%.5f", x1).replaceAll(",", "."));
      System.out.println("R2 = " + String.format("%.5f", x2).replaceAll(",", "."));
    }
    input.close();
  }
}

/*
 * import math
 * 
 * while True: try: a, b, c = list(map(float, input().split())) delta = (b ** 2)
 * - (4 * a * c) raiz_delta = math.sqrt(delta) x1 = ((b*-1) + raiz_delta) / (2 *
 * a) x2 = ((b*-1) - raiz_delta) / (2 * a) print(f'R1 = {x1:.5f}') print(f'R2 =
 * {x2:.5f}') break except: print(f'Impossivel calcular') break
 */