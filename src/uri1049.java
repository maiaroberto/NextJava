/**
* @author Roberto Maia
* @disciplina NExT - Imersão Java
* @Fundamentos if/else e switch/case
* uri1049 Animal
 */
import java.util.Scanner;

public class uri1049 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String busca = a + " " + b + " " + c + " ";

        String[] tipoAnimal = { "vertebrado ave carnivoro ", "vertebrado ave onivoro ", "vertebrado mamifero onivoro ",
                "vertebrado mamifero herbivoro ", "invertebrado inseto hematofago ", "invertebrado inseto herbivoro ",
                "invertebrado anelideo hematofago ", "invertebrado anelideo onivoro ", };

        String[] animal = { "aguia", "pomba", "homem", "vaca", "pulga", "lagarta", "sanguessuga", "minhoca" };

        for (int i = 0; i < tipoAnimal.length; i++) {

            if (tipoAnimal[i].equals(busca)) {
                System.out.println(animal[i]);
                break;
            }
        }
        input.close();
    }
}
