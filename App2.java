import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el id del personaje que quieras conocer (1-826):");
        int id = scanner.nextInt();
        Character [] personajes= new Character[10];
            Character character = ApiUtil.getCharacterById(id);
            System.out.println("Nombre:" + character.name);
            System.out.println("Estado:"  + character.status);
            System.out.println("Episodio:"  + character.episode.size());
            System.out.println("Imagen:"  + character.image);
            System.out.println("Imagen:"  + character.image);
            System.out.print("Introduce el id del personaje que quieras conocer (1-826):");
            int id2 = scanner.nextInt();
            Character character2 = ApiUtil.getCharacterById(id2);
            System.out.println("Nombre:" + character.name);
            System.out.println("Estado:"  + character.status);
            System.out.println("Episodio:"  + character.episode.size());
            System.out.println("Imagen:"  + character.image);
       
    }
}
