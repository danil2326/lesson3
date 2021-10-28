import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
    }
    // mysteryNumbers();


    //Задание1
    public static void mysteryNumbers() {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        System.out.println("Компьютер загадал число от 0 до 9, угадайте число, у вас 3 попытки");
        for (int i = 0; i < 3; i++) {
            System.out.println("Попытка " + (i + 1) + ": ");
            int input = sc.nextInt();
            while (true) {
                if (input < number) {
                    System.out.println("Число больше");
                    break;
                }
                if (input > number) {
                    System.out.println("Число меньше");
                    break;
                }
                if (input == number) {
                    System.out.println("Вы угадали");

                }
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                input = sc.nextInt();
                if (input == 1) {
                    mysteryNumbers();
                } else System.out.println("Спасибо за игру");


            }


        }
    }
}



























