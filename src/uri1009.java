/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1009 Salário com Bônus
 */
import java.util.Scanner;

public class uri1009 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       // var nome = input.nextLine(); 
        double fixo = input.nextDouble();
        double vendas = input.nextDouble();
        
        double salary = fixo + (vendas * 0.1500); 

        System.out.println("TOTAL = R$ " + String.format("%.2f", salary));
        
        input.close();
    }
}
