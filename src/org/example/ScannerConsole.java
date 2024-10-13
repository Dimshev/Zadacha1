package org.example;

import java.util.Scanner;

public class ScannerConsole {



    public void scanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = scanner.nextInt();

        System.out.println("Введите второе число");
        int b = scanner.nextInt();

        if(a > b ) {
            System.out.println("Минимальное число не может быть больше максимального");
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
