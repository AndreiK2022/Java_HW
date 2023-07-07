package HW03;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;


public class Program {
    static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args)throws Exception {

        List nums = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums.add(random.nextInt(100));
        }     
        
        boolean f = true;
        while (f) {
            System.out.println("\nДан произвольный список целых чисел:");
            System.out.println(nums);
            System.out.println("\nВведите цифру для выполнения соответствующего действия: ");
            System.out.println("1 - Удалить четные числа");
            System.out.println("2 - Вывести минимальное значение");
            System.out.println("3 - Вывести максимальное значение");
            System.out.println("4 - Вывести среднее значение");
            System.out.println("0 - Завершить работу\n");
            System.out.println("============================================\n");
            int num = scanner.nextInt();

            switch(num){

                case 1:
                    task1(nums);
                    System.out.println("\nПриложение завершено! Перезапустите программу для работы с новым списком.\n");
                    f = false;
                    break;
                case 2:
                    System.out.println("\nМинимальное значение: " + Collections.min(nums));
                    break;
                case 3:
                    System.out.println("\nМаксимальное значение: " + Collections.max(nums));
                    break;
                case 4:
                    task4(nums);
                    break;
                case 0:
                    System.out.println("\nПриложение завершено!\n");
                    f = false;
                    break;
            }
        }
    }

        static void task4(List x){
            double average = 0;
            if (x.size() > 0){
                double sum = 0;
                for (int j = 0; j < x.size(); j++) {
                    sum += (int) x.get(j);
                }
            average = sum / x.size();
        System.out.println("\nСреднее значение: " + average);
}


       }

        static void task1(List x)throws Exception{
            Iterator iterator = x.iterator();
            while (iterator.hasNext()) {
                int num = (int) iterator.next();
                if (num % 2 == 0) {
                    iterator.remove();   
                }
            }
            System.out.println("Все четные элементы удалены: ");
            System.out.println(x);
        }
}



   








        
 

