package com.project;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out .println("Enter first number : ");
        int a = scanner.nextInt();

        System.out .println("Enter second number : ");
        int b = scanner.nextInt();

        System.out .println("Enter math symbol : ");
        scanner.nextLine();
        char math = scanner.nextLine().charAt(0);

        int res = 0;
        switch (math){
            case'+':
                res = a +b;
                System.out.println("Result : " + res);
                break;
            case'-':
                res = a - b;
                System.out.println("Result : " + res);
                break;
            case'*':
                res = a * b;
                System.out.println("Result : " + res);
                break;
            case'/':
                if (b == 0) System.out.println("You cant divide by zero!");
                else{
                    res = a / b;
                    System.out.println("Result : " + res);
                    break;
                }
            default:System.out.println("Your character is invalid");break;


        }

    }
}
