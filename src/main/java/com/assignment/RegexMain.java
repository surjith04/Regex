package com.assignment;

import java.util.Scanner;

public class RegexMain
{
    /*
    Main Function to Get the firstName from the User
     */
    public static void main(String[] args) {
        RegexModel regex = new RegexModel();
        System.out.println("Welcome To Regex Problem");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String fName = sc.nextLine();
        regex.setFirstName(fName);
        System.out.println("Enter Last Name : ");
        String lName = sc.nextLine();
        regex.setLastName(lName);
        System.out.println("Enter Phone Number : ");
        String phoneNo = sc.nextLine();
        regex.setPhoneNo(phoneNo);
        System.out.println("Enter Email ID : ");
        String email = sc.next();
        regex.setEmailId(email);
        System.out.println("Enter Password : ");
        String pwd = sc.next();
        regex.setPassWord(pwd);
        System.out.println(regex);

        System.out.println("\nChecking Emails\n");
        regex.setMail("abc@yahoo.com");
        regex.setMail("abc-100@yahoo.com");
        regex.setMail("abc.100@yahoo.com");
        regex.setMail("abc111@abc.com");
        regex.setMail("abc-100@abc.net");
        regex.setMail("abc.100@abc.com.au");
        regex.setMail("abc@1.com");
        regex.setMail("abc@gmail.com.com");
        regex.setMail("abc+100@gmail.com");



    }
}
