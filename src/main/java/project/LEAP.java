package project;

public class LEAP{
    public static void main(String[] args) {
        int years=2021;
        if(years%100==0)
        {
            System.out.println("Leap years");
        }
        else if(years%4==0 && years%100!=0)
        {
            System.out.println("Leap years");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }

}
