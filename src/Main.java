package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));
        System.out.println("Задача 1");
        System.out.println(" ");

        int sum = 0;
        for (int expence : expenses) {
            sum += expence;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");

        System.out.println(" ");
        System.out.println("Задача 2");
        System.out.println(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int expense : expenses) {
            if (expense > max) {
                max = expense;
            }
            if (expense < min) {
                min = expense;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила: " + max + " рублей");

        System.out.println(" ");
        System.out.println("Задача 3");
        System.out.println(" ");

        double averageAmount = (double) sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц составила: " + averageAmount + " рублей");

        System.out.println(" ");
        System.out.println("Задача 4");
        System.out.println(" ");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
                    }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_00) + 100_000;
            }
        return arr;
    }}
