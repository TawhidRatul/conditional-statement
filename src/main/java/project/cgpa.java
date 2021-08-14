package project;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter roll number,");
        int rno = in.nextInt();
        System.out.println("Enter name");
        String name =in.next();
        System.out.println("Enter the mark of S1");
        int s1 = in.nextInt();
        System.out.println("Enter the mark of s2");
        int s2 = in.nextInt();
        System.out.println("Enter the mark of s3");
        int s3 = in.nextInt();
        System.out.println("Enter the mark of s4");
        int s4 = in.nextInt();
        int tot = s1+s2+s3+s4;
        int avg = tot/4;
        if(avg>=80)
        {
            System.out.println("your grade is A+");
        }
        else if (avg >=70)
        {
            System.out.println("your grade is A");
        }
        else if(avg >=60)
        {
            System.out.println("your grade is B+");
        }
        else if (avg >=50)
        {
            System.out.println("Your grade is B");
        }
        else
        {
            System.out.println("check again");
        }
    }
}
