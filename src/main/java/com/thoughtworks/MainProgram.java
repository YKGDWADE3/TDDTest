package com.thoughtworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("输入学生个数： ");
            try {
                int count = input.nextInt();
                FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
                fizzBuzzGame.start(count);
            } catch (InputMismatchException i) {
                System.out.println("输入不合法，请重新输入");
            }

        }


    }
}
