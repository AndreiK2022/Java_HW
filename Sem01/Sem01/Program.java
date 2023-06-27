package Sem01;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean f = true;
        while (f) {
            System.out.println("\n- Укажите номер задачи от 1 до 3: ");
            System.out.println("- Для завершения работы приложения введите 0\n");
            System.out.println("============================================\n");
            int num = Integer.parseInt(scanner.nextLine());

            switch(num){

                case 1:
                    printName();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3("добро пожаловать на курс по Java");
                    break;
                case 0:
                    System.out.println("\nПриложение завершено!");
                    f = false;
                    break;
            }
        }
    }
    static void printName(){ // void - метод ничего не возвращает
        //int i = 34;
        //double j = 23.33;
        System.out.print("\nВведите имя: ");
        String name = scanner.nextLine();
        System.out.println("\nПривет, " + name + "!\n");
        //System.out.printf("Привет, %s ! %d %f\n", name, i, j);  // %.2s или %.2f - количество символов в выводе
    }

// Дан массив двоичных чисел. Вывести макс. количество идущих подряд 1.

    static void task2(){

        int[] array = {1, 0, 1, 1, 1, 0, 0, 1, 1};
        int max = 0;
        int count = 0;
        for (int i : array) {
            if (i == 1){
                count++;
            }
        else{
            if (count > max){
                max = count;
            }
            count = 0;
        }
    }
    System.out.printf("макс. кол-во единиц: %d\n", max);
}

// Во фразе "добро пожаловать на курс по Java" переставить слова в обратном порядке

    static void task3(String str){
        String[] words = str.split(" ");
        for (int i = words.length-1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }

}
