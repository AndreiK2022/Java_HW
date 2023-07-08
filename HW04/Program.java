package HW04;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадайте количество элементов списка: ");
        int num = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(100));
        } 
        scanner.close();
        
        System.out.println("\nДан список: " + list);

        reverseList(list);
    }

    static void reverseList(LinkedList x){

        LinkedList<Object> newList = new LinkedList<>();

        for (int i = x.size()-1; i >= 0; i--) {
            newList.add(x.get(i));
        }
        System.out.println("\nПеревернутый список: " + newList);
        System.out.println();

    }

}