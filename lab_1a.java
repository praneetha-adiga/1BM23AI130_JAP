package Praneetha_adiga;

import java.sql.SQLOutput;
import java.util.*;
public class lab_1a {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Gym Membership Management System!");
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the age of the member");
        int age = sc.nextInt();
        System.out.println("Enter the status of the membership(true/false):");
        boolean membership_status = sc.nextBoolean();
        System.out.println("Enter the duration of membership(in months):");
        int duration = sc.nextInt();
        double fee = 50.00 * duration;
        System.out.println("The name of the member is " + name);
        System.out.println("The age of the member is " + age);
        System.out.println("The membership status of the member is " + membership_status);
        System.out.println("The duration of the member is " + duration);
        System.out.println("The fee for the member is " + fee);

    }
}
