package com.pb.gluhockiy.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.println("Необходимо ввести первое целое число:");
        operand1 = scan.nextInt();
        System.out.println("Необходимо ввести второе целое число:");
        operand2 = scan.nextInt();
        System.out.println("Введите знак + или - или / или *");
        sign = scan.next();
        switch (sign) {
            case "+":
                System.out.println(operand1+operand2);
                break;
            case "-":
                System.out.println(operand1-operand2);
                break;
            case "*":
                System.out.println(operand1*operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.print("Ошибочка вышла! Операция невыполняемая!"); }
                else    {
                    System.out.println(operand1/operand2); }
                break;
            default:
                System.out.println("Неверно указанный знак");

        }



    }
}
