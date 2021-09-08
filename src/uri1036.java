
/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case
* uri1036 Fórmula de Bhaskara
 */
import java.util.Scanner;

public class uri1036 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    Double a = input.nextDouble();
    Double b = input.nextDouble();
    Double c = input.nextDouble();
    Double delta = Math.pow(b,2) - (4 * a * c);

    if ((delta < 0) || (a == 0)) {
      System.out.println("Impossivel calcular");
    } else {
      double raiz_delta = Math.sqrt(delta); 
      double x1 = ((b*-1) + raiz_delta) / (2 * a);
      double x2 = ((b*-1) - raiz_delta) / (2 * a);
        
      System.out.println("R1 = " + String.format("%.5f", x1).replaceAll(",", "."));
      System.out.println("R2 = " + String.format("%.5f", x2).replaceAll(",", "."));
    }

    input.close();
  }
}

/*

    delta = (b ** 2) - (4 * a * c)
    raiz_delta = math.sqrt(delta) 
    x1 = ((b*-1) + raiz_delta) / (2 * a)
    x2 = ((b*-1) - raiz_delta) / (2 * a)
    print(f'R1 = {x1:.5f}')
    print(f'R2 = {x2:.5f}')
    break
  except:
    print(f'Impossivel calcular')
    break


 */