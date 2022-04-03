package com.bridgelabz.UserReg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static String validFirstName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$"; //        name Start with caps Abhilash ,and having 1 caps and min 2 small character
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r) {
            return "First Name is Valid";
        }
        else
            return "First Name is not Valid";
    }

    public static String validLastName(String name) {
        String regex = "^[A-Z]{1}[a-z]{2,}$"; //        name Start with caps Abhilash ,and having 1 caps and min 2 small character
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            return "Last Name is Valid";
        else
            return "Last Name is not Valid";
    }

    public static String validEmail(String email) {
        String regex2 = "^[A-Za-z0-9+_.-]+@(.+)$";  // Abhilash.kolte@gmail.com abhilash.kolte@gmail.com ABHILASH.KOLTE@GMAIL.COM Abhilash12.ko12@gmail.com
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(email);
        boolean r2 = m2.matches();
        if (r2)
            return "Email is Valid";
        else
            return "Email is not Valid";
    }

    public static String validMobileNumber(String phoneNo){
        String regex3 = "^[0-9]{2}\\s{0,1}[0-9]{10}$"; //With-Space And Without Space Valid 19881236547Space is Valid 91 8830312365
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(phoneNo);
        boolean r3 = m3.matches();
        if (r3)
            return "Phone number is Valid";
        else
            return "Phone number is Invalid";
    }

    public static String validPassword(String password){
        String regex4 = "[a-zA-Z0-9]{8,}";  // alpha Numerical with length 8
        Pattern p4 = Pattern.compile(regex4);
        Matcher m4 = p4.matcher(password);
        boolean r4 = m4.matches();
        if (r4)
            return "Password is Valid";
        else
            return "Password is Invalid";
    }
}