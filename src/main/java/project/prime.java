package project;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int n1,n2,i,j;
        System.out.println("Enter two number");
        Scanner r=new Scanner(System.in);
        n1= r.nextInt();
        n2=r.nextInt();
        for( i=n1;i<=n2;i++)
        {
            for( j=2;j<=i;j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(j);
        }
    }
}
