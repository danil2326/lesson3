import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
         mysteryNumbers();
    }
    
   

    //Задание1
   public static void mysteryNumbers() {
            Scanner sc = new Scanner(System.in);
            int input = (int) (Math.random() * 10);
            int number = (int) (Math.random() * 10);
            System.out.println("Компьютер загадал число от 0 до 9, угадайте число, у вас 3 попытки");
            for (int i = 0; i < 3; i++) {
                System.out.println("Попытка " + (i + 1) + ": ");
                input = sc.nextInt();
                if (input < number)
                    System.out.println("Число больше");
                if (input > number)
                    System.out.println("Число меньше");
                if (input == number) {
                    System.out.println("Вы угадали");
                    System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                    input = sc.nextInt();
                    if (input == 1) {
                        mysteryNumbers();
                    } else {
                        System.out.println("Спасибо за игру");
                        break;
                    }
                }
            }
            System.out.println("Вы не угадали :(");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            input = sc.nextInt();
            if (input == 1) mysteryNumbers();
            else {
                System.out.println("Спасибо за игру!");
            }
        }
    }


























