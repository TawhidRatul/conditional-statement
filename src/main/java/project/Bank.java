package project;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        int balance = 10000, withdraw = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for check balance");
            System.out.println("choose 3 for exit");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter money to be withdraw : ");
                    if (balance >= withdraw) {

                        balance = balance - withdraw;
                        System.out.println("collect your money");
                    }
                    else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("balance : "+balance);
                    System.out.println(" ");
                    break;

                case 3:
                    System.exit(0);
                    }
            }
        }
    }
