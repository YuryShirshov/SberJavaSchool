package ru.sber.javaschool.lesson2;

public class Calculator {

    public double getSum(double a, double b) {
        return a + b;
    }

    public double getSubstraction(double a, double b) {
        return a - b;
    }

    public double getMultiply(double a, double b) {
        return a * b;
    }

    public double getDivide(double a, double b) {
        return a / b;
    }

    public double getMod(double a, double b){
        return a % b;
    }

    public double getMax(double a, double b) {
        return a >= b ? a : b;
    }

    public double getMin(double a, double b) {
        return a < b ? a : b;
    }

    public boolean isEquals(double a, double b) {
        return a == b;
    }
}
