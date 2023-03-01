import java.util.Random;
import java.util.Scanner;

/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class RandomGuess {
    public static void main(String[] args) {
        System.out.println("Minimum value");
        Scanner s = new Scanner(System.in);
        int min = s.nextInt();
        System.out.println("Maximum value");
        int max = s.nextInt();
        System.out.println("Your guess");
        int guess = s.nextInt();
        Random r = new Random();
        int range = r.nextInt(max-min)-min;
        System.out.println("Random Number");
        System.out.println(range);
        System.out.print("Your guess was: ");
        System.out.println(range == guess);

    }
}
