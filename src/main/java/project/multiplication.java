package project;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int number,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print multiplication table");
        number= sc.nextInt();
        for (i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
}
