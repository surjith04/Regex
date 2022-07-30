package com.assignment;

import java.util.regex.Pattern;


/*
Validator class to validate the given Strings are Matching the Requirements
 */
public class Validator
{
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+([-][A-Za-z0-9]+)?([+][A-Za-z0-9]+)?([.][A-Za-z0-9]+)?[@][a-z0-9]+[.][a-z]{2,3}([.][a-z]{2,3})?$";
    private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[a-zA-Z0-9@$!%*?&]{8,12}$";
    /*
    ?=.* - means at least
     */

    /*
    isValidName function to return the User entered First Name string Matches the Regex or not
     */
    public static boolean isValidFirstName(String fName)
    {
        return Pattern.matches(NAME_REGEX,fName);
    }

    /*
    isValidName function to return the User entered Last Name string Matches the Regex or not
     */

    public static boolean isValidLastName(String lName)
    {
        return Pattern.matches(NAME_REGEX,lName);
    }

    /*
    isValidEmail function to return the User Entered Valid email ID or Not
     */

    public static boolean isValidEmail(String email)
    {
        return Pattern.matches(EMAIL_REGEX,email);
    }

    /*
    isValidPhoneNo function to return the User entered Last Name string Matches the Regex or not
     */

    public static boolean isValidPhoneNo(String phoneNo) { return Pattern.matches(PHONE_NUMBER_REGEX,phoneNo);}

    /*
    isValidPassword function to return the User entered Last Name string Matches the Regex or not
     */

    public static boolean isValidPassword(String passWord) { return Pattern.matches(PASSWORD_REGEX,passWord);}
}
