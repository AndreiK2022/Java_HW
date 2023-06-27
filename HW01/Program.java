package HW01;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean f = true;
        while (f) {
            System.out.println("\n- Укажите номер задачи от 1 до 3: ");
            System.out.println("- Для завершения работы приложения введите 0\n");
            System.out.println("============================================\n");
            int num = scanner.nextInt();;

            switch(num){

                case 1:
                    task1();
                    break;
                case 2:
                    task2(1000);
                    break;
                case 3:
                    task3();
                    break;
                case 0:
                    System.out.println("\nПриложение завершено!\n");
                    f = false;
                    break;
            }
        }
    }
    static void task1(){
        System.out.print("\nВведите число n: ");
        int n = scanner.nextInt();
        int summ = n*(n+1)/2;
        System.out.println("Сумма чисел до n равна: "+summ);
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        System.out.println("Произведение чисел от 1 до n равно: "+prod);
        }

    static void task2(int n){
        System.out.print("\nВсе простые числа от 1 до 1000: ");
        boolean k = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                    
                if (i%j == 0) {
                    k = false;
                    break;
                }
            }
            if(k) System.out.print(i+" ");
            else k = true;
        }  
    }

    static void task3(){
        System.out.print("\nВведите целое число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("\nВведите целое число 2: ");
        int num2 = scanner.nextInt();
        System.out.print("\nВведите символ операции (+, -, * или /): \n");
        String act = scanner.next();
        float res = 0;
        switch (act) {
            case "+":
                res = num1 + num2;
                System.out.printf("%d %s %d = %1.0f\n", num1, act, num2, res);
                break;
            case "-":
                res = num1 - num2;
                System.out.printf("%d %s %d = %1.0f\n", num1, act, num2, res);
                break;
            case "*":
                res = num1 * num2;
                System.out.printf("%d %s %d = %1.0f\n", num1, act, num2, res);
                break;
            case "/":
                res = num1 / num2;
                System.out.printf("%d %s %d = %1.0f\n", num1, act, num2, res);
                break;
            default:
                break;
        }
    }

}





