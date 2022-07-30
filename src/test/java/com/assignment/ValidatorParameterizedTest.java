package com.assignment;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

/*
ValidatorParameterizedTest is a Parameterized Test Class the more than one Values with
Expected Result
 */
@RunWith(Parameterized.class)
public class ValidatorParameterizedTest
{
    private String email;
    private boolean expectedResult;

    /*
    All Args Constructor to assign the Values
     */
    public ValidatorParameterizedTest(String email , boolean expectedResult)
    {
        this.email = email;
        this.expectedResult = expectedResult;
    }

    /*
    emailList funtion to return List of Email Ids and its expected Results
     */
    @Parameterized.Parameters
    public static List emailList()
    {
        Object[][] emailArray = {
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo@com",false},
                {"abc$111@abc.com",false},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"aabc+100@gmail.com",true},
                {"abc-def123@@gmail.com",false}
        };
        return Arrays.asList(emailArray);
    }

    /*
    givenEmailWhenCheckReturnEmailValidOrNot Method to Run the Test
     */
    @Test
    public void givenEmailWhenCheckReturnEmailValidOrNot()
    {
        boolean result = Validator.isValidEmail(this.email);
        Assertions.assertEquals(this.expectedResult,result);
    }
}