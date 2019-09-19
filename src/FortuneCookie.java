import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;


public class FortuneCookie {
    public static void main(String[] args)throws IOException {

        var fileName = "fortunes.txt";
        String all_fortunes = Files.readString(Paths.get(fileName));
        String[] fortune_list = all_fortunes.split("\n");
        var randGenerator = new Random();
        var reader = new Scanner(System.in);
        var number = randGenerator.nextInt(20);
        System.out.println("How many fortunes would you like?");
        int f = reader.nextInt();

        for(int i = 0; i < f; i++){
            number = randGenerator.nextInt(20);
            System.out.println((i+1) + ") " + fortune_list[number]);

        }


    }
}   