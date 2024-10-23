package org.example;

import java.util.Scanner;

public class ScannerConsole {



    public void scanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа через пробел");
        String result = scanner.nextLine();
        String[] numbers = result.trim().split(" ");
        if (numbers.length != 2) {
            System.out.println("Неверно задан диапазон чисел");
            return;
        }
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        if(a > b ) {
            System.out.println("Минимальное число не может быть больше максимального");
            return;
        }
        if(a<0||b<0){
            System.out.println("Минимальное или максимальное число не может быть меньше нуля");
            return;
        }

        if(b <= 1000000) {
            RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(a, b);
            randomNumberGenerator.generate();
        } else {
            System.out.println("Число не может быть больше 1 миллиона");
        }
    }

}
