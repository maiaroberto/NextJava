/**
 * @author Roberto Maia
 * @disciplina NExT - Imersão Java
 * @Fundamentos - Variáveis/Operadores/Input/Output
 * uri1011 Esfera
 */
import java.util.Scanner;

public class uri1011 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double raio = input.nextDouble();
                
        double volume = (4.0/3) *  3.14159 * (raio * raio * raio);

        System.out.println("VOLUME = " + String.format("%.3f", volume));
        
        input.close();
    }
}
