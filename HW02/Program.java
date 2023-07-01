package HW02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Program {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        boolean f = true;
        while (f) {
            System.out.println("\n- Укажите номер задачи (1, 2 или 4): ");
            System.out.println("- Для завершения работы приложения введите 0\n");
            System.out.println("============================================\n");
            int num = scanner.nextInt();;
            
            switch(num){

                case 1:
                    task1("\nselect * from students where ");
                    break;
                case 2:
                    task2();
                    break;
                case 4:
                    task4();
                    break;
                case 0:
                    System.out.println("\nПриложение завершено!\n");
                    f = false;
                    break;
            }
        }
    }
 
    static void task1(String s) throws Exception{

        // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
        // используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        
        Map<String, String> students = new HashMap<String, String>();
        students.put("name", "Ivanov");
        students.put("country", "Russia");
        students.put("city", "Moscow");
        students.put("age", "null");
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, String> e : students.entrySet()){
            if (e.getValue() != "null") {
                sb.append(e.getKey()+" = "+"'"+e.getValue()+"'" + " AND ");
            }
        }
        sb.delete(58, 62);

        System.out.println(s + sb + "\n");
    }

    static void task2() throws Exception{

        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler fh = new FileHandler("log_task2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        //Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите количество цифр в массиве: ");
        int k = scanner.nextInt();
        System.out.println();
        int[] arr = new int[k];
        //scanner.close();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    count = count + 1;
                    logger.info("Итерация "+count);
                }
            }
        }
        System.out.println();
        for (int item : arr) {
            System.out.print(item + " ");
            
        }
        System.out.print("\n");
        System.out.println();
    }

    static void task4() throws Exception{

        Logger logger = Logger.getLogger(Program.class.getName());
        FileHandler fh = new FileHandler("log_task4.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите целое число 1: ");
        int num1 = scanner.nextInt();
        logger.info("Введено: " + num1);
        System.out.print("\nВведите целое число 2: ");
        int num2 = scanner.nextInt();
        logger.info("Введено: " + num2);
        System.out.print("\nВведите символ операции (+, -, * или /): \n");
        String act = scanner.next();
        logger.info("Операция: " + act);
        //scanner.close();
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

       
    
        




