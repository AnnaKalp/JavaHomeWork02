package org.example;

//Задача 2.
// К калькулятору из предыдущего дз добавить логирование.

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Scanner;
import java.util.logging.Level;


public class Task02 {
    public static void main(String[] args) throws IOException {
        int num1 = 0;
        int num2 = 0;
        Logger logger = Logger.getLogger(Task02.class.getName());
        FileHandler fh = new FileHandler("Task02.txt", true);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.addHandler(fh);

        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            num1 = scan.nextInt();
            logger.info("Первое введённое число: " + String.valueOf(num1));
        }catch (Exception e) {
            logger.log(Level.SEVERE,
                    "Неверно введённое первое число", e);
        }


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите оператор -, +, *, /: ");
        String operation = scan1.nextLine();
        logger.info("Оператор: " +  operation);


        try {
            System.out.println("Введите второе число: ");
            num2 = scan.nextInt();
            logger.info("Второе введённое число: " + String.valueOf(num2));
        }catch (Exception e) {
            logger.log(Level.SEVERE,
                    "Неверно введённое второе число", e);
        }

        switch (operation){
            case "+":
                System.out.println("Результат = " + (num1 + num2));
                logger.info("Результат: " +  (num1 + num2));
                break;
            case "-":
                System.out.println("Результат = " + (num1 - num2));
                logger.info("Результат: " +  (num1 - num2));
                break;
            case "*":
                System.out.println("Результат = " + (num1 * num2));
                logger.info("Результат: " +  (num1 * num2));
                break;
            case "/":
                System.out.println("Результат = " + (num1 / num2));
                logger.info("Результат: " +  (num1 / num2));
                break;
            default:
                System.out.println("такой операции нет");
                logger.info("такой операции нет: " +  operation);

        }
    }
}