package ru.sber.javaschool;

import ru.sber.javaschool.lesson2.Calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        Calculator calculator = new Calculator();
        System.out.println(first + " + " + second + " = " + calculator.getSum(first, second));
        System.out.println(first + " - " + second + " = " + calculator.getSubstraction(first, second));
        System.out.println(first + " * " + second + " = " + calculator.getMultiply(first, second));
        System.out.println(first + " / " + second + " = " + calculator.getDivide(first, second));
        System.out.println(first + " mod " + second + " = " + calculator.getMod(first, second));
        System.out.println("max value: " + calculator.getMax(first, second));
        System.out.println("min value: " + calculator.getMin(first, second));
        System.out.println(first + " equals " + second + " = " + calculator.isEquals(first, second));
    }
}
