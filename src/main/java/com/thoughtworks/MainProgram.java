package com.thoughtworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("输入学生个数： (输入0则退出)");
            try {
                int count = input.nextInt();
                if (count == 0) {
                    System.exit(0);
                } else {
                    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
                    fizzBuzzGame.start(count);
                }
            } catch (InputMismatchException i) {
                System.out.println("输入错误！");
            }

        }


    }
}
