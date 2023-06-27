package Lek01;
import java.util.Scanner;
/**
 * program
 */
public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();

        //System.out.println("bye, world!");
    }
    
}